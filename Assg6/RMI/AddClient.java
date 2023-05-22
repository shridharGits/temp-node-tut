
public class AddClient{
    public static void main(String args[]){
        try{
            String url = "rmi://127.0.0.1/AddServer";
            IAddServer addserver = (IAddServer)Naming.lookup(url);
            double a = Double.valueOf(args[0]).doubleValue();
            System.out.println("First number : " + args[0]);
            System.out.println("Second number: " + args[1]);
            System.out.println("Addition is : " + addserver.add(args[0],args[1]));
        }
        catch(Exception e){

        }
    }
}

/*
T1
 javac *.java
 rmic addServerImpl
 rmiregistry
T2
java AddServer

T3
java AddClient 127.0.0.1 4 5
 */