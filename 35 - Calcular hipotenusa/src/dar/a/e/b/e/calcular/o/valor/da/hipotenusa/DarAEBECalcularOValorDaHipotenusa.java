/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dar.a.e.b.e.calcular.o.valor.da.hipotenusa;
import static java.lang.Math.sqrt;
import java.util.Scanner ;


/**
 *
 * @author TIAGO
 */
public class DarAEBECalcularOValorDaHipotenusa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner entrada = new Scanner (System.in) ;
    
    System.out.print("Digito o valor do cateto A : ");
    double cat_a = Double.parseDouble(entrada.nextLine ());
    
    System.out.print("Digito o valor do cateto B :");
    double cat_b = Double.parseDouble(entrada.nextLine ());
    
    double qua_cat_b = cat_b * cat_b ;
    
    double qua_cat_a = cat_a * cat_a ;
    
    double qua_a_b   = qua_cat_a + qua_cat_b ;
    
   
    
    System.out.println( "O valor da hipotenusa é :" + Math.sqrt(qua_a_b) );
             
    
    
    }
    
}
