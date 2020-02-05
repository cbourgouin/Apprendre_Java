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
public class Geometrique {
    public static void main(String[] args) {
        TestFigure test = new TestFigure(new Carre(5), new Cercle(5), new Trait(false, new Point(), new Point(2, 3), 0.8));
        test.afficherAireCarre();
        test.afficherAireCercle();
        test.afficherLongueurTrait();
        
    }
    
}
