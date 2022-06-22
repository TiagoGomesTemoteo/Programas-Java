/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soma_3;
import java.util.Scanner;
/**
 *
 * @author ALUNO
 */
public class Soma_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   Scanner entrada = new Scanner(System.in);
    
   System.out.println("Digite primeiro numero:");
   int x = Integer.parseInt(entrada.nextLine());
    
   Scanner entrada1 = new Scanner(System.in);
   System.out.println("Digite secundo numero:");
   int y = Integer.parseInt(entrada1.nextLine());
    
   Scanner entrada2 = new Scanner(System.in);
   System.out.println("Digite terceiro numero:");
   int z = Integer.parseInt(entrada1.nextLine());  
    
   int soma = x + y + z ;
    
        System.out.println("A Soma dos 3 numeros é " + soma ) ; 
    }
    
}
