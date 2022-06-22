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
public class Repeticao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Média Fatec
        //COMANDO "CONTINUE" FAZ ELE IGNORA O QUE TEM ABAIXO DELE E EXECUTA A PROXIMA INTERAÇÃO
        //ROTULO: 
        //      ESTRUTURA 
        //      COMANDO BREAK:"ROTULO", ABANDONA A ESTRUTURA MAIS EXTERNA
        //CONTINUE TAMBÉM PODE USAR O ROTULO
        //CURTO CIRCUITO
        //PARA QUEBRAR O CURTO CIRCUITO É SÓ USAR O OPERADOR & NO LUGAR DE && COM O OU A MESMA COISA
        
        /*JOGO 21
 
Usuário vs Máquina
 
Usuário:

 - começa o jogo

 - solicita uma carta por vez

 - caso não ultrapasse 21 pode parar de solicitar cartas
 
Máquina

 - funciona após o pedido de parada do usuário

 - sempre tentará ganhar
 
*vence quem estiver mais próximo de 21 sem ultrapassá-lo
 
Cartas

 A 2 3 ... 10 J  Q  K

 valores

 1 2 3 ... 10 10 10 10

 Naipes

 ? ? ? ?
 
ob.: Não há cartas repetidas*/   
        double valor = 0;
        BigDecimal bd = new BigDecimal("0.2");
        BigDecimal bd2 = new BigDecimal("0.1");
        BigDecimal resultado;

        resultado = bd.add(bd2);
    
        valor = 0.2 + 0.1;
        System.out.println(resultado);
        System.out.println(valor);
    
    
      
        Media md = new Media();
        MaiorValor mv = new MaiorValor();
        
            int opcao = 0;
        do{
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção: "
                    + "\n1. Fatorial com While"
                    + "\n2. Fatorial com Do While"
                    + "\n3. Fatorial com For"
                    + "\n4. Progressão aritmética com While"
                    + "\n5. Progressão aritmética com Do While"
                    + "\n6. Progressão aritmética com For"
                    + "\n7. Fatorial com recursão"
                    + "\n8. Prograssão aritmética com recursão"
                    + "\n9. Média"
                    + "\n10. Maior Valor "
                    + "\n11. Sair"));
            switch(opcao) {
            
                case 1 :
                    Fatorial.fatorialWhile(4,1);
                    break;
                case 2 :
                    Fatorial.fatorialDoWhile(4,1);
                    break;
                case 3 : 
                    Fatorial.fatorialFor(4,1);
                    break;
                case 4 :  
                    ProgressaoAritmetica.progressaoWhile(5,0,9);
                    break;
                case 5 : 
                    ProgressaoAritmetica.progressaoDoWhile(5,0,9);
                    break;
                case 6 :
                    ProgressaoAritmetica.progressaoFor(5,0,9);
                    break;
                case 7 :
                    Fatorial.fatorialRecursivo (4,1);
                    break;         
                case 8 :
                    ProgressaoAritmetica.progressaoRecursivo(5,0,9);    
                    break;
                case 9 :
                    md.CalcularMedia();
                    break;
                case 10 :
                    mv.maiorValor();
                    break;    
            }
        
        }while(opcao != 11);  
    } 
}
