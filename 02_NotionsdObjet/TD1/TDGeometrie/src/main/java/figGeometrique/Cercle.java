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
public class Cercle {
    private double rayon;
    
    public Cercle(){
        this.rayon = 1;
    }
    
    public Cercle(double ray){
        this.rayon = ray;
    }
    
    public Cercle(Cercle c){
        this.rayon = c.rayon;
    }
    
    public double calculerAire(){
        return (Math.PI*(this.rayon*this.rayon));
    }
    
    public double calculerPerimetre(){
        return (Math.PI*this.rayon*2);
    }
}
