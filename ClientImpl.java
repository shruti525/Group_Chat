/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author shruti
 */
public class ClientImpl extends UnicastRemoteObject implements ClientInterface, Runnable {
    private ServerInterface server;
    String name=null;
    
    ClientImpl(String name,ServerInterface server) throws RemoteException
    {
        this.name=name;
        this.server=server;
        server.registerClient(this);    
    }
    public void retrieveValue(String value) throws RemoteException {
     System.out.println(value);
    }
    public void run() {
        Scanner s=new Scanner(System.in);
        String value;
        while(true)
        {
            value=s.nextLine();
            try {
                server.broadcast(name+" "+value);
            } catch (RemoteException ex) {
                ex.printStackTrace();
            }
        }
    }
   
}
