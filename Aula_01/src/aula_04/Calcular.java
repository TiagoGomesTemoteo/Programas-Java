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
public class Calcular {
    
    int n1, n2, result;
    
    void  somar (int num1, int num2){
    
     this. n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para o 1° numero"));      
     num1+=n1;
     
     this. n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para o 2° numero"));
     num2+=n2;
            
     int num3;
        
        num3 = num1+num2;
      JOptionPane.showMessageDialog(null,+num3);
      
        
    }
}
