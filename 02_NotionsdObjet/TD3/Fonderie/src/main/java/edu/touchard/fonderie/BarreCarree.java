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
public class BarreCarree extends Barre {
    private double cote;

    public BarreCarree() {
        super();
        this.cote = 1;   
    }
    
    public BarreCarree(double cote, double densite, double longueur, String reference) {
        super(densite, longueur, reference);
        this.cote = cote;
    }

    public BarreCarree(double diametre, Barre cpy) {
        super(cpy);
        this.cote = diametre;
    }
}
