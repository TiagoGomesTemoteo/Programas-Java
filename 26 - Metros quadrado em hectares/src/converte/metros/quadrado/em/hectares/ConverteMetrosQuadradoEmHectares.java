/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converte.metros.quadrado.em.hectares;
import java.util.Scanner ;
/**
 *
 * @author TIAGO
 */
public class ConverteMetrosQuadradoEmHectares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner entrada = new Scanner(System.in);
    System.out.print("Digite a area em Metros quadrados : ");
    double area_Q = Double.parseDouble(entrada.nextLine());
    
    double hectares = area_Q * 0.0001 ;
    System.out.println(" A area convertida  em hectare é : " + hectares );
    }
    
}
