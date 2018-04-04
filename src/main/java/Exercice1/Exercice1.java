/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercice1;

/**
 *
 * @author Formation
 */
public class Exercice1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       int y= 1,v= 15;
       
       while( y <= v){
           if(y==1){
           System.out.println(0 +y+ " kilomètre à pied, ça use, ça use,");
           System.out.println(0 +y+ " kilomètre à pied ça use les souliers.");
           }
           else
           {
              System.out.println(0 +y+ " kilomètres à pied, ça use, ça use,");
           System.out.println(0 +y+ " kilomètres à pied ça use les souliers."); 
           }
           y++;
       }
    }
    
}
