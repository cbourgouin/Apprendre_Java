/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.touchard.exercice5;

/**
 *
 * @author cbourgouin
 */
import java.util.Scanner;
public class CodeSecretn2 {
    public static void main(String[] args) {
        String code = "1234";
        String donner;
        int compteur = 0;
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.print("donner CODE : ");
            donner = sc.next();
            if(code.equals(donner)){
                System.out.println("code bon");
            } else {
                System.out.println("code mauvais");
                compteur++;
            }
        }while(code.compareTo(donner) != 0 && compteur < 3);
        sc.close();
    }
}
