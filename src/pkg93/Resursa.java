/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg93;

/**
 *
 * @author _
 */
public class Resursa {
   private boolean stare =true;
   private int ID;
   
   public Resursa(int ID){
       this.ID=ID;
    
}
   
   public synchronized void accesare(){
      
       while(!stare){
           System.out.println(" The Cutlery  "+ID+" is busy ");
           try{
           wait();
           }
           catch(InterruptedException e){}
           
       }
           System.out.println("The Cutlery  "+ID+" is free to be used  ");
           stare=false;
           
       
   }
   public synchronized void eliberare(){
       stare=true;
       System.out.println(" The Cutlery "+ID+" the cutlery is cleaned an placed on the table ");
       notify();
       
   }
    
}
