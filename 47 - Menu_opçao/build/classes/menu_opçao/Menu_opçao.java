/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu_opçao;
import java.util.Scanner;
/**
 *
 * @author TIAGO
 */
public class Menu_opçao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    char opcao;
    Scanner entrada = new Scanner (System.in);
    
      
      System.out.println("Digite um numero ");
      double n_1 = Double.parseDouble(entrada.nextLine ());
      
      System.out.println("Digite outro numero");
      double n_2 = Double.parseDouble(entrada.nextLine ());
      
        
        
       
        System.out.println("+----------------------+");
        System.out.println("|Adiçao (opçao 1)      |");
        System.out.println("|Subtraçao (opçap 2)   |");
        System.out.println("|Multiplicaçao(opçao 3)|");
        System.out.println("|Divisao (opçao 4)     |");
        System.out.println("|Saida (opçap 5 )      |");
        System.out.println("+----------------------+");
    
    
    
        System.out.println("Escolha uma das opçoes");
        opcao = entrada.nextLine().charAt(0);
    switch (opcao){
        case '1':{
        double adiçao = n_1 + n_2;
            System.out.println("A Adiçao dos numeros = " + adiçao);
            
        }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
    
    
    
    
    
    }      
    
}
