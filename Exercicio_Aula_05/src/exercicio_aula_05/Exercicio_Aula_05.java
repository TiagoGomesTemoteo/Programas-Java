/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_aula_05;

/**
 *
 * @author 53919153X
 */
public class Exercicio_Aula_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    Produtos ref = new Produtos ();
    
    ref.setDescricao("");
    ref.setpreco(0);
  
    ref.setquantidade(0);
    
    ref.cadastrar();
    ref.calcularTotal(ref.getquantidade(),ref.getpreco());
    
    }
    
}
