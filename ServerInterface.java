import java.rmi.RemoteException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shruti
 */
    import java.rmi.*;
    import java.rmi.server.UnicastRemoteObject;
import java.util.Vector;
public interface ServerInterface extends java.rmi.Remote {
    //int appendEntries(int append, Vector<Integer> entry ) throws RemoteException;
            void registerClient(ClientInterface client) throws RemoteException;
            void broadcast(ClientInterface client, String value) throws RemoteException;
}   
