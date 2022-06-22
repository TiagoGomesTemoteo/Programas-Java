/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listarcontatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author 53919153x
 */
public class Conecta {
    //Atributos de conexão (Atributos definidos como "final" só podem ser alterados uma vez, ou em método ou diretamente na declaração)
    //Driver de conexão
    private static final  String DRIVER = "com.mysql.jdbc.Driver";
    //Buscando endereço do banco de dados (URL) 
    private static final  String URL = "jdbc:mysql://localhost:3309/bdcadastro";
    //Configurando o usuario do banco (padrão root no mysql)
    private static final  String USER = "root";
    //Informando senha de acesso do banco de dados
    private static final  String SENHA = "1234";
    
    //Método para abrir conexão
    public static Connection abreConexao(){
        try {
            //Chamando classe de conexão
            Class.forName(DRIVER);
            //Retornando dados da conexão 
            return DriverManager.getConnection(URL, USER, SENHA);
        //Tratando exceções (Classe não encontrada e erro nos dados de URL, USER ou SENHA)
        } catch (ClassNotFoundException | SQLException ex) {
            //Informando erro de conexão
            throw new RuntimeException("Erro na conexão", ex);
        } catch (Exception ex){
            //Tratamento de erros gerais
            JOptionPane.showMessageDialog(null, ""+ex.getMessage());
            return null;
        }   
    }
    
    //Método estático para fechar conexão
    public static void fechaConexao(Connection conexao){
        try{
        //Verificando se a conexão é nula (caso seja deverá ser fechada)    
        if(conexao != null){
            //Fechando conexão
            conexao.close();
        }
        //Tratando exceções
        }catch (SQLException ex){
            //Informando problema
           JOptionPane.showMessageDialog(null, ""+ex.getMessage());
        }
    }
    
    //Método estático para fechar conexão e statemet
    public static void fechaConexao(Connection conexao, PreparedStatement stmt){
        //Chamando método que encerra a conexão
        fechaConexao(conexao);
        
        try{
            //Verificando se o statement é nulo (caso seja deverá ser fechado)
            if(stmt != null){
            //Fechando statement    
            stmt.close();
            }
        }catch (SQLException ex){
            //Informando problema
           JOptionPane.showMessageDialog(null, ""+ex.getMessage());            
        }
    }    
    
    //Método estático para fechar conexão, fechar statement e fechar o resultset
    public static void fechaConexao(Connection conexao, PreparedStatement stmt, ResultSet rs){
        //Chamando método que encerra a conexão e o statement
        fechaConexao(conexao, stmt);
        
        try{   
            //Verificando se o resultset é nulo (caso seja deverá ser fechado)
            if(rs != null){
            //Fechando o resultset    
            rs.close();
            }
        }catch (SQLException ex){
            //Informando problema
           JOptionPane.showMessageDialog(null, ""+ex.getMessage());            
        }
    } 
}
