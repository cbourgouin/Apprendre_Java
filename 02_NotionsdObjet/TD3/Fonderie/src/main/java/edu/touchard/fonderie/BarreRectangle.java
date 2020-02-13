/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.touchard.fonderie;

/**
 *Barre rectangle
 * @author cbourgouin
 */
public class BarreRectangle extends Barre {
    private double largeur;
    private double hauteur;

    /**
     *
     */
    public BarreRectangle() {
        super();
        this.largeur = 1;
        this.hauteur = 2;
    }
    
    /**
     *
     * @param largeur
     * @param hauteur
     * @param densite
     * @param longueur
     * @param reference
     */
    public BarreRectangle(double largeur, double hauteur, double densite, double longueur, String reference) {
        super(densite, longueur, reference);
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    /**
     *
     * @param largeur
     * @param hauteur
     * @param cpy
     */
    public BarreRectangle(double largeur, double hauteur, Barre cpy) {
        super(cpy);
        this.largeur = largeur;
        this.hauteur = hauteur;
    }
    
    /**
     *
     * @param rec
     * @param cpy
     */
    public BarreRectangle(BarreRectangle rec, Barre cpy) {
        super(cpy);
        this.largeur = rec.largeur;
        this.hauteur = rec.hauteur;
    }
    
    /**
     *Calcule la masse de la barre
     * @return
     */
    public double calculerMasse(){
        return longueur*densite*hauteur*largeur;
    }
    
    /**
     *Affiche les information de la barre
     */
    public void afficher(){
        System.out.println("largeur : "+largeur);
        System.out.println("hauteur : "+hauteur);
        System.out.println("longueur : "+longueur);
        System.out.println("densité : "+densite);
        System.out.println();
        System.out.println("Masse : "+calculerMasse());
        System.out.println();
    }
}
