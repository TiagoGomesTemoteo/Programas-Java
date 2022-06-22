/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Combustivel;
import java.util.Scanner;
/**
 *
 * @author ALUNO
 */
public class combustivel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    Scanner entrada = new Scanner(System.in);
        System.out.printf("Digite o consumo medio do carro: ");
   
    double km_p =Double.parseDouble(entrada.nextLine());
    
    if(km_p < 8);{
    System.out.println("Venda o Carro");
    
    if(km_p > 8 && km_p <= 14);{
    System.out.println("Economico");
    
    if(km_p > 14);{
    System.out.println("Super Economico");
    }
    }
    
    }
    
    
    }
    
}
