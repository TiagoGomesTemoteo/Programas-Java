/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer_herança;

import javax.swing.JOptionPane;

/**
 *
 * @author 53919153x
 */
public class Agregado extends Funcionario{
    
   int dias_trabalhado;
   double valor_dia;
   
     

  
   
   public void calcular_salario(){
   
   /*Cadastro do funcionario*/
       
        nome = JOptionPane.showInputDialog(null,"Digite o nome");
   
        setor = JOptionPane.showInputDialog(null,"Digite o setor");
    
        valor_dia = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor do dia"));
       
        dias_trabalhado = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite Quantidade de dias de trabalho")); 
   
   
   /*Calculo de salario do funcionario*/
      
   salario = dias_trabalhado * valor_dia;

   }
   
   public void imprime(){
    
        JOptionPane.showMessageDialog(null,"Nome : "+nome+"\n"+"Setor : "+setor+"\n"+"Salario : "+salario);

}
   
 }
