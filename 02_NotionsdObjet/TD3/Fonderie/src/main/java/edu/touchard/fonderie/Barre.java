/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.touchard.fonderie;

/**
 *
 * @author cbourgouin
 */
public class Barre {
    
    private double densite;
    private double longueur;
    private String reference;
    
    public Barre() {
        this.densite = 1;
        this.longueur = 1;
        this.reference = "0000AAAA";
    }

    public Barre(double densite, double longueur, String reference) {
        this.densite = densite;
        this.longueur = longueur;
        this.reference = reference;
    }
    
    public Barre(Barre cpy) {
        this.densite = cpy.densite;
        this.longueur = cpy.longueur;
        this.reference = cpy.reference;
    }
    
    public void afficherReference(){
        System.out.println("référence : "+reference);
    }
}
