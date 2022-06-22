/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repeticao;

import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author tiago
 */
public class MaiorValor {
    
    int opcao;
    double valor, maiorValor = 0, menorValor = 0;
    
    DecimalFormat df = new DecimalFormat("#");
    ArrayList<Double> al = new ArrayList();
    
    void maiorValor(){
        do{
            opcao = Integer.parseInt(JOptionPane.showInputDialog(null,"Escolha uma opção"
                    + "\n1. Adicionar valor"
                    + "\n2. Mostrar o maior e o menor valor"
                    + "\n3. Mostrar todos os valores"
                    + "\n4. Sair"));
    
            switch (opcao){
                case 1:
                    valor = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite um valor"));
                    al.add(valor);
                    break;
                
                case 2:
                    JOptionPane.showMessageDialog(null,"Maior valor : " + df.format(MaiorValor())
                    +"\nMenor valor : " + df.format(MenorValor()));
                    break;
                
                case 3:
                    ExibirValores();
                    break;
                    
            }
        }while(opcao != 4);
    }
    
    double MaiorValor(){
        
        maiorValor = al.get(0);
        
        //Maior Valor
        for(int i = 0; i < al.size(); i++){
            
            if(al.get(i) > maiorValor){
                maiorValor = al.get(i);
            }
            
        }
        return maiorValor;
    }
    
    double MenorValor(){
        menorValor = al.get(0);
        
        //Menor Valor
        for(int i = 0; i < al.size(); i++){
            if(al.get(i) < menorValor){
                menorValor = al.get(i);
            }
        }
        return menorValor;
    }
    
    void ExibirValores(){
        
        String msg = "";
        for(int i = 0; i < al.size(); i++){
            msg = msg + "\n "+ df.format(al.get(i));
        }
        
        JOptionPane.showMessageDialog(null,msg);
    }
}
