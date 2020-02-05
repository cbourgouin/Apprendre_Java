/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figGeometrique;

/**
 *
 * @author cbourgouin
 */
public class Point {
    double abscisse;
    double ordonnee;
    
    public Point(){
        this.abscisse = 1;
        this.ordonnee = 1;
    }
    
    public Point(double a, double o){
        this.abscisse = a;
        this.ordonnee = o;
    }
    
    public Point(Point g){
        this.abscisse = g.abscisse;
        this.ordonnee = g.ordonnee;
    }
    
    public void translater(double x, double y){
        this.abscisse += x;
        this.ordonnee += y;
    }
    
    public double calculerDistance(){
        return (Math.sqrt(this.abscisse*this.abscisse + this.ordonnee*this.ordonnee));
    }
    
    public double calculerDistancePoint(Point p){
        return Math.sqrt((p.abscisse*p.abscisse - this.abscisse*this.abscisse) + (p.ordonnee*p.ordonnee - this.ordonnee*this.ordonnee));
    }
    
    public void afficher(){
        System.out.println("coordonné du Point (" + this.abscisse + "," + this.ordonnee + ")");
    }
}
