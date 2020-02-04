/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.touchard.exercice7;

/**
 *
 * @author cbourgouin
 */
import java.util.Scanner;
public class Triangle1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nb;
        int compteur = 0;
        int sousCompteur = 0;
        nb = sc.nextInt();
        sc.close();
        while(compteur<nb){
            compteur++;
            while(sousCompteur<compteur){
                sousCompteur++;
                System.out.print("*");
            }
            System.out.println("");
            sousCompteur = 0;
        }
                
    }
    
}
