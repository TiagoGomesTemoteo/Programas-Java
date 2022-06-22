/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_03;
import javax.swing.JOptionPane;
/**
 *
 * @author Tiago
 */
public class aula_03 {
   
    public static void main (String[] args){
   
       
            
        
        
        
        Percurso  ref = new Percurso();
     
       
           int op;
         do {
        op = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção \n 1 Cadastra \n 2 Listar Percurso "));
   
      
       
              switch(op){
        
            
            case 1:
            
                ref.Cadastrar_Percurso();
           
            JOptionPane.showMessageDialog( null,"Cadastro efetuado com sucesso");
                      

            break;
    
           
            case 2:
        
        ref.Listar_Percurso();
                   
      

        break;
       
        
        }
        
        if(op >=4 || op<1){
          
             JOptionPane.showMessageDialog( null,"Opção invalida");
        
             op = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção \n 1 Cadastra \n 2 Listar Percurso "));

        }
         }while(op!=3);
          
        }

}