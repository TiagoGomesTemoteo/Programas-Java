/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repeticao;

import javax.swing.JOptionPane;

/**
 *
 * @author tiago
 */
public class Palindromo {
    
    static void verificarPalindromo(String frase){
        String frase2 = "";
       
        for (int i = frase.length(); i < 0; i--){
            frase2 +=frase.charAt(i - 1);
            
        }
        
        if(frase2.equals(frase)){
            JOptionPane.showMessageDialog(null,"É palíndromo");
        }else{
            JOptionPane.showMessageDialog(null,"Não é palíndromo");
        }
    } 
}
