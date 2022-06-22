/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaacademico;

/**
 *
 * @author tiago
 */
public class Pessoa {
    String nome = "";
    Endereco endereco = new Endereco();
    int telefone = 0;
    String sexo = "";
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public Pessoa(String nome, Endereco endereco, int telefone, String sexo){
        this.nome = nome;
        this.endereco = new Endereco();
        this.telefone = telefone;
        this.sexo = sexo;
    }
}
