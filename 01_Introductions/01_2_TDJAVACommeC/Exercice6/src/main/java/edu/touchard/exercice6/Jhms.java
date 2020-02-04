/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.touchard.exercice6;

/**
 *
 * @author cbourgouin
 */
import java.util.Scanner;
public class Jhms {
    public static void main(String[] args) {
        int seconde;
        int min = 0;
        int heu = 0;
        int jou = 0;
        System.out.print("donner les secondes : ");
        Scanner sc = new Scanner(System.in); 
        seconde = sc.nextInt();
        sc.close();
        while(seconde>=60){
            min++;
            seconde -= 60;
        }
        while(min>=60){
            heu++;
            min -= 60;
        }
        while(heu>=24){
            jou++;
            heu -= 24;
        }
        System.out.println(seconde + "s : " + min + "min : " + heu + "h : " + jou + "j");
    }
    
}
