/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaacademico;

import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author tiago
 */
public class Professores extends Pessoa{
    private String registro;
    private String materia;
     
    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }
    
    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
 
    public Professores(){
        //Nome,endereco,telefone,sexo
        super("",new Endereco(),0,"");
        this.registro = "";   
        this.materia = "";            
    }
    
    public Professores(String registro, String nome, String materia, Endereco endereco, int telefone, String sexo) {
        super(nome,endereco,telefone,sexo);
        this.registro = registro;
        this.materia = materia;
    }
    
    public void cadastrar(){     
        setRegistro(JOptionPane.showInputDialog("Digite o número de registro do professor"));
        setNome(JOptionPane.showInputDialog("Digite o nome do(a) professor(a)"));
        setMateria(JOptionPane.showInputDialog("Digite a matéria que "+getNome()+" lecionada"));
        setTelefone(Integer.parseInt(JOptionPane.showInputDialog("Digite o telefone do(a)"+getNome())));
        setSexo(JOptionPane.showInputDialog("Digite o sexo do(a)"+getNome()));
        endereco.cadastrarEndereco();
        setEndereco(endereco);               
    }
    
    public List<Professores> removerProfessor(List<Professores> prof){
        int indiceProfessor = pegarIndice(prof);                   
        if( indiceProfessor != -1){//Caso o professor não exista a função retorna -1.
            prof.remove(indiceProfessor);
            JOptionPane.showMessageDialog(null,"Professoro removido com sucesso");
        }
        return prof;
    }
    
    public int pegarIndice(List<Professores> prof){ 
        if(!prof.isEmpty()){               
            for(Professores professores: prof){                      
                if(professores.getRegistro().equals(registroProcurado())){
                    return prof.indexOf(professores);                  
                }                    
            }           
            JOptionPane.showMessageDialog(null,"Professor não encontrado :(");           
        }else{
            JOptionPane.showMessageDialog(null,"Não há nenhum professor cadastrado!");
        }
        return -1;
    }   
    
    public List<Professores> alterar(List<Professores> prof){
        if(!prof.isEmpty()){                   
            for(Professores professores: prof){          
                if(professores.getRegistro().equals(registroProcurado())){
                    JOptionPane.showMessageDialog(null,"Insira os novos dados do professor(a)"+getNome());
                    professores.cadastrar();        
                    JOptionPane.showMessageDialog(null,"Dados alterados com sucesso");
                    return prof;
                }                                   
            }    
            JOptionPane.showMessageDialog(null,"Professor não encontrado :(");
            
        }else{
            JOptionPane.showMessageDialog(null,"Não há nenhum professor cadastrado!");
        }        
        return prof;
    }
    
    public void pesquisar(List<Professores> prof){        
        if(!prof.isEmpty()){                                   
            for(Professores professores: prof){          
                if(professores.getRegistro().equals(registroProcurado())){
                    
                    JOptionPane.showMessageDialog(null,"Professor encontrado!"
                            + "\n Nome : "+professores.getNome()
                            + "\n Registro : "+professores.getRegistro()
                            + "\n Matéria : "+professores.getMateria()                           
                            + "\n Telefone : "+professores.getTelefone()
                            + "\n Sexo : "+professores.getSexo()
                            + "\n "+professores.getEndereco().exibirEndereco());          
                }                     
            }
            
            JOptionPane.showMessageDialog(null,"Professor não encontrado :(");
            
        }else{
            JOptionPane.showMessageDialog(null,"Não há nenhum professor cadastrado!");
        }
    }    
    
    public int registroProcurado(){
       return Integer.parseInt(JOptionPane.showInputDialog("Digite o RA do aluno"));
   }
}
