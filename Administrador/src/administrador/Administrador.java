/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package administrador;

/**
 *
 * @author Tiago
 */
public class Administrador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    Computador ref = new Computador(0,0,"");
    
    ref.setFrequencia_clock(0);
    ref.setNM_processador("");
    ref.setTamanho_HD(0);
    
    ref.print();
    ref.comparaCom(ref.getTamanho_HD(),ref.getFrequencia_clock(),ref.getNM_processador());
    ref.comparaCom2(ref.getTamanho_HD(),ref.getFrequencia_clock(),ref.getNM_processador());
    }
    
}
