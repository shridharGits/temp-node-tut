import java.rmi.*;

public class AddServerImpl extends UnitcastRemoteObject implements IAddServer{
    public AddServerImpl() throws RemoteException{}
    public int add(int a, int b) throws RemoteException{
        return a+b;
    }
}
