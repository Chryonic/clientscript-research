package co.cc.peterbjornx.cs2ide.debugger;

import java.io.*;
import java.net.Socket;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by IntelliJ IDEA.
 * User: Peter
 * Date: 1/31/11
 * Time: 12:21 AM
 * Computer: Peterbjornx-PC.rootdomain.asn.local (192.168.178.27)
 */
public class DebuggerClient implements Runnable{
    private Socket sock;
    private boolean running = true;
    private Thread ioThread;
    private Thread inputThread;
    private final Queue<DebuggerMessage> outQueue = new LinkedList<DebuggerMessage>();
    private final Queue<DebuggerMessage> inQueue = new LinkedList<DebuggerMessage>();
    private int expectedSize = -1;
    private int waitingOpcode = -1;
    private boolean acceptorStarted = false;
    private String lastException= null;
    private State state = null;


    public DebuggerClient(String server) {
        try {
            sock = new Socket(server,43600);
            ioThread = new Thread(this);
            ioThread.setName("[ClientScript2 Debugging Client] IO");
            ioThread.start();
            while (!acceptorStarted)
                try {
                    Thread.sleep(10);
                } catch (InterruptedException ignored) {
                }
            inputThread = new Thread(this);
            inputThread.setName("[ClientScript2 Debugging Client] Input decoder");
            inputThread.start();
        } catch (IOException e) {
            System.err.println("[CS2DEBUGGER] Could not connect");
        }
    }

    public void shutdown(){
        running = false;
        try {
            ioThread.join();
            sock.close();
            inputThread.join();
        } catch (Exception ignored) {
        }
    }

    public void resume(){
        submitMessage(new DebuggerMessage(2, 0, new byte[0]));
    }

    public void setBreakpoint(int script,int address){
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            DataOutputStream dOS = new DataOutputStream(bos);
            dOS.writeInt(address);
            dOS.flush();
            bos.flush();
            submitMessage(new DebuggerMessage(1, script, bos.toByteArray()));
        } catch (IOException e) {
            System.err.println("[CS2DEBUGGER] Error sending breakpoint state");
        }
    }

    public void clearBreakpoint(int script,int address){
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            DataOutputStream dOS = new DataOutputStream(bos);
            dOS.writeInt(address);
            dOS.flush();
            bos.flush();
            submitMessage(new DebuggerMessage(3, script, bos.toByteArray()));
        } catch (IOException e) {
            System.err.println("[CS2DEBUGGER] Error sending breakpoint state");
        }
    }

    public void setOpBreakpoint(int script,int address){
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            DataOutputStream dOS = new DataOutputStream(bos);
            dOS.writeInt(address);
            dOS.flush();
            bos.flush();
            submitMessage(new DebuggerMessage(4, script, bos.toByteArray()));
        } catch (IOException e) {
            System.err.println("[CS2DEBUGGER] Error sending breakpoint state");
        }
    }

    public void clearOpBreakpoint(int script,int address){
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            DataOutputStream dOS = new DataOutputStream(bos);
            dOS.writeInt(address);
            dOS.flush();
            bos.flush();
            submitMessage(new DebuggerMessage(5, script, bos.toByteArray()));
        } catch (IOException e) {
            System.err.println("[CS2DEBUGGER] Error sending breakpoint state");
        }
    }

    public void initScript(int id){
        submitMessage(new DebuggerMessage(0, id, new byte[0]));
    }

    public void drop(){
        submitMessage(new DebuggerMessage(6, 0, new byte[0]));
    }

    public void submitMessage(DebuggerMessage msg){
        synchronized (outQueue){
            outQueue.add(msg);
        }
    }

    public DebuggerMessage receiveMessage(){
        synchronized (inQueue){
            return inQueue.remove();
        }
    }

    public void run() {
        if (!acceptorStarted){
            acceptorStarted = true;
            try {
                try {
                    DataInputStream dIS = new DataInputStream(sock.getInputStream());
                    DataOutputStream dOS = new DataOutputStream(sock.getOutputStream());
                    while(running){
                        long startTime = System.currentTimeMillis();
                        if ((!sock.isConnected()) || sock.isClosed() || sock.isInputShutdown() || sock.isOutputShutdown())
                            break;
                        if (dIS.available() != 0 && (dIS.available() >= expectedSize || waitingOpcode == -1)){
                            int opcode;
                            int size;
                            if (waitingOpcode == -1){
                                opcode = dIS.readByte() & 0xFF;
                                size = dIS.readInt();
                                if (dIS.available() < size){
                                    expectedSize = size;
                                    waitingOpcode = opcode;
                                } else {
                                    waitingOpcode = expectedSize = -1;
                                }
                            } else {
                                opcode = waitingOpcode;
                                size = expectedSize;
                                waitingOpcode = expectedSize = -1;
                            }
                            if (waitingOpcode == -1){
                                byte[] data = new byte[size - 1];
                                int scriptId = dIS.readInt();
                                dIS.readFully(data);
                                synchronized(inQueue){
                                    inQueue.add(new DebuggerMessage(opcode,scriptId,data));
                                }
                            }
                        }
                        while (!outQueue.isEmpty()){
                            DebuggerMessage msg;
                            synchronized(outQueue){
                                msg = outQueue.remove();
                            }
                            byte[] data = msg.getData();
                            dOS.writeByte(msg.getOpcode());
                            dOS.writeInt(data.length + 1);
                            dOS.writeInt(msg.getScriptId());
                            dOS.write(data);
                            dOS.flush();
                        }
                        long timeTaken = System.currentTimeMillis() - startTime;
                        if (timeTaken < 50)
                            try {
                                Thread.sleep(50-timeTaken);
                            } catch (InterruptedException ignored){}

                    }
                } catch (Exception e){
                    System.err.println("[CS2DEBUGGER] Connection drop or error in client handler!");
                }
                /* Add post-session cleanup here */
                System.gc();
            } catch (Exception e){
                System.err.println("[CS2DEBUGGER] Error accepting connection");
            }
        } else {
            while(running){
                long startTime = System.currentTimeMillis();
                while (!inQueue.isEmpty()){
                    try {
                        DebuggerMessage msg;
                        synchronized(inQueue){
                            msg = inQueue.remove();
                        }
                        DataInputStream dIS = new DataInputStream(new ByteArrayInputStream(msg.getData()));
                        switch (msg.getOpcode()){
                            case 0://Init debugging for script
                                lastException = dIS.readUTF();
                                state = new State(dIS);
                                break;
                            case 1:
                                state = new State(dIS);
                                break;
                        }
                    } catch (Exception e){
                        System.err.println("[CS2DEBUGGER] Warning: Packet dropped");
                        e.printStackTrace();
                    }
                }
                long timeTaken = System.currentTimeMillis() - startTime;
                if (timeTaken < 50)
                    try {
                        Thread.sleep(50-timeTaken);
                    } catch (InterruptedException ignored) {}
            }
        }
    }

    public String getLastException() {
        return lastException;
    }

    public State getState() {
        return state;
    }
}
