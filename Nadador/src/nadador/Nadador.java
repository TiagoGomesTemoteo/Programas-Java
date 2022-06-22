/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nadador;
import java.util.Scanner;
/**
 *
 * @author ALUNO
 */
public class Nadador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner entrada = new Scanner (System.in);
    
    System.out.print ("Informe a Idade do Nadador:");
    double idade =Double.parseDouble(entrada.nextLine());
    
    
    if ((idade > 5) && (idade<= 7)){
        System.out.println("Infantil A");
    }
    else if ((idade > 8 && idade<=10)){
     System.out.println("Infantil B");
    }
    else if ((idade > 11 && idade<=13)){
      System.out.println("Juvenil A");
    } 
    else if ((idade>14 && idade<=17)){
    System.out.println("Juvenil B");
    }
    else if(idade > 18){
    System.out.println("Senior");
    }
    }
    
}
