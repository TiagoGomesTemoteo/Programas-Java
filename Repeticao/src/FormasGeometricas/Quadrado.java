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
public class Quadrado {
    
    private double lado;
    private double area;
    private double perimetro;
    
    
    Quadrado(double lado){
        this.lado = lado;
        calcularArea();
        calcularPerimetro();
    }
    
    void calcularArea(){      
        area = lado * lado;
    }
    
    void calcularPerimetro(){
        perimetro = 4 * lado;
    }
    
    public double retornarArea(){
        return area;
    }
    
    public double retornarPerimetro(){
        return perimetro;
    }
    
    public void alterarLado(double lado){
        this.lado = lado;
        calcularArea();
        calcularPerimetro();
    }
    
}
