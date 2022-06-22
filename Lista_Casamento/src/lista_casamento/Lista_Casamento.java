/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista_casamento;

import javax.swing.JOptionPane;

/**
 *
 * @author 53919153x
 */
public class Lista_Casamento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Convidado c = new Convidado();
        
        int menu;
        
        do{
        
        menu = Integer.parseInt(JOptionPane.showInputDialog("**** Menu de Opções ****"
                + "\n 1: Adicionar Convidado"
                + "\n 2: Listar"
                + "\n 3: Sair"
                + "\n"
                + "\n Digite uma opção"));
        
        if(menu <1 || menu>3){
            
        JOptionPane.showMessageDialog(null,"Opção Inválida");
               
        }
        else{
            
        if(menu == 1){
        c.cadastrar();
        }
         
        if(menu == 2){
        c.listar();
        }
        
        }

        
        }while(menu !=3); 
        

    }
    
}
