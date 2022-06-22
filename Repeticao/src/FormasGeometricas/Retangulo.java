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
public class Retangulo {
    
   private double altura;
   private double comprimento; 
   private double area; 
   private double perimetro;
    
    Retangulo(double altura, double comprimento){
        this.altura = altura;
        this.comprimento = comprimento;
        calcularArea();
        calcularPerimetro();
    }
    
    void calcularArea(){
        area = comprimento * altura;
    }
    
    void calcularPerimetro(){
        perimetro = ((altura * 2) + (comprimento * 2));
    }
    
    public double retornarArea(){
        return area;
    }
    public double retornarPerimetro(){
        return perimetro;
    }
    
}
