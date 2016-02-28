//import java.rmi.RMISecurityManager;
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import java.util.Vector;

public class Server extends java.rmi.server.UnicastRemoteObject 
{
    public  int term;
    public  int leaderId;
    public  int commitIndex=-1;
    public  int logIndex;
    public  int logTerm;
    
    
    
    public Server() throws RemoteException
    {
        
            Server s = new Server();
                 
    }
    public int appendEntries(Vector<AppendEntries> entry, AppendEntries append)throws RemoteException 
            {
               
                    if(entry==null)
                    {
                            System.out.println("log is empty");
                    }
                    else
                    {
                        if(term >  logTerm  && logIndex > 0 )
                        entry.add(append);
                    }
                    return commitIndex;
            }     

    
              
	
        public static void main(String args[]) {
	
	
            try {
	     AppendEntries obj = new AppendEntries();
          //   Vector <AppendEntries> entry=new <AppendEntries> Vector();
             Server server= new Server();
            // server.appendEntries(entry);
             
	    RemoteInterface stub = (RemoteInterface) UnicastRemoteObject.exportObject(server, 0);

	    // Bind the remote object's stub in the registry
	    Registry registry = LocateRegistry.getRegistry();
	    registry.bind("Hello", stub);

	    System.err.println("Server ready");
	} catch (Exception e) {
	    System.err.println("Server exception: " + e.toString());
	    e.printStackTrace();
	}
    }

    
}
    





