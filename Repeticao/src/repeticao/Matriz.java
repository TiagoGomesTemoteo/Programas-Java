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
public class Matriz {
    //soma, subtração, multiplicação por escalar e multiplicação de matrizes 
    final double v = 11.1;
    int lM1 = 4, cM1 = 4, lM2 = 4, cM2 = 4;
    
    int [][] valoresM1 = new int[lM1][cM1];
    int [][] valoresM2 = new int[lM2][cM2];
    int [][] valoresOperacao = new int [4][4];
    
    void insereValores(){
        
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                valoresM1[i][j] = 1;
                valoresM2[i][j] = 2;
                valoresOperacao[i][j] = 0;
                
            }
        }
     
    }
    
    void somaMatriz(){
        
        valoresOperacao = new int [lM1][cM1]; 
        
        for(int i = 0; i < lM1; i++){
            for(int j = 0; j < cM1; j++){
                valoresOperacao[i][j] = valoresM1[i][j] + valoresM2[i][j];
            }
        }
    }
    
    void subtraiMatriz(){
        
        valoresOperacao = new int [lM1][cM1]; 
        
        for(int i = 0; i < lM1; i++){
            for(int j = 0; j < cM1; j++){
                valoresOperacao[i][j] = valoresM1[i][j] - valoresM2[i][j];
            }
        }
    }
    
    void multiplicaEscalar(){
        for(int i = 0; i < lM1; i++){
            for(int j = 0; j < cM1; j++){
                valoresM1[i][j] *= 2;
                valoresM2[i][j] *= 2;
            }
        }
    }
    
    
    void exibirValores(){
        
        String msg = "Valores";
        
        msg+="\n Matriz 1 \n";
        
        for(int i = 0; i < lM1; i++){
            for(int j = 0; j < cM1; j++){
                msg += "    " + Integer.toString(valoresM1[i][j]);
                
            }
            msg+= "\n";
        }
        
        msg+="\n Matriz 2 \n";
        for(int i = 0; i < lM1; i++){
            for(int j = 0; j < cM1; j++){
                msg += "    " + Integer.toString(valoresM2[i][j]);
            }
            msg+= "\n";
        }
        
        msg+="\n Matriz operação \n";
        
        
            for(int i = 0; i < lM1; i++){
                for(int j = 0; j < cM1; j++){
                    msg += "    " + Integer.toString(valoresOperacao[i][j]);
                }
                msg+= "\n";
            }
       
        
        JOptionPane.showMessageDialog(null,msg);

    }
    
    
    
    
}
