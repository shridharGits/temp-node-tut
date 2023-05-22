import java.rmi.Naming;

public class AddServer{
    public static void main(){
        try{
            AddServerImpl addServerImpl = new AddServerImpl();
            Naming.rebind("AddServer", addServerImpl);
        }
        catch(Exception e){

        }
    }
}