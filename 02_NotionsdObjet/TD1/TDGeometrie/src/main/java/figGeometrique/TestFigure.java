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
public class TestFigure {
    private Carre car;
    private Cercle cer;
    private Trait tra;
    
    public TestFigure(){
        this.car = new Carre();
        this.cer = new Cercle();
        this.tra = new Trait();
    }
    
    public TestFigure(Carre ca, Cercle ce, Trait tr){
        this.car = ca;
        this.cer = ce;
        this.tra = tr;
    }
    
    public void afficherAireCarre(){
        System.out.println("Aire du Carré : " + this.car.calculerAire());
    }
    
    public void afficherAireCercle(){
        System.out.println("Aire du Cercle : " + this.cer.calculerAire());
    }
    
    public void afficherLongueurTrait(){
        System.out.println("Longueur du trait : " + this.tra.calculerLongueur());
    }
}
