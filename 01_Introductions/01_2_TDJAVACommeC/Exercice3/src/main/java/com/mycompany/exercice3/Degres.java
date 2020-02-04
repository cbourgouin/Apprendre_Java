/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercice3;

/**
 *
 * @author cbourgouin
 */
import java.util.Scanner;
public class Degres {
    public static void main(String[] args) {
        double Fah;
        double Deg;
        System.out.print("Temperature en °F : ");
        Scanner sc = new Scanner(System.in);
        Fah = sc.nextDouble();
        Degres ds = new Degres();
        Deg = ds.calculer(Fah);
        System.out.println("Temperature en °C =  " + Deg);
        
    }
    
    public double calculer(double F){
        double C;
        C = (F-32.0)*(5.0/9.0);
        return C;
    }
    
}
