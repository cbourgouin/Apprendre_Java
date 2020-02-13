/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.touchard.fonderie;

/**
 *Main
 * @author cbourgouin
 */
public class Forgerons {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Barre bar;
        BarreRonde br;
        BarreRectangle bre;
        BarreCarree bc;
        
        bar = new Barre(7.8, 2.7, "YRH71081");
        bre = new BarreRectangle(2.5, 5, bar);
        br = new BarreRonde(50, bar);
        bc = new BarreCarree(7, bar);
                
        //bar.afficherReference();
        bre.afficher();
        br.afficher();
        bc.afficher();
    }
    
}
