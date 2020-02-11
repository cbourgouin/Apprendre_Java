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
public class BarreRectangle extends Barre {
    private double largeur;
    private double hauteur;

    public BarreRectangle() {
        super();
        this.largeur = 1;
        this.hauteur = 2;
    }
    
    public BarreRectangle(double largeur, double hauteur, double densite, double longueur, String reference) {
        super(densite, longueur, reference);
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    public BarreRectangle(double largeur, double hauteur, Barre cpy) {
        super(cpy);
        this.largeur = largeur;
        this.hauteur = hauteur;
    }
}
