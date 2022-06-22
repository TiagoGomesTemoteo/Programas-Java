/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_linkedhashset;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author tiago_bshvb2v
 */
public class Ex_LinkedHashSet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        Set<String> nomes = new LinkedHashSet<String>();
               nomes.add("Eduardo");
               nomes.add("Luiz");
               nomes.add("Bruna");
               nomes.add("Sonia");
               nomes.add("Brianda");
               nomes.add("Julia");
               nomes.add("Carlos");
   
               
               for (String nome : nomes) {
                      System.out.println(nome);
               }
    }
    
}
