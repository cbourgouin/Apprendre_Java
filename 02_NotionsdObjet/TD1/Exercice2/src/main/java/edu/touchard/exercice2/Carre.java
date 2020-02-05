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
public class Carre {
    private int cote;
    
    public Carre(int val){
        this.cote = val;
    }
    
    public Carre(Carre c){
        this.cote = c.cote;
    }
}
