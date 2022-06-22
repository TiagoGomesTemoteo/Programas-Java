/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repeticao;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author tiago
 */
public class Media {
    DecimalFormat df = new DecimalFormat("#.##");
    
    double media = 0, nota1 = 0, nota2 = 0, nota3 = 0, notaRecuperacao = 0;

    void CalcularMedia(){
        
        nota1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a 1º nota"));
        nota2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a 2º nota"));
        nota3 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a 3º nota"));
        
        if((nota1 <= nota2 && nota2 <= nota3) ||(nota1 <= nota3 && nota3 <= nota2)){
            media = (nota2 + nota3)/2;
                            
        }else if ((nota2 <= nota1 && nota1 <=  nota3) || (nota2 <= nota3 && nota3 <= nota1)){
            media = (nota1 + nota3)/2;
                               
        }else if ((nota3 <= nota1 && nota1 <= nota2) || (nota3 <= nota2 && nota2 <=  nota1)){
            media = (nota1 + nota2)/2;    
        }
        
         //Verificando se o aluno está aprovado
            if(media >= 6){               
                JOptionPane.showMessageDialog(null,"Aprovado, média :"+df.format(media));
                
            }else{
                notaRecuperacao = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da avaliação de recuperação"));   
                media = (media + notaRecuperacao)/2;
                
                if(media >= 6){
                    JOptionPane.showMessageDialog(null,"Aprovado, média : " +df.format(media));
                    
                }else{
                    JOptionPane.showMessageDialog(null,"Reprovado após avaliação final, média : "+df.format(media));
                }
            }
    }
}
