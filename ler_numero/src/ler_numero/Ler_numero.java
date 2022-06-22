/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ler_numero;
import java.util.Scanner;
/**
 *
 * @author ALUNO
 */
public class Ler_numero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite um numero:");
    
        int x = Integer.parseInt(entrada.nextLine());
        
        System.out.println("O numero digitado foi " + x);
            
    }
    
}  
