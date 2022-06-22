       /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peso.ideal;
import java.util.Scanner ;
/**
 *
 * @author ALUNO
 */
public class PesoIdeal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        Scanner entrada = new Scanner (System.in);
    System.out.print("Digite sua Altura:");
    double altura =Double.parseDouble(entrada.nextLine());
        System.out.print("Digite seu sexo M ou F:");
    char sexo = entrada.nextLine().charAt(0);
    
    double peso_i ;
    if (Character.toUpperCase(sexo)=='M');{
    peso_i = (72.7 * altura) -58 ;
    
    }
    if(Character.toUpperCase(sexo)== 'F');{
    peso_i =(62.1 * altura)- 44.7 ; 
    }
   System.out.println(" O peso ideal é :" + peso_i);
    
    
        
    
    
    
    
    }
    
}
