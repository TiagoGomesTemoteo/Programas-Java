/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nota.aluno;
import java.util.Scanner ;
/**
 *
 * @author TIAGO
 */
public class NotaAluno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner entrada = new Scanner (System.in);  
    System.out.print("Digite a nota ponderada da 1º Prova : ");
    double nota_1 = Double.parseDouble (entrada.nextLine ());
    
    System.out.print("Digite a nota ponderada da 2º Prova : ");
    double nota_2 = Double.parseDouble (entrada.nextLine ());
    
    System.out.print("Digite a nota ponderada da 3º Prova  : ");
    double nota_3 = Double.parseDouble (entrada.nextLine ());
    
    
    // a nota 1 e 2 tem um peso e a 3 tem outro 
    
    
    double nota_total = nota_1 + nota_2 + nota_3 ;
    double nota = nota_total / 3;
        
    if(  nota > 59 ) {
      System.out.println("Aluno aprovado // E sua nota é " + nota) ;
      
    }
    else if (nota <= 60){
    
    System.out.println("Aluno reprovado // E sua nota é " + nota );
    }      
    }
    
}
