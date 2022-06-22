/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import javax.swing.JOptionPane;


/**
 *
 * @author tiago
 */
public class Professores extends Pessoa{
    private String registro;   
    HashMap<String,List> cursosEDisciplinas = new HashMap();
    List auxListaDisciplinas = new ArrayList();
    
    public HashMap getCursosEDisciplinas() {
        return cursosEDisciplinas;
    }

    public void setCursosEDisciplinas(HashMap cursosEDisciplinas) {
        this.cursosEDisciplinas = cursosEDisciplinas;
    }
  
    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }
 
    public Professores(){
        //Nome,endereco,telefone,sexo
        super("",new Endereco(),0,"");
        this.registro = "";   
       
    }
    
    public Professores(String registro, String nome,  Endereco endereco, int telefone, String sexo) {
        super(nome,endereco,telefone,sexo);
        this.registro = registro;
        this.endereco = endereco;   
       
    }
    
    public String exibirCursosEDisciplinas(){
        String msg = "";
        for(Entry <String, List> each : cursosEDisciplinas.entrySet()){
            msg += "\nCurso: " + each.getKey();
 
            auxListaDisciplinas  = each.getValue();
            for(Object objs: auxListaDisciplinas){
                msg+="\n    - "+objs.toString();
            } 
        }       
        return msg;
    }
    
    public void exibirProfessor(Professores professores){
        JOptionPane.showMessageDialog(null,"Professor encontrado!"
                        + "\n Nome : "+professores.getNome()
                        + "\n Registro : "+professores.getRegistro()
                        + "\n Telefone : "+professores.getTelefone()
                        + "\n Sexo : "+professores.getSexo()
                        + "\n "+professores.exibirCursosEDisciplinas()
                        + "\n "+professores.getEndereco().exibirEndereco());
    }
    
    public void removerProfessor(List listaProfessores, int indiceProfessor){     
        if( indiceProfessor != -1){
            listaProfessores.remove(indiceProfessor);
            JOptionPane.showMessageDialog(null,"Professor removido com sucesso");
        }       
    }
        
}
