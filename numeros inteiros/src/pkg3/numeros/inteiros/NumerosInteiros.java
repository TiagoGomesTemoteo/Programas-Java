/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3.numeros.inteiros;
import java.util.Scanner ;
/**
 *
 * @author ALUNO
 */
public class NumerosInteiros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   char equacao ;
        Scanner entrada = new Scanner (System.in);
    System.out.println("Digite o 1º Número inteiro");
    double n_1 = Double.parseDouble(entrada.nextLine ());
    
    System.out.println("Digite o 2º Número inteiro");
    double n_2 = Double.parseDouble(entrada.nextLine ());
    
    System.out.println("Digite o 3º Número inteiro");
    double n_3 = Double.parseDouble(entrada.nextLine ());
    
    System.out.println("Escreva o numero do tipo de equaçao desejada ( 1 = Geometrica) (2 = ponderada) (3 = harmonica) (4 = aritmética)");
    equacao = entrada.nextLine().charAt(0);
    
// O case so vai ler o primeiro numero digitado
    
    
    switch(equacao){
        case '1' : {
       Math.cbrt(n_1 * n_2 * n_3);
       System.out.println("Em forma Geometrica" + Math.cbrt(n_1 * n_2 * n_3) );
        break  ; 
        }
        case '2' :{
        double ponderada = n_1 + (2 * n_2) + ( 3 * n_3);
        System.out.println("Em formqa ponderada" + ponderada);
        break ;
        }
        
        case '3' :{
        double harmonica =  1 /(1 / n_1) + (1 / n_2) + ( 1 / n_3);
        System.out.println("Em forma harmonica" + harmonica);
        break;
        }
        case '4' :{
        double aritmetrica = (n_1 + n_2 + n_3) / 3 ;
        System.out.println("Em Forma aritmetica" + aritmetrica);
        break ;
        }    
        default :
                
     System.out.println("Voce nao escolheu uma das formas disponiveis");
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
    
    
    
    
    
    
    
    }
    
}
