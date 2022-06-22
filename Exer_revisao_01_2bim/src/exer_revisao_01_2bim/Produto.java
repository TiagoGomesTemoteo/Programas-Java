/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer_revisao_01_2bim;

import javax.swing.JOptionPane;

/**
 *
 * @author 53919153x
 */
public class Produto {
    
    public int codigo;   
    private String tipo;   
    protected String descricao;
    
    public String getTipo(){
    return tipo;
    }
    public void setTipo(String tipo){
    this.tipo=tipo;
    }

    public Produto(){
    this(0,"","");
    }
    public Produto(int codigo,String tipo, String descricao){
    this.tipo = tipo;
    this.codigo = codigo;
    this.descricao = descricao;
    }

    public void cadastrar(){
    
     
        codigo = Integer.parseInt(JOptionPane.showInputDialog(" Digite o código do produto")); 
        tipo = JOptionPane.showInputDialog("Digite o tipo do produto");
        descricao = JOptionPane.showInputDialog("Digite a descrição do produto");
         
        this.setTipo(tipo);
        
        
    }

    public  void exibir(){
    
    JOptionPane.showMessageDialog(null,"Relatório:"
        +"\n"    
        +"Codigo : "+codigo
        +"\n"
        +"Tipo : "+tipo
        +"\n"
        +"descricao : "+descricao
        );
   
    }
}