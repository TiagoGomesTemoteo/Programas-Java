/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_04;
import java.util.Scanner;
/**
 *
 * @author 53919153X
 */
public class aula_04 {
    
    public  static void main (String [] args){
    
    
    Calcular calculo = new Calcular ();
    
    calculo.somar(0,0);
    
    
     
       //////////////////////////////////////////////////
       
    
    Scanner entrada = new Scanner (System.in);
     
         
       int escolha;
      do{
          
         System.out.println("Você deseja - Entrar(2) ou Retirar(1) ou (3)sair ?");   
          escolha = (int) Double.parseDouble(entrada.nextLine()); 
       
      if(escolha == 1 ){
   
          Caixa retirar = new Caixa();
          retirar.retirar(0);
      }
      else if (escolha == 2){
                
          Caixa entrar = new Caixa();
          entrar.entrar(0);
                  
                  }
       
     
      }while(escolha !=3);
    
    }
    
}
