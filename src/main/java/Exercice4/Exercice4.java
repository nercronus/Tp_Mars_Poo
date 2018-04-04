/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercice4;

import com.sun.media.sound.SoftAbstractResampler;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Formation
 */
public class Exercice4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Random random = new Random();
        
        int nbre = random.nextInt(100);//valramdom
        
        int compteur=0;
        
        int nbre2=0;
        
        String v = null;
        
        String n;
        
        boolean fin=false;//faux
        
        boolean findujeu=false;//fin de partie
        
        Scanner sc = new Scanner(System.in);
          
        List <Integer> LR= new ArrayList<Integer>();//liste des randoms
        
         List <Integer> LC= new ArrayList<Integer>();//liste des compteurs
         
         while(v.equalsIgnoreCase("oui")){
             
              System.out.println("afficher le nombre-------> " + nbre);
        
        System.out.println("Veuillez entrer un nombre ---------->");
        
        while(nbre2!=nbre){
            
            compteur++;
            
           nbre2 = sc.nextInt();//valsaisie
          
          if(nbre2<nbre){
              
              System.out.println("le nombre à trouver est plus grand try-again -------------->");
              
          }
          
          if(nbre2>nbre){
              
              System.out.println("le nombre à trouver est plus petit try-again ------------->");
              
          } 
          
          if(nbre2==nbre){
              
              System.out.println("le nombre à trouver est égal ------------->");
              
              System.out.println("Vous avez réussi en " + compteur + " fois !");
              
              fin = true;
          }
            
        }
              System.out.println("vous voulez rejouer ??????");
              
              System.out.println("oui ou non");
              
               v = sc.next();
               
     }
         }
         
       
         
  }
        

