
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
import java.util.Vector;
public interface RemoteInterface extends java.rmi.Remote {
    int appendEntries(Vector<AppendEntries> entry, AppendEntries append ) throws RemoteException;    
}
    
