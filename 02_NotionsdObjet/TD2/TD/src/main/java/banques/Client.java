/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banques;

/**
 *
 * @author cbourgouin
 */
import java.util.Scanner;
public class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CompteBancaire MLeLouche = new CompteBancaire(453.26, -100);
        char choix;
        double val;
        
        System.out.println("---A-Retirer de l'argents");
        System.out.println("---B-Deposer de l'argents");
        System.out.println("---C-Consulter la solde");
        System.out.println("---D-Modifier le découvert autorisé");
        choix = (char) sc.nextByte();
        switch(choix){
            case 'A' : 
        }
    }
    
}
