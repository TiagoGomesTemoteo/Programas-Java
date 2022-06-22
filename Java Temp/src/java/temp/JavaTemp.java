/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java.temp;
import java.util.Scanner;
/**
 *
 * @author ALUNO
 */
public class JavaTemp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner entrada = new Scanner (System.in);
    
    System.out.print ("Informe a temperatura em graus celsius:");
    double Celsius = Double.parseDouble(entrada.nextLine());
    
    double Kelvin = Celsius + 273.15;
    System.out.println("A Temperatura em graus Celsius é" + Kelvin);
    }
    
}
