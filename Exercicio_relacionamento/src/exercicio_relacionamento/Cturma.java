/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_relacionamento;

import javax.swing.JOptionPane;

/**
 *
 * @author 53919153X
 */
public class Cturma {

    private String codigo;
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Cturma(){
    
    this(" ");
    } 
    
    public Cturma(String codigo) {
        this.codigo = codigo;
    }
     
    
     
   public void Consultar(){
    
    JOptionPane.showMessageDialog(null,"Codigo"+codigo);
    }
}
