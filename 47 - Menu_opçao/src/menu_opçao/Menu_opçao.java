/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu_opçao;
import java.util.Scanner;
/**
 *
 * @author TIAGO
 */
public class Menu_opçao {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
     int opcao ;
        do { 
    Scanner entrada = new Scanner (System.in);
    
      
      
          System.out.println("Digite um numero ");
      double number_1 = Double.parseDouble(entrada.nextLine ());
      
      System.out.println("Digite outro numero");
      double number_2 = Double.parseDouble(entrada.nextLine ());
       
        System.out.println("+----------------------+");
        System.out.println("|Adiçao (1)            |");
        System.out.println("|Subtraçao (2)         |");
        System.out.println("|Multiplicaçao(3)      |");
        System.out.println("|Divisao (4)           |");
        System.out.println("|Saida (5)             |");
        System.out.println("|Recomeçar programa(6) |");
        System.out.println("+----------------------+");
    
   
        System.out.println("Escolha uma das opçoes");
        opcao = entrada.nextInt ();
     
        switch(opcao ){ 
         
           
            case 1 :{
            double adicao = number_1 + number_2 ;  
            System.out.println("O soma dos numeros = " + adicao);  
            System.out.println("Deseja recomeçar o programa ? (Sim = 6 e Nao = 5)");
            opcao =entrada.nextInt();
            break;
            }
            
            case 2 :{
            double sub = number_1 - number_2 ;
            System.out.println("A subtraçao dos numeros = " + sub);
            System.out.println("Deseja recomeçar o programa ? (Sim = 6 e Nao = 5)"); 
            opcao =entrada.nextInt();
            break;
            }
            
            case 3:{
            double mult = number_1 * number_2 ;
            System.out.println("A multiplicaçao dos numeros = " + mult );
            System.out.println("Deseja recomeçar o programa ? (Sim = 6 e Nao = 5)"); 
            opcao =entrada.nextInt();
            break;
            } 
            
            case 4 :{
            double divi = number_1 / number_2 ;
            System.out.println("A divisao dos numeros = " + divi);
            System.out.println("Deseja recomeçar o programa ? (Sim = 6 e Nao = 5)"); 
            opcao =entrada.nextInt();
            break;
            }
            
            case 5 :{
                          
                System.out.println("Fim do programa");
            break;
            }
            case 6 :{
                System.out.println("O  programa vai recomeçar");
            break;
            }         
        }
       } while(opcao == 6);
   
    
    
        
    
    
    
    
    
    
    
    
    
    
    
    
    }
    
    

    
    
    }      
    

