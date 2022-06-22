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
public class Pessoa {

private String nome;
public Pessoa(){
nome="";
}

public String getNome(){
return nome;
}
public void setNome(String nome){
this.nome = nome ;

}

public void mostrar(){
    System.out.println("nome "+nome);
}
}
