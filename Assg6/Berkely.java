import java.util.*;
import java.io.*;
import java.net.*;

public class Berkely{
    public static final int PORT = 1024;

    public static void main(String args[]){
        ServerSocket serverSocket = new ServerSocket(PORT);
        List<Long> timeDiffs = new List<Long>();

        Thread timeServerTread = new Thread(new Runnable(){
            public void run(){
                Socket clientSocket = serverSocket.accept();

                ObjectInputStream in = new ObjectInputStream(clientSocket.getInputStream());
                Date clientTime = (Date)in.readObject();

                ObjectOutputStream out = new ObjectOutputStream(clientSocket.getOutputStream());
                out.writeObject();

                long timeDiff = new Date().getTime() - clientTime.getTime()/2;
                timeDiffs.add(timeDiff);
                in.close();
                out.close();
                clientSocket.close();
            }
        });

        timeServerThread.start();

        Thread timeClientThread = new Thread(new Runnable(){
            public void run(){
                Socket socket = new Socket("localhost", PORT);

                ObjectOutputStream out = new ObjectOutputStream(clientSocket.getOutputStream());
                out.writeObject(new Date());

                ObjectInputStream in = new ObjectInputStream(clientSocket.getInputStream());
                Date clientTime = (Date)in.readObject();

                long timeDiff = new Date().getTime() - clientTime.getTime()/2;
                timeDiffs.add(timeDiff);
                in.close();
                out.close();
                socket.close();
                Thread.sleep(1000);
            }
        });

        timeClientThread.start();

        Thread.sleep(10000);
        long sum = 0;
        for(long timeDiff : timeDiffs){
            sum+=timeDiff;
        }

        long avg = sum/timeDiffs.size();

        Calendar calender = new Calendar();
        calender.getInstance(new Date());
        calender.add(Calendar.MILLISECOND, avg);

    }
}

public class Berkely{
    private static final int PORT = 1024;
    public static void main(String args[]){
        ServerSocket serverSocket = new ServerSocket(PORT);

        List<Long> timeDiffs = new List<Long>();

        // server thread
        Thread timeServerThread = new Thread(new Runnable(){
            public void run(){
                while(true){
                    try{
                        Socket clientSocket = serverSocket.accept();
                        ObjectInputStream in = new OnjectInputStream(clientSocket.getInputStream());
                        Date clientTime = (Date)in.readObject();

                        ObjectOutputStream out = new ObjectOutputStream(clientSocket.getOutputStream());
                        out.writeObject(new Date());

                        long timeDiff = new Date().getTime() - clientTime.getTime()/2;
                        timeDiffs.add(timeDiff);
                        in.close();
                        out.close();
                        clientSocket.close();
                    } catch(Expcetion e){
                        
                    }
                }
            }
        });
        timeServerThread.start();

        Thread timeClientThread = new Thread(new Runnable(){
            public void run(){
                while(true){
                    try{
                        Socket socket = new Socket("localhost", PORT);
                        ObjectInputStream in = new OnjectInputStream(clientSocket.getInputStream());
                        Date clientTime = (Date)in.readObject();

                        ObjectOutputStream out = new ObjectOutputStream(clientSocket.getOutputStream());
                        out.writeObject(new Date());

                        long timeDiff = new Date().getTime() - clientTime.getTime()/2;
                        timeDiffs.add(timeDiff);
                        in.close();
                        out.close();
                        clientSocket.close();
                        Thread.sleep(1000);
                    } catch(Expcetion e){
                        
                    }
                }
            }
        });
        timeClientThread.start();

        thread.sleep(10000);
        long sumDiff = 0;
        for(long timeDiff : timeDiffs){
            sumDiff+=timeDiff;
        }

        long avg = sumDiff/timeDiffs.size();

        Calendar calender  = new Calandar();
        calender.setTime(new Date());
        calender.add(Calendar.MILLISECOND, avg);

    }

    public static
}

