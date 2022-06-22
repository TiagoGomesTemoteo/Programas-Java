/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_05;

import javax.swing.JOptionPane;





/**
 *
 * @author 53919153X
 */
public class Pessoa {
    
    private String pessoa;
    
    public String getPessoa(){// pegar valores
   
    return pessoa;
   
   }

   public void setPessoa(String pessoa){//inserir valores
   this.pessoa = pessoa; 
   

   JOptionPane.showMessageDialog(null,pessoa);
   
   }

}

