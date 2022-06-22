/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_01;

/**
 *
 * @author 53919153X
 */
public class Aula_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //minha classe principal
    
    Pessoa andre = new Pessoa();   
    andre.falar();
    
    Pessoa ana = new Pessoa();
    ana.falar();
    
   
    //
    
    Celular tiago = new Celular();    
    tiago.comunicacao();
   //
    
    Celular joao = new Celular();   
    joao.notificacao();
    
   /////////////////////////////////////////////////////////
   
    Carro uno = new Carro();
     uno.andar();
    
    Carro fox = new Carro ();
    fox.freiar();
    }
   }
