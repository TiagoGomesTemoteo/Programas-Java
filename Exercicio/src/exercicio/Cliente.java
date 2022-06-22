/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio;

import javax.swing.JOptionPane;





/**
 *
 * @author 53919153X
 */
public class Cliente {
 
    String nome ;
    int codigo;
   

    public Cliente (){
    
    this("",0);
   
    }
   
    
    public Cliente (String nm , int cd){
  
     this.nome = nm;
     this.codigo = cd;
 
     this.nome = JOptionPane.showInputDialog("Digite  o nome do cliente");
     this.codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o  codigo do cliente"));
    
     System.out.println(nome+"\n"+codigo);
    }

  
}

