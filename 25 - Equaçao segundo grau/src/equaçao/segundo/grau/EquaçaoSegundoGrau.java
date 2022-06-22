/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equaçao.segundo.grau;
import java.util.Scanner ;
/**
 *
 * @author TIAGO
 */
public class EquaçaoSegundoGrau {
  

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner entrada = new Scanner (System.in);
    
    System.out.println("Informe o valor A ");
    double A = Double.parseDouble(entrada.nextLine ());
    
    System.out.println("Informe o valor B ");
    double B = Double.parseDouble(entrada.nextLine ());
    
    System.out.println("Informe o valor C ");
    double C = Double.parseDouble(entrada.nextLine ());
    
    double delta = (B * B) -4 * A * C ;
    
    if(delta > 0){
        double x1 = ((-B) - Math.sqrt(delta))/ 2 * A  ;
        double x2 = ((-B) + Math.sqrt(delta))/ 2 * A  ;
    System.out.println("A primeira possibilida de Raiz é"+x1 );
    System.out.println("A Secunda possibilidade de  Raiz é" + x2);
    }
    else if (delta == 0 ){
        double x3 = ((- B)/ 2 * A );
    System.out.println("Raiz unica " + x3);
    }
    
    else if (delta < 0 ){
    System.out.println("Não ha raiz");
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
    
}
