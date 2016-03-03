

import java.io.Serializable;
import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Server implements Serializable
{
    public static void main(String[] args) throws RemoteException, MalformedURLException, AlreadyBoundException {
        
       try
       {
           ServerInterface obj=new ServerImpl();
       // ServerInterface stub = (ServerInterface) UnicastRemoteObject.exportObject(obj, 0);
        Registry registry = LocateRegistry.getRegistry();
	    registry.bind("RMIServer", obj);
             System.err.println("Server ready");
       }catch (Exception e) {
	    System.err.println("Server exception: " + e.toString());
	    e.printStackTrace();
	}     
    }
 }
    





