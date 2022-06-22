/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_relacionamento;

/**
 *
 * @author 53919153X
 */
public class Caluno {
    
    Cturma turma;
    String nome;
    String ende;
    
    
Caluno(String nome, String ende, Cturma turma){

    this.nome=nome;
    this.ende=ende;
    this.turma=turma;
}

public void consultar(){
    
    System.out.println("***** Dados da Conta *****");
    System.out.println(" Nome"+nome);
    System.out.println(" Endereco"+ende);
    turma.Consultar();
    
}
}
