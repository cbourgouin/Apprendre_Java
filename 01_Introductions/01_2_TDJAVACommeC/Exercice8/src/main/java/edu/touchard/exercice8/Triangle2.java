/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.touchard.exercice8;

/**
 *
 * @author cbourgouin
 */
import java.util.Scanner;
public class Triangle2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nb;
        nb = sc.nextInt();
        sc.close();
        int i;
        int u;
        
        for(i=1; i<=nb; i++){
            for(u=1; u<=i; u++){
                System.out.print("*");
            }
            System.out.println("");
        }
             
    }
    
}
