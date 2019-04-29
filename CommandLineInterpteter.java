/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command.line.interpteter;


import java.io.File;

/**
 *
 * @author computer
 */
public class CommandLineInterpteter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
         
         int x = 6;
         switch(x){
              
             case 1:   // clear 
                 for(int i=0;i<16;i++){
                    System.out.println();
                         }
                 break;
             case 2:  // mkdir
                 File f2=new File("C:\\fownload");
                 if(f2.exists()){
                     System.out.print("this filename exist \n");
                 }
                 else{
                     System.out.print("the file is created now \n");
                     f2.mkdir();
                 }
                 break;
              case 3:        // delete  (rm)
                    File f3=new File("C:\\fownload");
                    if(f3.exists()){
                    f3.delete();
                    System.out.print("the file is deleted \n");
                    }
                    else{
                    System.out.print("the file isnot exist \n ");
                    }
                    break;
              case 4:        // get path (pwd)
                    File f4=new File("C:\\fownload");
                    if(!f4.exists()){
                    System.out.print("this filename isnot exist \n");
                    }
                    else{
                    System.out.println(f4.getPath());
                    }
                    break;
                  
              case 5: // help
                    System.out.println("");
                    System.out.print("clear: Clear terminal and previous .");
                    System.out.print("cd: change the current directory.");
                    System.out.print("ls:list and show you all files in the directory.");
                    System.out.println("pwd: show the current directory.");
                    System.out.println("date: show the current date and time of the system.");
                    System.out.print("mkdir: create a new directory");
                    System.out.println("cp: copy file to specific directory");
                    System.out.println("mv: moves file to specific directory ");
                    System.out.println("rm: delete  a file");
                    System.out.println("rmdir: delete  the directory");
                    System.out.println("cat: shows the content of a file");
                    System.out.println("exit:  Exit the shell.");
                  break;
                  
              case 6:   //mv move file
                    File f6=new File("C:\\fownload");
                    if(!f6.exists()){
                    System.out.print("this filename isnot exist \n");
                    }
                    else{
                        f6.renameTo(new File("C:\\Qt\\fownload"));
                    }
                    break;
                  
              case 7:   // list  (li)
                    File f7=new File("C:\\fownload");
                    if(!f7.exists()){
                    System.out.print("this filename isnot exist \n");
                    }
                    else{
                        f7.renameTo(new File("C:\\Qt\\fownload"));
                    }
                  
                  
                  break;
                 
         }
    }
}
