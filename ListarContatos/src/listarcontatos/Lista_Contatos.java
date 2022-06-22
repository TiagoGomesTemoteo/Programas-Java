/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listarcontatos;

/**
 *
 * @author 53919153x
 */
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Lista_Contatos extends JFrame{
    JPanel painelFundo;
    JTable tabela;
    JScrollPane barraRolagem;

    private String nome,telefone,email;
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    public Lista_Contatos(){
    
    this("","","");
    }
        
    
     
    String [] colunas = {"Nome", "Telefone", "Email"}; 
     
 
    public Lista_Contatos(String nome, String telefone, String email) {
       
        super ("Contatos");
        
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        
       
    }
     
    Pegar_dados d = new Pegar_dados();
    public void criaJanela(){
         
        //criando matriz para receber dados
        String[][] vetor = new String[d.contado()][3]; 
        //criando variavel que recebera o numero de linhas
        int pos = 0;
        
        //criando for para pegar os dados no metodo read
        //e colocalos na matriz
        // pos++; comando para adicionar +1 a cada loop na variavel ' pos '
        for(Lista_Contatos cda: d.read()){       
            vetor [pos][2] = " " +cda.getEmail();
            vetor [pos][0] = " " +cda.getNome();
            vetor [pos][1] = " " +cda.getTelefone();
            pos++;          
        }
        //declarando que o objeto dados é igual a variavel vetor
        Object [][] dados = vetor;
        
        
        painelFundo = new JPanel();
        painelFundo.setLayout(new GridLayout(1, 1));
        tabela = new JTable(dados, colunas);
        barraRolagem = new JScrollPane(tabela);
        painelFundo.add(barraRolagem); 
         
        getContentPane().add(painelFundo);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 120);
        setVisible(true);
    }
     
   
    
}
