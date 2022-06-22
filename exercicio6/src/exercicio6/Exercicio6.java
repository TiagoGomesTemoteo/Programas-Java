/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio6;
import java.util.Scanner;
/**
 *
 * @author ALUNO
 */
public class Exercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner entrada = new Scanner (System.in);
    
        System.out.println("Digite uma temperatura em celsius");
    double x = Double.parseDouble(entrada.nextLine ());
    
    double f = x * (9.0/5.0)+ 32.0;
        System.out.println("O numero confertido é " + f);
    }
    
}
