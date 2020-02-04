/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercice4;

/**
 *
 * @author cbourgouin
 */
import java.util.Scanner;
public class CodeSecret {
    public static void main(String[] args) {
        String code = "Code";
        String donner;
        
        Scanner sc = new Scanner(System.in);
        donner = sc.next();
        if(code == donner){
            System.out.println("code bon");
        } else {
            System.out.println("code mauvais");
        }
        
    }
    
}
