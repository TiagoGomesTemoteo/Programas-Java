/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package area_triangulo;
import java.util.Scanner ;
/**
 *
 * @author TIAGO
 */
public class Area_Triangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    Scanner entrada = new Scanner (System.in);
        System.out.println("Digite o valor da base do triangulo ");
    double base = Double.parseDouble(entrada.nextLine ());
    
        System.out.println("Digite o valor da altura do triangulo ");
    double altura = Double.parseDouble(entrada.nextLine ());
    
     if(base == 0 && altura == 0){
            System.out.println("Dados Invalidos");
        }else if (base > 0 && altura >0){ 
         
    double b_a = base * altura ;
    double tri = b_a / 2 ;
    
        System.out.println("A area do triangulo é" + tri);
        }
       
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
    
}
