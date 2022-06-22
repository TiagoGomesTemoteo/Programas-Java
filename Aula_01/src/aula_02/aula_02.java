/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_02;
import java.util.Scanner;

/**
 *
 * @author 53919153X
 */
public class aula_02 {
    
    public static void main (String[] args){
     
        Scanner entrada = new Scanner (System.in);
     
         
       int escolha;
      do{
          
         System.out.println("Você deseja - Entrar(2) ou Retirar(1) ou (3)sair ?");   
          escolha = (int) Double.parseDouble(entrada.nextLine()); 
       
      if(escolha == 1 ){
   
          Caixa retirar = new Caixa();
          retirar.retirar();
      }
      else if (escolha == 2){
                Caixa entrar = new Caixa();
                entrar.entrar();
                  
                  }
       
     
      }while(escolha !=3);
      
   
      
      
      
      
      
      
      
      
      
      
      
      
    
    
       
    }
}
