/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercice2;

import java.util.Scanner;

/**
 *
 * @author Formation
 */
public class Exercice2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int i=0,compteur=0;
        
        double somme=0,valtemp=0,moyenne=0;
        
        System.out.println("veuiller saisir le nombre de valeur------------>");
        
         i = sc.nextInt();
        
         while(compteur<i){
             System.out.println("veuiller saisir la valeur---------->");
             
             valtemp = sc.nextDouble();
             
             somme += valtemp;
             
             compteur++;
         }
         
         //Afficher la somme
         
         System.out.println("la valeur de la somme est ----------> " + i);
         
         //Afficher la moyenne
         
         moyenne = somme/i;
         
         System.out.println("la moyenne est ----------> " + moyenne);
         
    }
    
}
