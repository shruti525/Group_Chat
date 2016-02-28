
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author shruti
 */
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Vector;
public class LogReplication {

      private LogReplication() {}

    public static void main(String[] args) {
        
	String host = (args.length < 1) ? null : args[0];
	try {
	    Registry registry = LocateRegistry.getRegistry(host);
	    RemoteInterface stub = (RemoteInterface) registry.lookup("Hello");
            Vector <AppendEntries> entry=new <AppendEntries> Vector();
            AppendEntries append=new AppendEntries();
	    int response = stub.appendEntries(entry,append);
	    System.out.println("response: " + response);
	} catch (Exception e) {
	    System.err.println("Client exception: " + e.toString());
	    e.printStackTrace();
	}
    }
}
