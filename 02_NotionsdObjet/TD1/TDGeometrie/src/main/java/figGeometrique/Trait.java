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
public class Trait {
    private boolean pointillé;
    private Point p1;
    private Point p2;
    private double epaisseur;
    
    public Trait(){
        this.pointillé = Boolean.FALSE;
        this.p1 = new Point();
        this.p2 = new Point(2, 2);
        this.epaisseur = 1;
    }
    
    public Trait(boolean et, Point a, Point b, double ep){
        this.pointillé = et;
        this.p1 = new Point(a);
        this.p2 = new Point(b);
        this.epaisseur = ep;
    }
    
    public Trait(Trait tr){
        this.pointillé = tr.pointillé;
        this.p1 = new Point(tr.p1);
        this.p2 = new Point(tr.p2);
        this.epaisseur = tr.epaisseur;
    }
    
    public double calculerLongueur(){
        return this.p1.calculerDistancePoint(this.p2);
    }
}
