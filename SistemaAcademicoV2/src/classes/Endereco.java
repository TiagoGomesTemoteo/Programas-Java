/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import javax.swing.JOptionPane;

/**
 *
 * @author teste
 */
public class Endereco {
    private String rua;
    private int numero;
    private String estado;
    private String cidade;
    private String bairro;
    private String complemento;

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
       
    public Endereco(){
        this.rua = "";
        this.numero = 0;
        this.estado = "";
        this.cidade = "";
        this.bairro = "";
        this.complemento = "";  
    }
    public Endereco(String rua, int numero, String estado, String cidade, String bairro, String complemento) {
        this.rua = rua;
        this.numero = numero;
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.complemento = complemento;
    }       
    public String exibirEndereco(){
        String mensagem = "\n Endereço:    "
                + "\n Estado : "+getEstado()
                + "\n Cidade : "+getCidade()
                + "\n Bairro : "+getBairro()
                + "\n Rua : "+getRua()
                + "\n Número : "+getNumero();
        return mensagem;
    }
}
