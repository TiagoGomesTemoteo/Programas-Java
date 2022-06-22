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
public class Alunos extends Pessoa{
    
    private int ra = 0;
    private String curso = "";
    
    public int getRa() {
        return ra;
    }
    public void setRa(int Ra) {
        this.ra = Ra;
    }
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    public Alunos(){
        //Nome,Endereco,telefone,sexo
        super("",new Endereco(),0,"");
        this.ra = 0; 
        this.curso = "";
        this.endereco = new Endereco();
        this.telefone = 0;
        this.sexo = "";
    }
    public Alunos( int ra, String nome, Endereco endereco, String curso,int telefone, String sexo) {
        super(nome,endereco,telefone,sexo);
        this.ra = ra; 
        this.curso = curso;
        this.endereco = endereco;
        this.telefone = telefone;
        this.sexo = sexo;
       
    }
      
    public void cadastrar(){ 
        setRa(Integer.parseInt(JOptionPane.showInputDialog("Digite o Ra do aluno")));
        setNome(JOptionPane.showInputDialog("Digite o nome do aluno"));
        setCurso(JOptionPane.showInputDialog("Digite o curso em que "+getNome()+" faz parte"));
        setTelefone(Integer.parseInt(JOptionPane.showInputDialog("Digite o telefone do(a)"+getNome())));
        setSexo(JOptionPane.showInputDialog("Digite o sexo do(a)"+getNome()));
        endereco.cadastrarEndereco();
        setEndereco(endereco);    
    }
    
    public List<Alunos> removerAluno(List<Alunos> al){
        int indiceAluno = pegarIndice(al);//Caso o aluno não exista a função retorna -1.                   
        if(indiceAluno != -1){
            al.remove(indiceAluno);
            JOptionPane.showMessageDialog(null,"Aluno removido com sucesso");
        }
        return al;
    }
    public int pegarIndice(List<Alunos> al){ 
        if(!al.isEmpty()){                 
            for(Alunos alunos: al){                      
                if(alunos.getRa() == raProcurado()){
                    return al.indexOf(alunos);                  
                }                                                       
            }
            JOptionPane.showMessageDialog(null,"Aluno não encontrado :(");
            
        }else{
            JOptionPane.showMessageDialog(null,"Não há nenhum aluno cadastrado!");
        }
        return -1;
    }   
    
    public List<Alunos> alterar(List<Alunos> al){
        if(!al.isEmpty()){                                  
            for(Alunos alunos: al){          
                if(alunos.getRa() == raProcurado()){
                    JOptionPane.showMessageDialog(null,"Insira os novos dados do aluno(a)"+alunos.getNome());
                    alunos.cadastrar();
                    JOptionPane.showMessageDialog(null,"Dados alterados com sucesso");
                return al;    
                }                    
            }
            JOptionPane.showMessageDialog(null,"Aluno não encontrado :(");
            
        }else{
            JOptionPane.showMessageDialog(null,"Não há nenhum aluno cadastrado!");
        }
        return al;
    }
    
    public void pesquisar(List<Alunos> al){        
        if(!al.isEmpty()){                               
            for(Alunos alunos: al){          
                if(alunos.getRa() == raProcurado()){
                    JOptionPane.showMessageDialog(null,"Aluno encontrado!"
                            + "\n Nome : "+alunos.getNome()
                            + "\n RA : "+alunos.getRa()
                            + "\n Curso : "+alunos.getCurso()
                            + "\n Telefone : "+alunos.getTelefone()
                            + "\n Sexo : "+alunos.getSexo()
                            + "\n "+alunos.getEndereco().exibirEndereco()); 
                return;   
                }                    
            }
            
            JOptionPane.showMessageDialog(null,"Aluno não encontrado :(");
            
        }else{
            JOptionPane.showMessageDialog(null,"Não há nenhum aluno cadastrado!");
        }
    }
    
   public int raProcurado(){
       return Integer.parseInt(JOptionPane.showInputDialog("Digite o RA do aluno"));
   }
}
