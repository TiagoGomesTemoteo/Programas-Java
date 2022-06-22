/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaacademico;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author tiago
 */
public class SistemaAcademico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Alunos alunos = new Alunos();
        Professores professores = new Professores();
        
        List<Alunos> listaAlunos = new <Alunos>ArrayList();
        List<Professores> listaProfessores = new <Professores>ArrayList();
        
        boolean pararExibirMenu = false;
        try{    
            do{
                String escolha = JOptionPane.showInputDialog(null,"Escolha uma opção"
                        + "\n1. Cadastrar aluno"
                        + "\n2. Cadastrar professor"
                        + "\n3. Excluir aluno"
                        + "\n4. Excluir professor"
                        + "\n5. Alterar aluno"
                        + "\n6. Alterar professor"
                        + "\n7. Pesquisar aluno"
                        + "\n8. Pesquisar professor"
                        + "\n9. Sair","Sistema Acadêmico",JOptionPane.QUESTION_MESSAGE);
                switch(escolha){
                    case "1":  
                        alunos = new Alunos();
                        alunos.cadastrar();
                        listaAlunos.add(alunos);                  
                        break;
                    case "2":
                        professores.cadastrar();
                        listaProfessores.add(professores);                    
                        break;
                    case "3":     
                        alunos.removerAluno(listaAlunos);
                        break;
                    case "4":
                        professores.removerProfessor(listaProfessores);
                        break;
                    case "5":
                        alunos.alterar(listaAlunos);                   
                        break;
                    case "6":
                        professores.alterar(listaProfessores);
                        break;
                    case "7":
                        alunos.pesquisar(listaAlunos);
                        break;
                    case "8":
                        professores.pesquisar(listaProfessores);
                        break;                    
                    case "9":
                        if(JOptionPane.showInputDialog(null,"Deseja realmente sair? \n1.Sim \n2.Não").equals("1")){
                            pararExibirMenu = true;
                        }
                        break;
                    case "":
                        JOptionPane.showMessageDialog(null,"Nenhuma opção foi escolhida");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null,"Escolha uma opção válida");                         
                        break;    

                }
            }while(pararExibirMenu == false); 
        }catch(NullPointerException e){
            JOptionPane.showMessageDialog(null,"Encerrando programa...");
        }        
    }
    
    
}
