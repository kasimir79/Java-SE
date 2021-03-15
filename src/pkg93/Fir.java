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
public class Fir  extends Thread{
    private Resursa st;
    private Resursa dr;
    private int filosofID;
    
    public Fir(Resursa st,Resursa dr, int filosofID){
        this.st=st;
        this.dr=dr;
        this.filosofID=filosofID;
    }
    public void run(){
        while(true){
        System.out.println("I'm the philosopher  "+filosofID+" and I think");
        try{
        sleep(5000);}
        catch(InterruptedException e){}
        System.out.println("The philosopher  "+filosofID+" I want the cutlery on the left");
        st.accesare();
         System.out.println("The philosopher "+filosofID+" I want the cutlery on the right");
        dr.accesare();
        System.out.println("The philosopher "+filosofID+" I'm eating");
        try{
        sleep(15000);}
        catch(InterruptedException e){}
        System.out.println("The philosopher "+filosofID+" I have finished eating ");
        st.eliberare();
        dr.eliberare();
        }
    } 
    
}
