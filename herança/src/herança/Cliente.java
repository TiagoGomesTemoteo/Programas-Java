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
public class Cliente extends Pessoa{
   
    String cpf;
    
    public void imprime(){
    
    JOptionPane.showMessageDialog(null,"O nome do cliente é "+nome+ "\n" + " CPF" +cpf);
    }
}
