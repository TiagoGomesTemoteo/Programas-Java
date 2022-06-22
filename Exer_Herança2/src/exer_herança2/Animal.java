/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer_herança2;

import javax.swing.JOptionPane;

/**
 *
 * @author 53919153x
 */
public class Animal {
    
    int peso;
    String comida;
    
    Animal(int peso, String comida){
    
    this.peso=peso;
    this.comida=comida;
    }
    
    void imprime(){
    
    JOptionPane.showMessageDialog(null,"peso : "+peso+"\n"+"Comida : "+comida);
    }
}
