/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converter_numero;
import java.util.Scanner ;
/**
 *
 * @author ALUNO
 */
public class Converter_numero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int opcao;
    do{
    
    Scanner entrada = new Scanner (System.in);
    
        System.out.println("Digite o numero desejado para ser convertido");
       double numero = Double.parseDouble (entrada.nextLine ());
    
        System.out.println("+--------------------+");
        System.out.println("| 1 converter em m/s |");
        System.out.println("| 2 converte em  k/h |");
        System.out.println("| 3 sair             |");
        System.out.println("| 4 recomeçar        |");
        System.out.println("+--------------------+");
    
        System.out.println("Digite um das opiçoes disponiveis");
        opcao =entrada.nextInt();
    
    switch (opcao){
    
        case 1 :{
        double ms = numero / 3.6;
            System.out.println("O Numero convertido em m/s" + ms);
        
            System.out.println("Deseja recomeçar o programa ( Sim = 4 e Nao = 3");
        opcao =entrada.nextInt();
            break;
        }
        case 2 : {
        double kh = numero * 3.6;
            System.out.println("O numero convetido em k/h" + kh);
            
            System.out.println("Deseja recomeçar o programa( Sim = 4 e Nao =3) ");
        opcao =entrada.nextInt();
            
            break;
        }
        case 3 :{
            System.out.println("Fim do programa");
        
                break;}
        case 4 :
            System.out.println("O Programa vai reiniciar");
        break;
    }
    } while (opcao == 4);
    
    
    
    
    
    
    
    
    
    
    
    }
    
}
