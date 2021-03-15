/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg93;

/**
 *
 * @author _Five philosophers are sitting at a table and
think. After such a great effort they become
hungry. To eat, each philosopher needs knife
and fork. Between each two philosophers are
either a knife or a fork, so that each
philosopher have access only to those
adjacent to him. After each use, the knife and
the fork should be cleaned.
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Resursa [] tablou=new Resursa [5];
       Fir [] tablouFire=new Fir [5];
       int i;
       for( i=0;i<5;i++)
           tablou[i]=new Resursa (i+1);
       for( i=0;i<5;i++)
           if(i==0)
                tablouFire[i]=new Fir(tablou[0],tablou[4],i+1);
           else 
                tablouFire[i]=new Fir(tablou[i],tablou[i-1],i+1);
       for( i=0;i<5;i++)
           tablouFire[i].start();
    
    } 
}
