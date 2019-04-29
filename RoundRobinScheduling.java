/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package round.robin.scheduling;

import java.util.Scanner;

public class RoundRobinScheduling {

    public static void main(String[] args) {
        System.out.println("enter # of process");
        int number;
        Scanner scanner= new Scanner(System.in);
        number=scanner.nextInt();
       
        System.out.println("enter the time Quantum");
        int Quantum;
        Quantum=scanner.nextInt();
        
        int []Burst={12,8,4,10,5};       // burst time
        int []Burst2={12,8,4,10,5};
        int [][]arr=new int[number][5];
        
        int []count=new int[number];
       
        int []start=new int[number];
        int Index=0 , step=0;
        
        
        int []Result=new int[number];
        int []temp=new int[number];
        float Average=0;        
        for (int i = 0; i < 20; i++) {
            
            if(Burst[Index]<=0){
                Index++;
                Index=Index%number;
                continue;
            }
            start[Index]=0;
            start[Index]+=step;
            
               
            Burst2[Index]=Burst[Index];
            Burst[Index]-=Quantum;
           
            
            Result[Index]+=start[Index]-temp[Index];
           // Average+=Result[Index];
            if(Burst2[Index]<Quantum){
                    arr[Index][count[Index]]=Burst2[Index];
                }
                else{
                    arr[Index][count[Index]]=Burst2[Index]-Burst[Index];
                }
                
                temp[Index]=step+=arr[Index][count[Index]];
                System.out.println("start =  "+start[Index]);
                System.out.println("step2 =  "+step);
                
                count[Index]++;
            
            Index++;
            Index=Index%number;
            
        }
        // Average
        for (int i = 0; i < number; i++) {
            Average+=Result[i];
        }
        System.out.println("Result0 =  " +Result[0]);
        System.out.println("Result1 =  " +Result[1]);
        System.out.println("Result2 =  " +Result[2]);
        System.out.println("Result3 =  " +Result[3]);
        System.out.println("Result4 =  " +Result[4]);
        System.out.println("Average =  " +Average/number);
        
    }
    
}


/*
            if(Index==0){
                if(Burst2[Index]<Quantum){
                    arr[Index][count[Index]]=Burst2[Index];
                }
                else{
                    arr[Index][count[Index]]=Burst2[Index]-Burst[Index];
                }
                step+=arr[Index][count[Index]];
                System.out.println("step0 =  "+step);
                
                count[Index]++;
                
            }
            else if(Index==1){
                if(Burst2[Index]<Quantum){
                    arr[Index][count[Index]]=Burst2[Index];
                }
                else{
                    arr[Index][count[Index]]=Burst2[Index]-Burst[Index];
                }
                
                step+=arr[Index][count[Index]];
                System.out.println("step1 =  "+step);
                
                count[Index]++;
            }
            else if(Index==2){
                if(Burst2[Index]<Quantum){
                    arr[Index][count[Index]]=Burst2[Index];
                }
                else{
                    arr[Index][count[Index]]=Burst2[Index]-Burst[Index];
                }
                
                step+=arr[Index][count[Index]];
                System.out.println("step2 =  "+step);
                
                count[Index]++;
            }
            else if(Index==3){
                if(Burst2[Index]<Quantum){
                    arr[Index][count[Index]]=Burst2[Index];
                }
                else{
                    arr[Index][count[Index]]=Burst2[Index]-Burst[Index];
                }
                
                step+=arr[Index][count[Index]];
                System.out.println("step3 =  "+step);
               
                count[Index]++;
            }
            else if(Index==4){
                if(Burst2[Index]<Quantum){
                    arr[Index][count[Index]]=Burst2[Index];
                }
                else{
                    arr[Index][count[Index]]=Burst2[Index]-Burst[Index];
                }
                
                step+=arr[Index][count[Index]];
                System.out.println("step4 =  "+step);
               
                count[Index]++;
            }
            
*/


/*
            if(Index==0){
            
            System.out.println("start[Indesx] =  "+start[Index]);
            System.out.println("temp0 =  "+temp[Index]);
            
            Result[Index]+=start[Index]-temp[Index];
            if(Burst2[Index]<Quantum){
            arr[Index][count[Index]]=Burst2[Index];
            }
            else{
            arr[Index][count[Index]]=Burst2[Index]-Burst[Index];
            }
            
            
            temp[Index]=step+=arr[Index][count[Index]];
            System.out.println("start =  "+start[Index]);
            System.out.println("step0 =  "+step);
            
            count[Index]++;
            
            }
            else if(Index==1){
            
            Result[Index]+=start[Index]-temp[Index];
            if(Burst2[Index]<Quantum){
            arr[Index][count[Index]]=Burst2[Index];
            }
            else{
            arr[Index][count[Index]]=Burst2[Index]-Burst[Index];
            }
            
            temp[Index]=step+=arr[Index][count[Index]];
            System.out.println("start =  "+start[Index]);
            System.out.println("step1 =  "+step);
            
            count[Index]++;
            }
            else if(Index==2){
            
            Result[Index]+=start[Index]-temp[Index];
            if(Burst2[Index]<Quantum){
            arr[Index][count[Index]]=Burst2[Index];
            }
            else{
            arr[Index][count[Index]]=Burst2[Index]-Burst[Index];
            }
            
            temp[Index]=step+=arr[Index][count[Index]];
            System.out.println("start =  "+start[Index]);
            System.out.println("step2 =  "+step);
            
            count[Index]++;
            }
            else if(Index==3){
            
            Result[Index]+=start[Index]-temp[Index];
            if(Burst2[Index]<Quantum){
            arr[Index][count[Index]]=Burst2[Index];
            }
            else{
            arr[Index][count[Index]]=Burst2[Index]-Burst[Index];
            }
            
            temp[Index]=step+=arr[Index][count[Index]];
            System.out.println("start =  "+start[Index]);
            System.out.println("step3 =  "+step);
            
            count[Index]++;
            }
            else if(Index==4){
            
            Result[Index]+=start[Index]-temp[Index];
            if(Burst2[Index]<Quantum){
            arr[Index][count[Index]]=Burst2[Index];
            }
            else{
            arr[Index][count[Index]]=Burst2[Index]-Burst[Index];
            }
            
            temp[Index]=step+=arr[Index][count[Index]];
            System.out.println("start =  "+start[Index]);
            System.out.println("step4 =  "+step);
            
            count[Index]++;
            }
            */
           
