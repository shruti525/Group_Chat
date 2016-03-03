


import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
	
import java.util.List;
import java.util.Vector;


/**
 *
 * @author shruti
 */
public class ServerImpl extends UnicastRemoteObject implements ServerInterface {
    
    private static final long serialVersionUID=1L;
    ArrayList<ClientInterface> Clients;

    public ServerImpl() throws RemoteException {
    
        Clients=new ArrayList<ClientInterface>();
    }
    public synchronized void registerClient(ClientInterface client) throws RemoteException {
        this.Clients.add(client);
    }
    public synchronized void broadcast(ClientInterface client,String value) throws RemoteException {
        int i=0;
        while(i<Clients.size())
            Clients.get(i++).retrieveValue(value);
    }
    
}
