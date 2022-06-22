/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer.polimorfismo.pkg3;

/**
 *
 * @author 53919153X
 */
public class ExerPolimorfismo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  
        Leao l = new Leao("Fofinho","Leao Branco");
        Aguia a = new Aguia("Alegria","Imperial");
       
        
        System.out.println("Leão\n ");
        
        l.comunicar();
        l.movimentar();
        
        System.out.println("\n");
        System.out.println("Aguia \n");
        a.comunicar();
        a.movimentar();
        
        
    }
    
}
