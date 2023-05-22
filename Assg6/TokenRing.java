import java.util.*;

public class Node{
    private int id;
    private boolean hasToken;

    Node(int id){
        this.id = id;
    }

    public void setToken(boolean hasToken){
        this.hasToken = hasToken;
    }

    public boolean hasToken(){
        return this.hasToken;
    }

    public int getId(){
        return this.id;
    }

    public void process(){
        System.out.println("Process: " + id + "has token");
    }
}

public class TokenRing{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter no of nodes: ");
        int n = sc.nextInt();

        Node nodes[] = new Node[n];

        System.out.println("Enter node having token: ");
        initiateNode = sc.nextInt();

        nodes[initiateNode].setToken(true);
        int currentProcess = initiateNode;

        while(true){
            if(nodes[currentProcess].hasToken()){
                System.out.println("Node: " + currentProcess + "Passes data to Node: " + (currentProcess+1)%n);
            }
            nodes[currentProcess].setToken(false);
            currentProcess = (currentProcess+1)%n;
            nodes[currentProcess].setToken(true);
            if(currentProcess == initiateNode){
                System.out.println("Circle completed");
                break;
            }
        }
    }
}