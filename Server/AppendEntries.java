package Server;

import java.io.IOException;
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
    
    public AppendEntries() {}
    
    public AppendEntries(int term, int leaderId, int commitIndex, int logIndex, int logTerm) 
    {
        this.term=term;
        this.leaderId=leaderId;
        this.commitIndex=commitIndex;
        this.logIndex=logIndex;
        this.logTerm=logTerm;
       // this.entry=entry;
    }
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
    
    private void writeObject(java.io.ObjectOutputStream stream) throws IOException 
    {
        stream.writeLong(term);
        stream.writeInt(leaderId);
        stream.writeLong(logIndex);
        stream.writeLong(logTerm);
        stream.writeLong(commitIndex);
        //for(Record rec:entries){
          //  stream.writeLong(rec.getIndex().writeObject(rec.getValue()));
        
    }
    
    
    private void readObject(java.io.ObjectInputStream stream) throws IOException
    {
        term = stream.readInt();
        leaderId = stream.readInt();
        logIndex = stream.readInt();
        logTerm = stream.readInt();
        commitIndex = stream.readInt();
        //entries=stream.readObject();
      
    }
}
    
    





