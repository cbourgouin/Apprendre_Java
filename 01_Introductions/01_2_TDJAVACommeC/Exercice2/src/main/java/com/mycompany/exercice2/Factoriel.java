 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercice2;

/**
 *
 * @author cbourgouin
 */
import java.util.Scanner;
public class Factoriel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        int resultat;
        
        Scanner clavier = new Scanner(System.in);
        n = clavier.nextInt();
        
        Factoriel fc = new Factoriel();
        resultat = fc.calculer(n);
        
        System.out.println("factoriel = " + resultat);
        
    }
    
    public int calculer(int n){
        int factoriel = 1;
        for(int i = 1; i<=n; i++){
            factoriel *= i;
        }
        return factoriel;
    }
    
}
