/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numero_par_ordem_crescente;
import java.util.Scanner;
/**
 *
 * @author TIAGO
 */
public class Numero_Par_Ordem_Crescente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        int number ;
       
        Scanner entrada = new Scanner (System.in);
       
        System.out.println("Digite um número inteiro que se seja par");   
       number =entrada.nextInt();
    
       if(number%2!=0){
        System.out.println("Números impares não são válidos para este  programa");
    }
      
    
    else if (number%2==0){
  
         
           for(int np = 0; np <=number ;np +=2 ){
               System.out.println(np);
           
           }
       }   
 
    
    
    
    }
}

