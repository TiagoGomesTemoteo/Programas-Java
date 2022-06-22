/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repeticao;

import javax.swing.JOptionPane;

/**
 *
 * @author tiago
 */
public class PrincipalMatriz {
    public static void main(String[] args) {
        Matriz m = new Matriz();
        int valor;
        int opcao; 
        
        do{
                opcao = Integer.parseInt(JOptionPane.showInputDialog(null,"Escolha uma opção"
                        + "\n1. Inserir valores"
                        + "\n2. Soma matriz"
                        + "\n3. Subtrai matriz"
                        + "\n4. Multiplicação escalar"
                        + "\n5. Multiplicar matrizes"
                        + "\n6. Exibir matrizes "
                        + "\n7. Sair"));

                switch (opcao){
                    case 1:
                        m.insereValores();
                        break;          
                        
                    case 2:
                        m.somaMatriz();                                               
                        break;

                    case 3:
                        m.subtraiMatriz();
                        break;
                        
                    case 4:
                        m.multiplicaEscalar();
                        break;
                        
                    case 5:
                        break;
                        
                    case 6:
                        m.exibirValores();
                        break;
                }
            }while(opcao != 7);
        
    }
}
