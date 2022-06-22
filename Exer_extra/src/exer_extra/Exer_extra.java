/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer_extra;

import javax.swing.JOptionPane;

/**
 *
 * @author 53919153X
 */
public class Exer_extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    Carro v = new Carro();
    v.ligarMotor();
    
    if(v.pintar("")==false){
     JOptionPane.showMessageDialog(null,"Seu carro ja tem essa cor");
    }
    else{
      JOptionPane.showMessageDialog(null,"Seu carro foi pintado com sucesso");
    }
    
   
    
    
    }
    
}
