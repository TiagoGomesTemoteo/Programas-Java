/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repeticao;

import java.math.BigDecimal;
import javax.swing.JOptionPane;


/**
 *
 * @author tiago
 */
public class PrincipalNumeros {
    
    public static void main(String[] args) {     
       
        /*
        valores : int []
        
        leValores (): void
        achaMaior (): int
        achaMenor (): int 
        multiplicaValores (valor : int):void 
        ordenaValores():void
        mostraValores():void
        */
        
        Numeros nm = new Numeros();
        int valor;
        int opcao; 
        
        do{
                opcao = Integer.parseInt(JOptionPane.showInputDialog(null,"Escolha uma opção"
                        + "\n1. Adicionar valor"
                        + "\n2. Mostrar o maior e o menor valor"
                        + "\n3. Mostrar todos os valores"
                        + "\n4. Ordenar valores"
                        + "\n5. Multiplicar todos os valores por um outro valor"
                        + "\n6. Sair"));

                switch (opcao){
                    case 1:
                        nm.leValores();
                        break;          
                        
                    case 2:
                        JOptionPane.showMessageDialog(null," Maior : "+nm.achaMaior()
                        + "\n Menor : "+nm.achaMenor());
                                                
                        break;

                    case 3:
                        nm.mostraValores("");
                        break;
                        
                    case 4:
                        nm.ordenaValores(0,0);
                        break;
                        
                    case 5:
                        nm.multiplicaValores();
                        break;
                }
            }while(opcao != 6);
        
    }
}
