/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_03;
import javax.swing.JOptionPane;
/**
 *
 * @author Tiago
 */
public class Percurso {
    
      float Kmpercurso;
      float Consumo_combustivel;
      float pedagio;
      String percurso;
      float valor_gasolina;
      float vlpedagio; 
      
      
      double val_ped;
      
    public void Cadastrar_Percurso(){
    
     
      
  this.percurso = JOptionPane.showInputDialog("Qual foi o destino do percurso ? ");
  
  this. Kmpercurso = Float.parseFloat(JOptionPane.showInputDialog("Qual foi a distancia em Km do percurso ? "));
  
  this.Kmpercurso *= 2;  
  
  this. Consumo_combustivel = Float.parseFloat(JOptionPane.showInputDialog("KM por L ? "));
  
  
  
  this. valor_gasolina = Float.parseFloat(JOptionPane.showInputDialog("Qual o valor da gasolina")); 
  

  
  float pedagio = Float.parseFloat(JOptionPane.showInputDialog("Por Quantos pedagios vc passou ? "));
   
  for(int  i=0; i<pedagio;i++){
       
        float vlpedagio = Float.parseFloat(JOptionPane.showInputDialog("Qual o valor do pedagio "+(i+1)+ "? "));
    
       this.val_ped+=vlpedagio;  
  }
  
 
    }
   public void Listar_Percurso(){
   
        
      float ConG = (this.Kmpercurso / this.Consumo_combustivel);
       
      float Valor_G = (this.valor_gasolina * ConG ) *2 ;
  
      float  Pedagio = (float) (this.val_ped * 2) ;
      
       float  total = Pedagio + Valor_G;
      
   JOptionPane.showMessageDialog( null,"Destino "+this.percurso
   +"\n Distancia percorrida "+this.Kmpercurso+"\n Gasto em gasolina "+ConG+" litros"
   +"\n Valor pago na gasolina "+Valor_G+"\n Valor gasto no pedagio "+Pedagio+"\n Total  Gasto "+total       
   );
   }

}
