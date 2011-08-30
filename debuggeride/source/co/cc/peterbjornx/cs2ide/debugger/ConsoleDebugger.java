package co.cc.peterbjornx.cs2ide.debugger;

import co.cc.peterbjornx.cs2ide.re.AssemblyTab;
import mgi.tools.jagcsc.abstractcode.Script;
import mgi.tools.jagcsc.analyzer.CS2Function;
import mgi.tools.jagcsc.tokens.StringToken;

import javax.swing.*;
import java.awt.datatransfer.StringSelection;
import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.management.GarbageCollectorMXBean;

/**
 * Created by IntelliJ IDEA.
 * User: Peter
 * Date: 1/31/11
 * Time: 12:32 AM
 * Computer: Peterbjornx-PC.rootdomain.asn.local (192.168.178.27)
 */
public class ConsoleDebugger {
    public static void main(String[] args) {
        int script = 0;
        System.out.println("ClientScript2 Console Debugger\nAuthor: Peter Bosch");
        DebuggerClient c = new DebuggerClient("127.0.0.1");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        JFrame v = new JFrame("ClientScript2 Debugger Frame");
        v.setVisible(true);
        AssemblyTab at = new AssemblyTab();
        v.add(at.getPanel1());
        v.setResizable(true);
        while (true){
            System.out.print(">");
            String s = null;
            try {
                s = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            }
            String[] ss = s.split(" ");
            if (ss[0].equalsIgnoreCase("quit")){
                c.drop();
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
                }
                c.shutdown();
                break;
            } else if (ss[0].equalsIgnoreCase("script")){
                script = Integer.parseInt(ss[1]);
                c.initScript(script);
            } else if (ss[0].equalsIgnoreCase("break")){
                c.setBreakpoint(script, Integer.parseInt(ss[1]));
            } else if (ss[0].equalsIgnoreCase("clrbrk")){
                c.clearBreakpoint(script, Integer.parseInt(ss[1]));
            } else if (ss[0].equalsIgnoreCase("opbreak")){
                c.setOpBreakpoint(script, Integer.parseInt(ss[1]));
            } else if (ss[0].equalsIgnoreCase("clrobrk")){
                c.clearOpBreakpoint(script, Integer.parseInt(ss[1]));
            } else if (ss[0].equalsIgnoreCase("cont")){
                c.resume();
            } else if (ss[0].equalsIgnoreCase("state") && c.getState() != null){
                System.out.print("SCR:"+c.getState().getScript());
                System.out.print("\tPC:"+c.getState().getPc());
                System.out.print("\tISC:"+c.getState().getIntegerStackCounter());
                System.out.print("\tSSC:"+c.getState().getStringStackCounter());
                System.out.print("\tLSC:"+c.getState().getLongStackCounter());
                System.out.println("\tCSC:"+c.getState().getCallStackCounter());
            } else if(ss[0].equalsIgnoreCase("error")){
                System.out.println(c.getLastException());
            } else if (ss[0].equalsIgnoreCase("xinfo") && c.getState() != null){
                System.out.print("IVC:"+c.getState().getIntegerVariableCount());
                System.out.print("\tSVC:"+c.getState().getStringVariableCount());
                System.out.println("\tLVC:"+c.getState().getLongVariableCount());
            } else if (ss[0].equalsIgnoreCase("glocal") && c.getState() != null){
                if (ss[1].equalsIgnoreCase("int"))
                    System.out.println("localInt"+ss[2]+" = " + c.getState().getIntegerVariables()[Integer.parseInt(ss[2])]);
                else if (ss[1].equalsIgnoreCase("string"))
                    System.out.println("localString"+ss[2]+" = " + c.getState().getStringVariables()[Integer.parseInt(ss[2])]);
                else if (ss[1].equalsIgnoreCase("long"))
                    System.out.println("localLong"+ss[2]+" = " + c.getState().getLongVariables()[Integer.parseInt(ss[2])]);
                else
                    System.err.println("Invalid type");
            } else if (ss[0].equalsIgnoreCase("gstack") && c.getState() != null){
                if (ss[1].equalsIgnoreCase("int")){
                    int depth = Integer.parseInt(ss[2]);
                    int cntr = c.getState().getIntegerStackCounter();
                    for (int i = cntr - 1;i >= cntr - depth;i--)
                        if (i >= 0)
                            System.out.println("I:"+c.getState().getIntegerStack()[i]);
                } else if (ss[1].equalsIgnoreCase("string")){
                    int depth = Integer.parseInt(ss[2]);
                    int cntr = c.getState().getStringStackCounter();
                    for (int i = cntr - 1;i >= cntr - depth;i--)
                        if (i >= 0)
                            System.out.println("S:"+c.getState().getStringStack()[i]);
                } else if (ss[1].equalsIgnoreCase("long")){
                    int depth = Integer.parseInt(ss[2]);
                    int cntr = c.getState().getLongStackCounter();
                    for (int i = cntr - 1;i >= cntr - depth;i--)
                        if (i >= 0)
                            System.out.println("L:"+c.getState().getLongStack()[i]);
                } else
                    System.err.println("Invalid type");
            } else if (ss[0].equalsIgnoreCase("trace") && c.getState() != null){
                int depth = Integer.parseInt(ss[1]);
                int cntr = c.getState().getCallStackCounter();
                State cs = c.getState();
                System.out.println(cs.getScript()+":"+cs.getPc()+" (ISC:"+cs.getIntegerStackCounter()+" SSC:"+cs.getStringStackCounter()+" LSC:"+cs.getLongStackCounter()+")");
                for (int i = cntr - 1;i >= cntr - depth;i--)
                    if (i >= 0){
                        cs = c.getState().getCallStack()[i];
                        System.out.println("\t"+cs.getScript()+":"+cs.getPc()+" (ISC:"+cs.getIntegerStackCounter()+" SSC:"+cs.getStringStackCounter()+" LSC:"+cs.getLongStackCounter()+")");
                    }
            } else if (ss[0].equalsIgnoreCase("view") && c.getState() != null){
              at.setState(c.getState());
            } else
                System.err.println("Invalid command");
        }
    }
}
