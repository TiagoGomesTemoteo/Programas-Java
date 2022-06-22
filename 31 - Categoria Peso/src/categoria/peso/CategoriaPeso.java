/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package categoria.peso;
import java.util.Scanner;
/**
 *
 * @author TIAGO
 */
public class CategoriaPeso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner entrada = new Scanner (System.in);
    
    System.out.println("Informe seu peso : ");
    double peso = Double.parseDouble(entrada.nextLine ());
    
    System.out.println("Informe sua  altura : ");
    double altura = Double.parseDouble(entrada.nextLine ());
    
   
    if ((altura  < 1.20) && (peso < 61 )){
    System.out.println("A");
    }
    else if ((altura <1.20) && (peso > 60 ) && (peso < 90)){
    System.out.println("D");
    }
    else if ((altura <1.20) && (peso > 90)){
    System.out.println("G");
    }
    
    
    else if ((altura >1.20) && (altura <1.71) && (peso < 61)){
    System.out.println("B");
    }
    else if ((altura >1.20 ) && (altura <1.71) && (peso > 60) && (peso <90)){
    System.out.println("E");
    }
    else if ((altura >1.20) && (altura <1.71) && (peso >90)){
    System.out.println("H");
    }
   
    
    else if ((altura > 1.70) && (peso < 61) ){
    System.out.println("C");
    }
    else if ((altura >1.70) && (peso > 60) && (peso <90)){
    System.out.println("F");
    }
    else if ((altura > 1.70) && (peso >90)){
    System.out.println("I");
    }
    
    
    
    
    
    
    }
    
}
