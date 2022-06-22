/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos_com_retorno;

import javax.swing.JOptionPane;

/**
 *
 * @author 53919153X
 */
public class aula_4 {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
    
        Metodos_com_retorno  ref = new Metodos_com_retorno ();
        
       int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1° numero")); 
       
       int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2° numero"));
       
       JOptionPane.showMessageDialog(null," Multiplicação "+ref.mult(num1,num2)+"\n Adicao " +ref.adicao(num1,num2)+ "\n Divisao "+ref.divi(num1,num2)+" \n Subitraçã,o "+ ref.sub(num1,num2) );
        
       
    }
}
