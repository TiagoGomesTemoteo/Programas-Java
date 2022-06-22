/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baskara;

/**
 *
 * @author 53919153X
 */
public class Equacao {
   
     public static void main(String[] args) {
        // TODO code application logic here
   
  Baskara ref = new Baskara(0,0,0,0,0,0);
  
  ref.setvalor_A(0);
  ref.setvalor_B(0);
  ref.setvalor_C(0);
  
  ref.print();
  ref.raizes(ref.getvalor_A(),ref.getvalor_B(),ref.getvalor_C());
  ref.somaRaizes(ref.getx(),ref.gety());
  ref.produtoRaizes(ref.getx(),ref.gety());
     }
    
}
