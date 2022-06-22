/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhos.encanador;
import java.util.Scanner ;
/**
 *
 * @author TIAGO
 */
public class TrabalhosEncanador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner entrada = new Scanner (System.in) ;
    System.out.print("Digite por quantos dias você quer solicitar o encanador : ");
    double d_soli = Double.parseDouble(entrada.nextLine()) ;
    
    double dias_solicitados = d_soli * 30.00 ;
    double desconto_emposto = dias_solicitados * 8 /100 ;
    double salario_liquido = dias_solicitados - desconto_emposto ;
    
    System.out.println("Devera ser pago ao encanador :" + salario_liquido);
    
    
    }
    
}
