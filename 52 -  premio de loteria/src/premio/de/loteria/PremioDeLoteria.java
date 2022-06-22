/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package premio.de.loteria;
import java.util.Scanner ;
/**
 *
 * @author TIAGO
 */
public class PremioDeLoteria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner entrada = new Scanner (System.in) ;
    System.out.print("Informe o valor do premio :");
    double premio = Double.parseDouble (entrada.nextLine ()) ;
    
    System.out.print("Informe quanto o 1º Amigo investil :");
    double a_1 = Double.parseDouble (entrada.nextLine ()) ;
    
    System.out.print("Informe quanto o 2º Amigo investil :");
    double a_2 = Double.parseDouble(entrada.nextLine ()) ;
    
    System.out.print("Informe quanto o 3º Amigo investil :");
    double a_3 = Double.parseDouble (entrada.nextLine ()) ;
    
    double amigo = a_1 + a_2 + a_3 ;
    double amigo_1 = a_1 /amigo;
    double amigo_2 = a_2 /amigo;
    double amigo_3 = a_3 /amigo;
    
    double pre_1 = premio * amigo_1   ;
    double pre_2 = premio * amigo_2   ;
    double pre_3 = premio * amigo_3   ;
    
    System.out.println("O 1º Amigo Ganhou :" + pre_1 );
    System.out.println("O 2º Amigo Ganhou :" + pre_2 );
    System.out.println("O 3º Amigo Ganhou :" + pre_3 );
    }  


}
