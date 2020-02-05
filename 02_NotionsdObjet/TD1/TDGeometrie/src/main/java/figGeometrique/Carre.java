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
public class Carre {
    private double cote;
    
    public Carre(){
        this.cote = 1;
    }
    
    public Carre(double val){
        this.cote = val;
    }
    
    public Carre(Carre c){
        this.cote = c.cote;
    }
    
    public double calculerAire(){
        return this.cote*this.cote;
    }
    
    public double calculerPerimetre(){
        return this.cote*4;
    }
}
