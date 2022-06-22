/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer.polimorfismo;

/**
 *
 * @author 53919153X
 */
public class Estudante extends Pessoa{
  
    private String curso;
    public Estudante(){
    curso="";
  
    }
    
    public String getCurso(){
    return curso;
    }
    
    public void setCurso(String curso){
    this.curso=curso;
    }
    
    public void mostrar(){
    super.mostrar();
        System.out.println("Curso"+curso);
    }
}
