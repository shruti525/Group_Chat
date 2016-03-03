

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client
{
    public static void main(String[] args) throws  MalformedURLException, RemoteException, NotBoundException {
        
        
        //String host = (args.length < 1) ? null : args[0];
	try {
	    Registry registry = LocateRegistry.getRegistry();
	    ServerInterface stub = (ServerInterface) registry.lookup("RMIServer");
            new Thread(new ClientImpl(args[0], stub)).start();
    }catch (Exception e) {
	    System.err.println("Client exception: " + e.toString());
	    e.printStackTrace();
	}

    }
}