/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer_controle_pessoal;

import javax.swing.JOptionPane;

/**
 *
 * @author Tiago
 */
public class Pessoa {
    
    private String nome,rg;
    private int idade;
    
   
    public String getNome(){
    return nome;
    }
    
    public void setNome(String nome){
    this.nome=nome;
    }
    
    public String getRG(){
    return rg;
    }
    
    public void setRG(String rg){
    this.rg=rg;
    }

    public int getIdade(){
    return idade;
    }

    public void setIdade(int idade){
    this.idade=idade;
    } 


    
    public Pessoa(){
    
        this("","",0);
    }
    
    
    public Pessoa(String nome, String rg, int idade){
        
        this.idade=idade;
        this.nome=nome;
        this.rg=rg;
    }

    
    public void metodos_pessoais(){
     
     this.setNome(nome);
     this.setIdade(idade);
     this.setRG(rg);
      
        
     nome = JOptionPane.showInputDialog(null," Digite seu nome");
     idade = Integer.parseInt(JOptionPane.showInputDialog(nome+", Digite sua Idade: "));
     rg = JOptionPane.showInputDialog(nome+", Digite seu RG :");
     
     JOptionPane.showMessageDialog(null,"Nome : "+nome
     +"\n"+"Idade : "+idade
     +"\n"+"RG : "+rg        
     );
        
    } 
}
