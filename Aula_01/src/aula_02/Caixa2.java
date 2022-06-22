/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_02;

import javax.swing.JOptionPane;

/**
 *
 * @author Tiago
 */
public class Caixa2 {
   
    
    double saldo = 10;
    
    public void entrar ( double valor ){
    
           
        
        double valo = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor para a entrada"));
        valor+=valo;
        
        this.saldo+=valor;
       
        JOptionPane.showMessageDialog(null , + saldo);
    }

   public void retirar (double valor){
             
           double  valo = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a ser retirado"));
  
           valor+=valo;
           
         if (valor >= this.saldo){
             System.out.println("valor invalido");
         }
         else{
         
          this.saldo-=valor;
          
          JOptionPane.showMessageDialog(null , + saldo);
         }
   }
}
