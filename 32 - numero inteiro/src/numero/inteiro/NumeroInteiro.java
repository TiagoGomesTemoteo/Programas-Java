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
    Scanner entrada = new Scanner (System.in);
    System.out.printf("Digite um número inteiro");
    double inteiro = Double.parseDouble(entrada.nextLine ());
    
    
    double sucessor = inteiro * 3  + 1;
    double antercessor = inteiro * 2 - 1 ;
    
    double anter_suce = sucessor + antercessor ;
    
    System.out.println("O sucessor do triplo + o dobro do antercessor é" + anter_suce);
    
    
    
    
    
    
    }
    
}
