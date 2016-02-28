import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import java.util.Vector;
	
public class AppendEntries 
//implements RemoteInterface
{
    public  int term;
    public  int leaderId;
    public  int commitIndex=-1;
    public  int logIndex;
    public  int logTerm;
    
    

	public long getTerm() {
        return term;
    }

    public int getLeaderId() {
        return leaderId;
    }

    public long getCommitIndex() {
        return commitIndex;
    }

    public long getLogIndex() {
        return logIndex;
    }

    public long getLogTerm() {
        return logTerm;
    }    
}
    
    





