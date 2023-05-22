import java.util.*;
import java.rmi.*;

public interface IAddserver extends Remote{
    int add(int a, int b) throws RemoteException;
}