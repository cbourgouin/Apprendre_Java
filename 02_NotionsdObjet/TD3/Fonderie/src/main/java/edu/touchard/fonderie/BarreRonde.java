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
public class BarreRonde extends Barre {
    private double diametre;

    public BarreRonde() {
        super();
        this.diametre = 1;   
    }
    
    public BarreRonde(double diametre, double densite, double longueur, String reference) {
        super(densite, longueur, reference);
        this.diametre = diametre;
    }

    public BarreRonde(double diametre, Barre cpy) {
        super(cpy);
        this.diametre = diametre;
    }

}
