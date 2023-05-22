package com.assg6;
import java.util.*;

public class Bully{
    static boolean[] processState = new boolean[6];
    static int coordinator;

    public static void up(int processToUp){
        if(processState[processToUp] == true){
            System.out.println("Process " + processToUp + " is already up");
        }
        else{
            processState[processToUp] = true;
            for(int i = processToUp+1; i<=5; i++){
                System.out.println("Election msg sent from process: " + processToUp + " to process: " + i);
            }

            for(int i = processToUp+1; i<=5; i++){
                if(processState[i] == true){
                    System.out.println("Alive msg sent from process: " + i + " to process: " + processToUp);
                    break;
                }
            }
        }
    }

    public static void down(int processToDown){
        if(processState[processToDown] == false){
            System.out.println("Process " + processToDown + "is already down");
        }
        else{
            processState[processToDown] = false;
        }
    }


    public static void msg(int processTomsg){
        if(processState[processTomsg] == true){
            if(processState[5] == true){
                System.out.println("OK");
            }
            else{
                System.out.println("Process: " + processTomsg + " held election");
                for(int i = processTomsg+1; i<=5; i++){
                    System.out.println("Election msg sent from process: " + processTomsg + " to process: " + i);
                }

                for(int i = 5; i>=1; i--){
                    if(processState[i] == true){
                        System.out.println("Coordinator msg sent from process: " + i + " to all");
                        coordinator = i;
                        break;
                    }
                }
            }
        }
        else{
            System.out.println("Process: " + processTomsg + " is down");
        }
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<6; i++){
            processState[i] = true;
        }

        System.out.println("Total 5 processes are up");
        System.out.println("UP processes: P1 P2 P3 P4 P5");
        System.out.println("Coordinator: P5");

        int ch;
        do{
            System.out.println("1: Activate the process");
            System.out.println("2: De-activate the process");
            System.out.println("3: Send a message");
            System.out.println("4: Exit");

            ch = sc.nextInt();
            switch(ch){
                case 1:{
                    System.out.println("Enter process to be activated: ");
                    int processToUp = sc.nextInt();
                    up(processToUp);
                    break;
                }
                case 2:{
                    System.out.println("Enter process to be deactivate: ");
                    int processToDown = sc.nextInt();
                    down(processToDown);
                    break;
                }
                case 3:{
                    System.out.println("Enter process that will send msg: ");
                    int processToMsg = sc.nextInt();
                    msg(processToMsg);
                    break;
                }
            }
        }while(ch!=4);
    }
}