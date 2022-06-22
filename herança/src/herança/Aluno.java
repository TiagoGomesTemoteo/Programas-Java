/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herança;

import javax.swing.JOptionPane;

/**
 *
 * @author 53919153x
 */
public class Aluno extends Pessoa {
    
    String RA;
    
    public void imprime_ra(){
    
    JOptionPane.showMessageDialog(null,"Nome do Aluno"+nome+"\n"+"RA"+RA);
    }
}
