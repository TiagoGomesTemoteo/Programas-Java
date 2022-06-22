/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herança;

/**
 *
 * @author 53919153x
 */
public class Herança {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        Aluno a1 = new Aluno();
        Cliente c1 = new Cliente();
    
        c1.nome="Tiago";
        c1.cpf="100.487.468.-48";
        c1.imprime();
    
        a1.nome="Tiago";
        a1.RA="156165135";
        a1.imprime_ra();
                
    }
    
}
