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
public class Compromissos extends Contatos{
    
private String  msg;
    
    
    Compromissos(){
    this("");
    }
    public Compromissos(String msg) {
        this.msg = msg;
    }
    

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
    
    
    public void adicionar_compromisso(){
    int op;
        

        
            op = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite"
                    + "\n1 Para adicionar compromisso"
                    + "\n2 Sair"));
            
            if(op==1){
              
                int qnt;
                
                qnt = Integer.parseInt(JOptionPane.showInputDialog(null,"Você deseja adicionar quantos Compromissos ?"));
                
                String vetor_compromisso [] = new String[qnt];
                int vetor_dia[] = new int[qnt];
                int vetor_mes[] = new int[qnt];
                
                
              for( int i = 0; i<vetor_compromisso.length;i++){  
       
                  
        nome = JOptionPane.showInputDialog(null,"Digite qual o "+(i+1)+" Compromisso");
        dia = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o dia do evento "+nome));
        
                
        vetor_compromisso[i] = nome;
        vetor_dia[i] = dia;
        
        
       
            
           
                
           
           
          
              }
        
        this.setMsg(msg);
        for(int i = 0; i<vetor_compromisso.length;i++){
        
            msg = msg +"Nome : "+vetor_compromisso[i]+" - "+"Dia : "+vetor_dia[i]+"\n";
        
       
            
              }
            
         
        
       }
}
   public void lista_compromissos(){                 
   
       JOptionPane.showMessageDialog(null,"Compromissos"
               + " : "+"\n"+this.getMsg());  
   
   }
  
   public void lista_feriados(){    
  
       JOptionPane.showMessageDialog(null,"Feriados Junho :"
             +"\n"        
             +"15 Quinta : Corpus Christi"
             ); 
       
  }
}
