/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banques;

/**
 *
 * @author cbourgouin
 */
public class CompteBancaire {
    private double soldes;
    private double decouvert;
    
    public CompteBancaire(){
        this.soldes = 80;
        this.decouvert = 0;
    }
    
    public CompteBancaire(double sol, double dec){
        this.soldes = sol;
        this.decouvert = dec;
    }
    
    public CompteBancaire(CompteBancaire cb){
        this.soldes = cb.soldes;
        this.decouvert = cb.decouvert;
    }
    
    public void deposer(double arg){
        this.soldes += arg;
    }
    
    public void retirer(double arg){
        if(arg < 0 || arg > this.soldes||this.soldes - arg < this.decouvert){
            System.out.println("prélèvement refusé");
        } else {
            System.out.println("prélèvement autorisé");
            this.soldes -= arg;
        }
    }
    
    public void afficher(){
        System.out.println("Soldes du compte : " + this.soldes);
        System.out.println("Découvert autorisé : " + this.decouvert);
    }
    
    public void changerDecouvert(double dec){
        this.decouvert = dec;
    }
}
