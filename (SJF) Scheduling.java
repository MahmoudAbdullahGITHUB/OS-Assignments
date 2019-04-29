/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shortest.job.first.scheduling;

import java.util.Scanner;


public class ShortestJobFirstScheduling {


    public static void main(String[] args) {
        System.out.println("enter # of process");
        int number;
        Scanner scanner= new Scanner(System.in);
        number=scanner.nextInt();
       
        
        int []Arrival={0,2,4,5};     // arrival time
        int []Burst={7,4,1,4};       // burst time
        int []wait={0,2,4,5};
        int []BasicBurst={7,4,1,4};       // to store the basic of the Burst
        
        
        
        int until=1;
        int temp ,tempIndex=0 ,role=Burst[0] ;
        int []count=new int[number];
        int count0=0,count1=0,count2=0,count3=0;
        int [][]store=new int [number][5];
        int step = 0 , start=0;
        int []Result=new int[number];
        int []START=new int[number];
        for (int i = 0; i < 6; i++) {
            System.out.println("\n\n ");
            System.out.println("i =  "+i);
            if (until<number){
                System.out.println("tempIndex =  "+tempIndex);
                role-=Arrival[++tempIndex]-Arrival[--tempIndex];
                System.out.println("role =   "+role);
                
                step += Arrival[++tempIndex]-Arrival[--tempIndex];
                until++;
                System.out.println("until =   "+until);
                Burst[tempIndex]=role;   // update  Burset
     
            }
            else{
                until=number;
                role=Burst[tempIndex];
                step+=role;
                Burst[tempIndex]=role=0;
                
            }
            
            START[tempIndex]=start ;
            System.out.println("start \t "+start);   
            System.out.println("p4 \t "+step);
                
            START[tempIndex]-=wait[tempIndex];
            wait[tempIndex]=step;
            Result[tempIndex]=START[tempIndex];
                
            store[tempIndex][count[tempIndex]]=step;
            start=step;
            count[tempIndex]++;
            
                                    // store every time
            
            temp=Burst[0];  tempIndex=0;
            
            for (int j = 0; j < until; j++) {   
               if(Burst[j]<temp && Burst[j]!=0){
                   temp=Burst[j];
                   tempIndex=j;
                   role=Burst[j];
               }

            }
            
        }
        int Average=0;
        System.out.println("-------------------");
        for (int i = 0; i < number; i++) {
            
            System.out.println("Result[i] =  "+Result[i]);
            Average+=Result[i];
        }
        System.out.println("Average =  "+Average/number);
        
    }   
}

/* if(tempIndex==0){
                START[tempIndex]=start ;
                System.out.println("start \t "+start);   
                System.out.println("p1 \t "+step);
                
                START[tempIndex]-=wait[tempIndex];
                wait[tempIndex]=step;
                Result[tempIndex]+=START[tempIndex];
                
                store[tempIndex][count[tempIndex]]=step;
                start=step;
                count[tempIndex]++;
            }
            else if(tempIndex==1){
                START[tempIndex]=start ;
                System.out.println("start \t "+start);   
                System.out.println("p2 \t "+step);
                
                START[tempIndex]-=wait[tempIndex];
                wait[tempIndex]=step;
                Result[tempIndex]=START[tempIndex];
                
                store[tempIndex][count[tempIndex]]=step;
                start=step;
                count[tempIndex]++;
            }
            else if(tempIndex==2){
                START[tempIndex]=start ;
                System.out.println("start \t "+start);   
                System.out.println("p3 \t "+step);
                
                START[tempIndex]-=wait[tempIndex];
                wait[tempIndex]=step;
                Result[tempIndex]=START[tempIndex];
                
                store[tempIndex][count[tempIndex]]=step;
                start=step;
                count[tempIndex]++;
            }
            else if(tempIndex==3){
                START[tempIndex]=start ;
                System.out.println("start \t "+start);   
                System.out.println("p4 \t "+step);
                
                START[tempIndex]-=wait[tempIndex];
                wait[tempIndex]=step;
                Result[tempIndex]=START[tempIndex];
                
                store[tempIndex][count[tempIndex]]=step;
                start=step;
                count[tempIndex]++;
            }
            */
