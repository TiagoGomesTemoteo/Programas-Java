/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer_controle_pessoal;

import javax.swing.JOptionPane;

/**
 *
 * @author Tiago
 */
public class Carro {

    private String cor,modelo,marca;
    private double  combustivel;

    public double getVl_mes() {
        return Vl_mes;
    }

    public void setVl_mes(double Vl_mes) {
        this.Vl_mes = Vl_mes;
    }
    private double Vl_mes;
    
    
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(double combustivel) {
        this.combustivel = combustivel;
    }
    
     Carro(){
     
         this(0,"","","",0);
     } 
   
     Carro(double Vl_mes,String cor, String modelo, String marca, double combustivel) {
        this.Vl_mes=Vl_mes;
        this.cor = cor;
        this.modelo = modelo;
        this.marca = marca;
        this.combustivel = combustivel;
    }
   
     public void dadosCarro(){
     this.setCor(cor);
     this.setModelo(modelo);
     this.setMarca(marca);
     
     
     cor = JOptionPane.showInputDialog(null,"Digite a cor do seu carro ");
     modelo =  JOptionPane.showInputDialog(null,"Digite o modelo do seu carro ");
     marca = JOptionPane.showInputDialog(null,"Digite a marca do seu carro ");
     
     }

     public void abastecer(){
     
         this.setCombustivel(combustivel);  
     
         combustivel = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite quantas vezes voce abasteceu por mes  "));
     
         
     }

    public void custoAbastecimento(){
    
        for(int i = 0; i<combustivel;i++){ 
          int quantidade;
          
          quantidade= Integer.parseInt(JOptionPane.showInputDialog(null,"Quanto voce colocou no "+(i+1)+" abastecimento"));
       
          
          Vl_mes+= quantidade;
        }
        
    }
}
