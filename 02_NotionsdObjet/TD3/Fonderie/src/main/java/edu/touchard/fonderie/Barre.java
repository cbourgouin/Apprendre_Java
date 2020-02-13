/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.touchard.fonderie;

/**
 *Classe mere des barre
 * @author cbourgouin
 */
public class Barre {
    
    /**
     * densité de la barre
     */
    protected double densite;

    /**
     *longueur de la barre
     */
    protected double longueur;

    /**
     *reference de la barre
     */
    protected String reference;
    
    /**
     *
     */
    public Barre() {
        this.densite = 1;
        this.longueur = 1;
        this.reference = "0000AAAA";
    }

    /**
     *
     * @param densite
     * @param longueur
     * @param reference
     */
    public Barre(double densite, double longueur, String reference) {
        this.densite = densite;
        this.longueur = longueur;
        this.reference = reference;
    }
    
    /**
     *
     * @param cpy
     */
    public Barre(Barre cpy) {
        this.densite = cpy.densite;
        this.longueur = cpy.longueur;
        this.reference = cpy.reference;
    }
    
    /**
     *Sers a afficher la reference de la barre
     */
    public void afficherReference(){
        System.out.println("référence : "+reference);
    }
}
