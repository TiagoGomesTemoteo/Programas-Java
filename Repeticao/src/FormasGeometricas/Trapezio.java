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
public class Trapezio {
    
    private double baseMaior; 
    private double baseMenor; 
    private double lado1; 
    private double lado2; 
    private double altura; 
    private double area; 
    private double perimetro;
    
    Trapezio (double baseMaior, double baseMenor, double altura, double lado1, double lado2){
        this.baseMaior = baseMaior;
        this.baseMenor = baseMenor;
        this.altura = altura;
        calcularAreaTrapezio();
        calcularPerimetroTrapezio();
    }
    
    void calcularAreaTrapezio(){
        area =  ((baseMaior + baseMenor)*altura)/2;
    }
    void calcularPerimetroTrapezio(){
        perimetro = baseMaior + baseMenor + lado1 + lado2;
    } 
    
    public double retornarArea(){
        return area;
    }
    
    public double retornarPerimetro(){
        return perimetro;
    }
}
