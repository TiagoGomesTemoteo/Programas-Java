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
public class Caixa {
   
   
    double saldo = 10;
    //metodos
    
   
 
       Scanner entrada = new Scanner (System.in); 
       
     
   
   
    
   public void retirar(){
       
       System.out.println("QUANTO VC DESEJA RETIRAR");
       double retirada = Double.parseDouble(entrada.nextLine());
    
       if(retirada > saldo){
           System.out.println("Seu saldo é menor que a retirada desejada ");
       }
       else{
        
           double retirei = saldo - retirada;
           
           System.out.println("Retirada bem sucedida seu saldo agora é " + retirei);
       }
   
   }
   
   public void entrar(){
       System.out.println("Quanto vc deseja depositar ?");
       double entrar = Double.parseDouble(entrada.nextLine());
       
       double depositar = saldo + entrar ;
       System.out.println("Seu saldo autal é de " + depositar);
   }
  
}
