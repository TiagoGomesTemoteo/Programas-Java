/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FormasGeometricas;

/**
 *
 * @author tiago
 */
public class Principal {
    public static void main(String[] args) {
       
        Quadrado quadrado = new Quadrado(2.0);
        Retangulo retangulo = new Retangulo(10.0, 10.0);
        Trapezio trapezio  = new Trapezio(10.0,10.0,10.0,10.0,10.0);       
        
        System.out.println("Área quadrado : "+quadrado.retornarArea());
        System.out.println("Perímetro: "+quadrado.retornarPerimetro());    
         
        System.out.println("Área retângulo : "+retangulo.retornarArea());
        System.out.println("Perímetro : "+retangulo.retornarPerimetro());
        
        System.out.println("Área trapézio : "+trapezio.retornarArea());
        System.out.println("Perímetro : "+trapezio.retornarPerimetro());
    }
    
        
}
