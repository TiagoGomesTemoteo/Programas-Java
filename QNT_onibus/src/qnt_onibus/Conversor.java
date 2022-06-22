/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qnt_onibus;

/**
 *
 * @author 53919153x
 */
public class Conversor {
    public  int  ConvSI(String info){
      
        int valor  = Integer.parseInt(info);
        return valor;
    }

   public double ConvSD(String info){
   
       double valor = Double.parseDouble(info);
       return valor;
   }
}
