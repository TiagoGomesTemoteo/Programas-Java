/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_04;
import javax.swing.JOptionPane;

/**
 *
 * @author 53919153X
 */
public class Caixa {
     double saldo = 10;
    
   void entrar ( double valor ){
    
           
        
         valor = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor para a entrada"));
        
        
        this.saldo+=valor;
       
        JOptionPane.showMessageDialog(null , + saldo);
    }

    void retirar (double valor){
             
             valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a ser retirado"));
  
          
           
         if (valor >= this.saldo){
             System.out.println("valor invalido");
         }
         else{
         
          this.saldo-=valor;
          
         
          JOptionPane.showMessageDialog(null , + saldo);
         
         }
        
         
          
   }
}

   

  


