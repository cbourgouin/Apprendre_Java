/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercice1;

/**
 *
 * @author cbourgouin
 */
public class Point {
    private int abscisse;
    private int ordonnee;
    
    public Point(){
        this.abscisse = 1;
        this.ordonnee = 1;
    }
    
    public Point(int a, int o){
        this.abscisse = a;
        this.ordonnee = o;
    }
    
    public Point(Point g){
        this.abscisse = g.abscisse;
        this.ordonnee = g.ordonnee;
    }
}
