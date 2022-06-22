/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cartao;

import javax.swing.JOptionPane;

/**
 *
 * @author 53919153x
 */
public class Cartao {

    int numero;
    String nome;

    public Cartao(String nome) {
        this.nome = nome;
    }

    

    public Cartao(int numero) {

        this.numero = numero;

    }

    public void sortea() {

        int vetor[] = new int[6];

        for (int i = 0; i < vetor.length; i++) {

            vetor[i] = this.numero = 0 + (int) (Math.random() * 100);

        }
        
        
        String msg = "Cartão " +  this.nome + " Números: \n";
        
        
        for (int i = 0; i < vetor.length; i++) {
           
            msg = msg + vetor[i] + "\n";
        }
        
        JOptionPane.showMessageDialog(null, msg);

    }

}
