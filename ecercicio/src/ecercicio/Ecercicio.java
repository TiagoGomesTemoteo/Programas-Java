/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecercicio;
import java.util.Scanner;
/**
 *
 * @author ALUNO
 */
public class Ecercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
       
      System.out.println("Digite um numero");
      double x = Double.parseDouble(entrada.nextLine ());    
     
       
        double numero = x*x;
        System.out.println("O quadrado do numero é " + numero+ "\n");
    }
    
}
