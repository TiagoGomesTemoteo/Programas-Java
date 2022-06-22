/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package produto;
import java.util.Scanner;
/**
 *
 * @author TIAGO
 */
public class Produto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    char estado ;
    
            Scanner  entrada = new Scanner (System.in);
    
    System.out.print("Entre  com o  valor de venda :");
    double valor_pro = Double.parseDouble (entrada.nextLine ()) ;
    
    System.out.print("Digite o estado destinado ( M = MG ; S = SP ; R = RJ ; G = MS ) ");
    estado = entrada.nextLine().charAt (0);
    
    
    switch (estado){
        case 'M' : {
     double imposto = valor_pro * 7 / 100;
     double valor_final = imposto + valor_pro ;
      System.out.println("O valor  final do produto é " + valor_final);
        break ;
        }
        case 'S':{
        double imposto_2 = valor_pro * 12 / 100 ;
        double valor_final_2 = imposto_2 + valor_pro ;
        System.out.println("O valor final do produto é " + valor_final_2);
        break ;
        }
        case 'R' : {
        double imposto_3 = valor_pro * 15 / 100 ;
        double valor_final_3 = imposto_3 + valor_pro ;
        System.out.println("O valor final do produto é " +valor_final_3);
        break ;
        }
        case 'G' : {
        double imposto_4 = valor_pro * 8 / 100 ;
        double valor_final_4 = imposto_4 + valor_pro ;
        System.out.println("O valor final do produto é " + valor_final_4);
        break ;
        } 
        default :
        System.out.println("Erro!!! Erro!!! Erro!!! Erro!!! Erro!!! Erro!!!");
    }
   
   
   
   
    }
    
    }
    
    
    
    
    
    
    
    
    
    
    
   

