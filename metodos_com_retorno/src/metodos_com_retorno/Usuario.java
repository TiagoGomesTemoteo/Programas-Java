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
public class Usuario {
 
    String nome,email,endereco;
    
    public Usuario(){
       this("","","");
      
    } 

    public Usuario (String nm , String email, String ende){
    
      this.nome=nm;
      this.email=email;
      this.endereco=ende;
      
      JOptionPane.showMessageDialog(null,nome+email+endereco);
    
    }
}
