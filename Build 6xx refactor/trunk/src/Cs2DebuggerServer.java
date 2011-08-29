
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by IntelliJ IDEA.
 * User: Peter
 * Date: 1/30/11
 * Time: 10:34 PM
 * Computer: Peterbjornx-PC.rootdomain.asn.local (192.168.178.27)
 */
public class Cs2DebuggerServer implements Runnable{
    /* Debugger Fields */
    private HashMap<Integer,LinkedList<Integer>> breakpoints = new HashMap<Integer, LinkedList<Integer>>();
    /* Server Fields */
    private ServerSocket serverSocket;
    private Thread ioThread;
    private Thread inputThread;
    private boolean acceptorStarted = false;
    private static final int DBG_PORT = 43600;
    private final Queue<Cs2DebuggerMessage> outQueue = new LinkedList<Cs2DebuggerMessage>();
    private final Queue<Cs2DebuggerMessage> inQueue = new LinkedList<Cs2DebuggerMessage>();
    private int waitingOpcode = -1;
    private int expectedSize = -1;
    private boolean running = true;
    private boolean resume = false;


    public Cs2DebuggerServer() {
        try {
            serverSocket = new ServerSocket(DBG_PORT);
            ioThread = new Thread(this);
            ioThread.setName("[ClientScript2 Debugging Server] Acceptor");
            ioThread.start();
            while (!acceptorStarted)
                try {
                    Thread.sleep(10);
                } catch (InterruptedException ignored) {
                }
            inputThread = new Thread(this);
            inputThread.setName("[ClientScript2 Debugging Server] Input decoder");
            inputThread.start();
        } catch (IOException e) {
            System.err.println("[CS2DEBUGGER] Could not bind to port " + DBG_PORT);
        }
    }

    public boolean isBreakpoint(int script, int address){
        return breakpoints.containsKey(script) && breakpoints.get(script).contains(address);
        }

        public void submitMessage(Cs2DebuggerMessage msg){
            synchronized (outQueue){
                outQueue.add(msg);
            }
        }

    public void run() {
        if (!acceptorStarted){
            acceptorStarted = true;
            try {
                System.out.println("[CS2DEBUGGER] ClientScript2 Debugger Server Running on 0.0.0.0:"+DBG_PORT);
                Socket sock = serverSocket.accept();
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
                                    inQueue.add(new Cs2DebuggerMessage(opcode,scriptId,data));
                                }
                            }
                        }
                        while (!outQueue.isEmpty()){
                            Cs2DebuggerMessage msg;
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
                breakpoints.clear();
                System.gc();
            } catch (Exception e){
                System.err.println("[CS2DEBUGGER] Error accepting connection");
            }
        } else {
            while(running){
                long startTime = System.currentTimeMillis();
                while (!inQueue.isEmpty()){
                    try {
                        Cs2DebuggerMessage msg;
                        synchronized(inQueue){
                            msg = inQueue.remove();
                        }
                        DataInputStream dIS = new DataInputStream(new ByteArrayInputStream(msg.getData()));
                        switch (msg.getOpcode()){
                            case 0://Init debugging for script
                                breakpoints.put(msg.getScriptId(), new LinkedList<Integer>());
                                break;
                            case 1:
                                breakpoints.get(msg.getScriptId()).add(dIS.readInt());
                                break;
                            case 2:
                                resume = true;
                        }
                    } catch (Exception e){
                        System.err.println("[CS2DEBUGGER] Warning: Packet dropped");
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

    public void waitBreakpoint(){
        while (!resume)
            try {
                Thread.sleep(10);
            } catch (InterruptedException ignored) {}
        resume = false;
    }

    public void shutdown(){
        running = false;
        try {
            ioThread.join();
            serverSocket.close();
            inputThread.join();
        } catch (Exception ignored) {
        }
    }
}
