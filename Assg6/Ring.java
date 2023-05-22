package com.assg6;

import java.util.*;

public class Ring{
    public class ProcessRing{
        public int index;
        public int id;
        public int f;
        String state;
    }
    public static void main(String[] args){
        char str[] = new char[10];
        ProcessRing processes[] = new ProcessRing[10];

        for(int i = 0; i<10; i++){
            processes[i] = new ProcessRing();
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of processes : ");
        int n = sc.nextInt();

        for(int i = 0; i<n; i++){
            processes[i].index = i;
            System.out.println("Enter processId : ");
            processes[i].id = sc.nextInt();
            processes[i].state = "Active";
            processes[i].f = 0;
        }
        Arrays.sort(processes);
        for(int i = 0; i<n; i++){
            System.out.print("[" + i + "] " + processes[i].id);
        }

        processes[n-1].state = "Inactive";
        System.out.println("Process: " + processes[i-1].id + "is Coordinator");

        int ch;
        int arr[] = new int[10];
        while(true){
            System.out.println("1. Election");
            System.out.println("2. Quit");

            ch = sc.nextInt();

            for(int i = 0; i<n; i++){
                processes[i].f = 0;
            }

            switch (ch) {
                case 1:{
                    System.out.println("Enter process who started election: ");
                    int startProcess = sc.nextInt();
                    int nextStartProcess = startProcess+1;
                    int arrIndex = 0;
                    while(startProcess!=nextStartProcess){
                        if(processes[nextStartProcess].state == "Active" && processes[nextStartProcess].f == 0){
                            System.out.println("Process: " + startProcess + " sends msg to process: " + nextStartProcess);
                            processes[nextStartProcess].f = 1;
                            startProcess = nextStartProcess;
                            arr[arrIndex] = processes[nextStartProcess].id;
                            arrIndex++;
                        }
                        if(nextStartProcess == n){
                            nextStartProcess = 0;
                            
                        }
                    }
                }
            }
        }
    }
}