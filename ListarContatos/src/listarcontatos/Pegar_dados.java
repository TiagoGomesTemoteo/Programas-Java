/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listarcontatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author 53919153x
 */
public class Pegar_dados {
    
    public int contado(){
        int cont =0;
        //Iniciando variavel do tipo Connection que ira chamar o método da classe
        //Conexao que inicia a conexao com o sql
        Connection conexao = Conecta.abreConexao();
        //Iniciando variavel que realiza as operações do sql
        PreparedStatement stmt = null;    
        //Iniciando varavel de busca no sql
        ResultSet rs = null;
        
       
        
        try {
            //Buscando dados da tabela tbamigo
            stmt = conexao.prepareStatement("SELECT COUNT(*) FROM contatos");
            
            //Método de leitura da tabela
            rs = stmt.executeQuery();
            
            
            //a classe next() verifica se existe mais uma informação na tabela
            rs.next();
            cont = rs.getInt("COUNT(*)");
   
        } catch (SQLException ex) {
            //Tratando exceções e informando erros
            JOptionPane.showMessageDialog(null, "Erro ao buscar dados "+ex.getMessage()); 
            
        } finally {
            //Utilizando o método finally para que a conexão seja encerrada caindo no try ou no catch
            Conecta.fechaConexao(conexao, stmt, rs);
        }
        //Retornando o ArrayList
        return cont;
}
    
    
    public List<Lista_Contatos> read(){
        
        //Iniciando variavel do tipo Connection que ira chamar o método da classe
        //Conexao que inicia a conexao com o sql
        Connection conexao = Conecta.abreConexao();
        //Iniciando variavel que realiza as operações do sql
        PreparedStatement stmt = null;    
        //Iniciando varavel de busca no sql
        ResultSet rs = null;
        
        //Declarando List que armanezara os dados da tabela 
        List<Lista_Contatos> cd = new ArrayList<>();
        
        try {
            //Buscando dados da tabela tbamigo
            stmt = conexao.prepareStatement("SELECT * FROM contatos");
            //Método de leitura da tabela
            rs = stmt.executeQuery();
            
            //Loop para capturar todos os dados da tabela
            //a classe next() verifica se existe mais uma informação na tabela
            while(rs.next()){
                //Objeto da classe amigo
                Lista_Contatos cadast = new Lista_Contatos();
                //Setando dados para a tabela
                cadast.setNome(rs.getString("nome"));
                cadast.setEmail(rs.getString("email"));
                cadast.setTelefone(rs.getString("telefone"));
                
                //Adicionando dados no ArrayList
                cd.add(cadast);
                
            }
            
        } catch (SQLException ex) {
            //Tratando exceções e informando erros
            JOptionPane.showMessageDialog(null, "Erro ao buscar dados "+ex.getMessage()); 
            
        } finally {
            //Utilizando o método finally para que a conexão seja encerrada caindo no try ou no catch
            Conecta.fechaConexao(conexao, stmt, rs);
        }
        //Retornando o ArrayList
        return cd;
}
}
