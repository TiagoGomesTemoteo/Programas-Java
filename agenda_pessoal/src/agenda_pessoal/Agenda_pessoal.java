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
public class Agenda_pessoal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Amigos a1 = new Amigos();
    Empresa e1 = new Empresa();
    Familiares f1 = new Familiares();
    Compromissos c1 = new Compromissos();
    
        
        
        JOptionPane.showMessageDialog(null," **** AGENDA PESSOAL **** ");
        
        int op;
        
        do{
        
            op = Integer.parseInt(JOptionPane.showInputDialog(null," Digite:"
                + "\n1   Contato amigo"
                + "\n2   Contato empresa"
                + "\n3   Contato  familiares"
                + "\n4   Listar contatos"
                + "\n5   Registrar compromissos"
                + "\n6   Listar compromissos"
                + "\n7   Listar Feriados"
                + "\n8   Sair"));
                
        
            if(op==1){ a1.adicionar_amigo(); }
            else if(op==2){ e1.adicionar_empresa(); }
            else if(op==3){ f1.adicionar_familiar();} 
            else if(op==4){
            a1.listar_amigos();
            e1.lista_empresa();
            f1.lista_familiar();
            }
            else if(op==5){ c1.adicionar_compromisso();}
            else if(op==6){ c1.lista_compromissos();}
            else if (op==7){c1.lista_feriados();}
            else if ( op!=8 &&op !=7 && op !=6 && op !=5 && op!=4 && op!=3 && op!=2 && op!=1){
            
                JOptionPane.showMessageDialog(null,"Opção inválida");
            }
            
        }while(op!=8);
        
    
    
    
    
    
    
    
    
    
    } 
    
}
