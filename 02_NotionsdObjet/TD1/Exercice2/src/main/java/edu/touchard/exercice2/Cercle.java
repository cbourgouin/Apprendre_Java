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
public class Cercle {
    private int rayon;
    
    public Cercle(int val){
        this.rayon = val;
    }
    
    public Cercle(Cercle c){
        this.rayon = c.rayon;
    }
}
