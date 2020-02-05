/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.touchard.exercice2;

/**
 *
 * @author cbourgouin
 */
public class Ligne {
    private int x;
    private int y;
    private float epaisseur;
    
    public Ligne(int abs, int ord, int lar){
        this.x = abs;
        this.y = ord;
        this.epaisseur = lar;
    }
    
    public Ligne(Ligne l){
        this.x = l.x;
        this.y = l.y;
        this.epaisseur = l.epaisseur;
    }
}
