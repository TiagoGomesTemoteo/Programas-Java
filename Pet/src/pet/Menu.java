/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pet;

/**
 *
 * @author 53919153x
 */
public class Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
  
  
  String msg;
  
  
  EntradaSaida ES = new EntradaSaida();
  Conversor    CV = new Conversor();
  PetShop ref = new PetShop();
   
  
 
  
  int Escolha;  
   do
   {
       
   msg = " Digite :" + "\n" + "'1'para Cadastrar" + "\n"+"'2' para Consultar"+"\n"+"'3' para sair";
   Escolha =CV.ConvSI(ES.Entrada(msg));
   
  
   if(Escolha == 1){
    
            
      ref.cadastrar();
   }
   
  
   else if (Escolha == 2 ){
       ref.consultar();
   }
   
           
   
   
   }while(Escolha !=3 );
    }
    
}
