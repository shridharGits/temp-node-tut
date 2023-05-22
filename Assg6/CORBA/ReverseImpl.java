import ReverseModule.ReversePOA;
import java.lang.String;
class ReverseImpl extends ReversePOA
{
 ReverseImpl()
 {
 super();
 System.out.println("Reverse Object Created");
 }
 public String reverse_string(String name)
 {
 StringBuffer str=new StringBuffer(name);
 str.reverse();
 return (("Server Send "+str));
 }
}

/*
T1
idlj -fall ReverseModule.idl
javac *.java ReverseModule/*.java
ordv -ORBInitialPort 1050&
java ReverseServer -ORBInitialPort 1050& -ORBInitialHost localhost&
- ORBInitialHost: command not found

T2
java ReverseClient -ORBInitialPort 1050 -ORBInitialHost localhost&
 */