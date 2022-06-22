/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numero.inteiro;
import java.util.Scanner ;
/**
 *
 * @author TIAGO
 */
public class NumeroInteiro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner entrada = new Scanner (System.in) ;
    System.out.print("Digite um número inteiro : ");
    double n_int = Double.parseDouble(entrada.nextLine());
    
    double sucessor = n_int * 3 + 1;
    double antercesor = n_int * 2 - 1 ;
    
    double ante_suce = antercesor + sucessor ;
    
    System.out.println("O sucessor do triplo do numero inteiro +  o antercessor de seu dobro é " + ante_suce);
    
    }
    
}
