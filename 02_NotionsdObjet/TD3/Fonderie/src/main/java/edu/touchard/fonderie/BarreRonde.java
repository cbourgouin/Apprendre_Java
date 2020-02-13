/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.touchard.fonderie;

/**
 *Barre ronde
 * @author cbourgouin
 */
public class BarreRonde extends Barre {
    private double diametre;

    /**
     *
     */
    public BarreRonde() {
        super();
        this.diametre = 1;   
    }
    
    /**
     *
     * @param diametre
     * @param densite
     * @param longueur
     * @param reference
     */
    public BarreRonde(double diametre, double densite, double longueur, String reference) {
        super(densite, longueur, reference);
        this.diametre = diametre;
    }

    /**
     *
     * @param diametre
     * @param cpy
     */
    public BarreRonde(double diametre, Barre cpy) {
        super(cpy);
        this.diametre = diametre;
    }
    
    /**
     *
     * @param autre
     */
    public BarreRonde(BarreRonde autre){
        super(autre.densite, autre.longueur, autre.reference);
        this.diametre = autre.diametre;
    }

    /**
     *Calcule la masse de la barre
     * @return
     */
    public double calculerMasse(){
        return longueur*densite*Math.PI*diametre;
    }
    
    /**
     *Affiche les information de la barre
     */
    public void afficher(){
        System.out.println("diametre : "+diametre);
        System.out.println("longueur : "+longueur);
        System.out.println("densité : "+densite);
        System.out.println();
        System.out.println("Masse : "+calculerMasse());
        System.out.println();
    }
}
