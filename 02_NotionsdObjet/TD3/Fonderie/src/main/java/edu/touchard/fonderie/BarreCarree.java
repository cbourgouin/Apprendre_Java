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
public class BarreCarree extends Barre {
    private double cote;

    /**
     *
     */
    public BarreCarree() {
        super();
        this.cote = 1;   
    }
    
    /**
     *
     * @param cote
     * @param densite
     * @param longueur
     * @param reference
     */
    public BarreCarree(double cote, double densite, double longueur, String reference) {
        super(densite, longueur, reference);
        this.cote = cote;
    }

    /**
     *
     * @param diametre
     * @param cpy
     */
    public BarreCarree(double diametre, Barre cpy) {
        super(cpy);
        this.cote = diametre;
    }
    
    /**
     * Calcule la masse de la barre
     * @return
     */
    public double calculerMasse(){
        return longueur*densite*cote*cote;
    }
    
    /**
     *Affiche les information de la barre
     */
    public void afficher(){
        System.out.println("coté : "+cote);
        System.out.println("longueur : "+longueur);
        System.out.println("densité : "+densite);
        System.out.println();
        System.out.println("Masse : "+calculerMasse());
        System.out.println();
    }
}
