/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qnt_onibus;

import javax.swing.JOptionPane;

/**
 *
 * @author 53919153x
 */
public class EntradaSaida {
    
    public String Entrada (String mensagem){
    String info = JOptionPane.showInputDialog(mensagem);
    
    return info;
    }
    public void Saida (String mensagem){
    JOptionPane.showMessageDialog(null,mensagem);
 
    }
    
}
