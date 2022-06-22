/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda_pessoal;

import javax.swing.JOptionPane;

/**
 *
 * @author Tiago
 */
public class Empresa extends Contatos{
    private String  msg;
    
    
    Empresa(){
    this("");
    }
    public Empresa(String msg) {
        this.msg = msg;
    }
    

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
    
    
    public void adicionar_empresa(){
    int op;
        

        
            op = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite"
                    + "\n1 Para adicionar contato"
                    + "\n2 Sair"));
            
            if(op==1){
              
                int qnt;
                
                qnt = Integer.parseInt(JOptionPane.showInputDialog(null,"Você deseja adicionar quantos contatos de empresa ?"));
                
                String vetor_nome [] = new String[qnt];
                int vetor_telefone[] = new int[qnt];
                String vetor_email[] = new String[qnt];
                
              for( int i = 0; i<vetor_nome.length;i++){  
       
                  
        nome = JOptionPane.showInputDialog(null,"Digite o nome da "+(i+1)+" empresa");
        telefone = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o numero de telefone do(a) "+nome));
        email = JOptionPane.showInputDialog(null,"Digite o email da "+(i+1)+" empresa");
                
        vetor_nome[i] = nome;
        vetor_telefone[i] = telefone;
        vetor_email[i] = email;
              }
        
        
        this.setMsg(msg);
        for(int i = 0; i<vetor_nome.length;i++){
        
            msg = msg +"Nome : "+vetor_nome[i]+" - "+"Telefone : "+vetor_telefone[i]+"\n"
            +"Email "+email;
        
       
            
              }
            
         
        
       }
}
   public void lista_empresa(){                 
   
       JOptionPane.showMessageDialog(null,"Empresa : "+"\n"+this.getMsg());  
   
   }

}