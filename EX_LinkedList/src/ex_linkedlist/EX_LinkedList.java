/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_linkedlist;

import static java.util.Collections.list;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author tiago_bshvb2v
 */
public class EX_LinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        List suaLista = new LinkedList();
    
        suaLista.add("Junior");
        suaLista.add("Maria");
        suaLista.add("Joao");

        Iterator i = suaLista.iterator(); //cria um objeto Iterator da sua LinkedList
        
        while (i.hasNext()) { //percorrer toda a lista até o ultimo elemento
            System.out.println((String)(i.next())); //Mostra o valor da Lista
        }
  
    
    }
    
}
