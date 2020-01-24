/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercice1_1;

import java.util.Scanner;

/**
 *
 * @author cbourgouin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i;
        int multiplicateur;
        Scanner sc=new Scanner(System.in);
        System.out.print("Donner le multiplicateur : ");
        multiplicateur=sc.nextInt();
        for(i=1; i<11; i++){
            System.out.println(multiplicateur+" x "+i+" = "+multiplicateur*i);
        }
    }
    
}
