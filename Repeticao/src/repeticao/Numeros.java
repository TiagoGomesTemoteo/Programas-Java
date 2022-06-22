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
public class Numeros {
    
    int []valoresInteiros;
    int maior = 0, menor = 0;
    String valores = "";
    
    void leValores (){    
        if (valores.equals("")){    
            valores = JOptionPane.showInputDialog("Insira um valor");
        }else{
            valores = valores + " " + JOptionPane.showInputDialog("Insira um valor");
        }    
        
        String []vetString = valores.split(" ");
        valoresInteiros = new int [vetString.length];

        for(int i = 0; i < vetString.length; i++){
            valoresInteiros[i] = Integer.parseInt(vetString[i]);
        }

    }
    void multiplicaValores (){
        
        int valor = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira um valor"));
        
        for(int i = 0; i < valoresInteiros.length; i++){
            valoresInteiros[i] *= valor;
        }
        
        valores = "";        
        for(int i = 0; i < valoresInteiros.length; i++){            
            if(valores.equals("")){
                valores = Integer.toString(valoresInteiros[i]); 
            }else{
                valores += " " + Integer.toString(valoresInteiros[i]); 
            }    
        }
        
        mostraValores("");
    }

    int achaMaior(){       
        maior = valoresInteiros[0];
        for(int i = 0; i < valoresInteiros.length; i++){
            if(valoresInteiros[i] > maior){
                maior = valoresInteiros[i];
            }
        }       
        return maior;
    }

    int achaMenor(){
        menor = valoresInteiros[0];
        for(int i = 0; i < valoresInteiros.length; i++){
            if(valoresInteiros[i] < menor){
                menor = valoresInteiros[i];
            }
        }
        return menor;
    }

    void ordenaValores(int verifica, int aux){
    
        try{
            do{  
                verifica = 0;
                for(int i = 0; i < valoresInteiros.length; i++){   
                    if(i != valoresInteiros.length-1){
                        if(valoresInteiros[i] > valoresInteiros[i+1]){
                            aux = valoresInteiros[i];
                            valoresInteiros[i] = valoresInteiros[i+1];
                            valoresInteiros[i+1] = aux;
                            verifica = 1;
                        }
                    }
 
                }
            }while(verifica != 0); 
            
            mostraValores("");
        }catch(NullPointerException erro){
            JOptionPane.showMessageDialog(null,"Não há dados cadastrados");
        }
    
    }
        
    
    void mostraValores(String msg){
        msg = "Valores";
        for (int i: valoresInteiros){
             msg += "\n" + i;
        }
        
        JOptionPane.showMessageDialog(null,msg);
    }
}
