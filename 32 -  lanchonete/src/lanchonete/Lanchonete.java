/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lanchonete;
import java.util.Scanner ;
/**
 *
 * @author TIAGO
 */
public class Lanchonete {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner entrada = new Scanner (System.in) ;
    

//Lembreçe que você  so pode pedir um  tipo  de produto por vez 
    System.out.print("Informe o código do produto desejado :");
    double cod_pro = Double.parseDouble(entrada.nextLine ()) ;
    
    System.out.print("Informe a quantidade desejada do produto :");
    double quant_pro = Double.parseDouble(entrada.nextLine ()) ;
    
   double cachorro_quente = 1.20 ;
   double bauru_simples = 1.30 ;       
   double bauru_com_ovo = 1.50 ;
   double hamburgue = 1.20 ;
   double cheeseburguer = 1.70 ;
   double suco = 2.20 ;
   double refrigerante = 1.00 ;
    
           if (cod_pro == 100){
    
      double conta_1 = quant_pro * cachorro_quente ;  
      System.out.println("Sua conta foi  de : " + conta_1);
           }
           else if (cod_pro == 101) {
           double conta_2 = quant_pro * bauru_simples ;
           System.out.println("Sua conta foi de : " + conta_2);
           }
    
           else if (cod_pro == 102) {
           double conta_3 = quant_pro * bauru_com_ovo ;
           System.out.println("Sua conta foi de :" + conta_3);
           }
    
           else if (cod_pro == 103) {
           double conta_4 = quant_pro * hamburgue ;
           System.out.println("Sua conta foi de : " + conta_4);
           }  
    
           else if (cod_pro == 104 ) {
           double conta_5 = quant_pro * cheeseburguer ;
           System.out.println("Sua conta foi de : " + conta_5);
           }
    
           else if (cod_pro == 105 ) {
           double conta_6 = quant_pro * suco ;
           System.out.println("Sua Conta foi de : " + conta_6);
           }
           else if (cod_pro == 106) {
           double conta_7 = quant_pro * refrigerante ;
           System.out.println("Sua conta foi de :" + conta_7);
           
           }
    
    }

    }
    

