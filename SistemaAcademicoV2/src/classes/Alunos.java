/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author tiago
 */
public class Alunos extends Pessoa{
    
    private String ra = "";
    private String curso = "";
    
    public String getRa() {
        return ra;
    }
    public void setRa(String Ra) {
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
        this.ra = ""; 
        this.curso = "";
        this.endereco = new Endereco();
        this.telefone = 0;
        this.sexo = "";
    }
    public Alunos( String ra, String nome, Endereco endereco, String curso,int telefone, String sexo) {
        super(nome,endereco,telefone,sexo);
        this.ra = ra; 
        this.curso = curso;
        this.endereco = endereco;   
    }  
    
    public void exibirAluno(Alunos alunos){
        JOptionPane.showMessageDialog(null,"Aluno encontrado!"
                            + "\n Nome : "+alunos.getNome()
                            + "\n RA : "+alunos.getRa()
                            + "\n Curso : "+alunos.getCurso()
                            + "\n Telefone : "+alunos.getTelefone()
                            + "\n Sexo : "+alunos.getSexo()
                            + "\n "+alunos.getEndereco().exibirEndereco()); 
    }
    
    public void removerAluno(List listaAlunos, int indiceAluno){                      
        if(indiceAluno != -1){
            listaAlunos.remove(indiceAluno);
            JOptionPane.showMessageDialog(null,"Aluno removido com sucesso");
        }       
    }
    
    
}
