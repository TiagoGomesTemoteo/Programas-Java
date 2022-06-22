/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer.polimorfismo.pkg3;

/**
 *
 * @author 53919153X
 */
public class Leao extends Animal{

    Leao(){
    }
    
    public Leao(String nome, String raca){
    
       super(nome,raca); 
    }

  @Override
  public void movimentar(){
      
      System.out.println("O "+nome+"  é  quadrupidi");
          
         
  }
  @Override
  public void comunicar(){
      System.out.println("Nome : "+nome);
      System.out.println("Raça : "+raca);
      System.out.println("O "+nome +" rugi ");
  }
  
  


}
