/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio7;

import java.util.Scanner;

/**
 *
 * @author ALUNO
 */
public class Exercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner entrada = new Scanner (System.in);
    
        System.out.println("Digite uma temperatura em Farenheit ");
    double f = Double.parseDouble(entrada.nextLine ());
    
    double c = 5 * (f  - 32 ) / 9.0 ;
        System.out.println("O numero confertido é " + c);
   
    }
    
}
