/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista_casamento;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author 53919153x
 */
public class Convidado {
  
   List  cadastroConvidado = new ArrayList();
    
   
   private String nome, telefone;


  

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public Convidado(){
        
    this("","");
    }
    public Convidado(String nome, String telefone) {
 
        this.nome = nome;
        this.telefone = telefone;
    }
    
    void cadastrar(){
        
   
        
    nome = JOptionPane.showInputDialog("Digite o nome");
    
    telefone = JOptionPane.showInputDialog("Digite o telefone");
    

    cadastroConvidado.add(nome);
    cadastroConvidado.add(telefone);
    
    JOptionPane.showMessageDialog(null,"Cadastro efetuado com sucesso");
    
    }
    
   
   void listar(){
       
   JOptionPane.showMessageDialog(null,cadastroConvidado);
 
   }
   
}
