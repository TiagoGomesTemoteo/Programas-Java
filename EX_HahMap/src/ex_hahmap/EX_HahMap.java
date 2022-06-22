/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_hahmap;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author tiago_bshvb2v
 */
public class EX_HahMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        
    // Criando um HashMap usando generics: chave: String valor: Integer
    Map <String,Integer> pessoas = new HashMap<String,Integer>();
    
    //Inserindo dados no HashMap
    pessoas.put("João",35);
    pessoas.put("Marcos", 49);
    //Consultando o HashMap
    
    Integer idadeJoao = pessoas.get("João");
    Integer idadeMarcos = pessoas.get("Marcos");
    
    // Excluindo dados do HashMap
    pessoas.remove("João");
    pessoas.remove("Marcos");
    
    // Verifica se existe algum João no HashMap
    boolean existeJoao = pessoas.containsKey("João");
    
   // Verifica se existe alguem com 35 anos
    boolean existe35 = pessoas.containsValue(35) || pessoas.containsValue(25);
    
    // Remove todos os itens do HashMap
    pessoas.clear();
    }
    
}
