/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Vector;

/**
 *
 * @author shruti
 */
public interface ClientInterface extends Remote{
    void retrieveValue(String value) throws RemoteException;
    
    
}
