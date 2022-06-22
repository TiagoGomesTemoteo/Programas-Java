/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer_extra;

import javax.swing.JOptionPane;



/**
 *
 * @author 53919153X
 */
public class Veiculo {

private String cor="";
private int anoFabricado=0;

public String getCor(){
return cor;
}
public void setCor( String cor){
this.cor=cor;
}
public int getAnoFabricado(){
return anoFabricado;
}
public void setAnoFabricado( int anoFabricado){
this.anoFabricado = anoFabricado;
}


Veiculo(){
this("",0);
}
Veiculo(String cor, int anoFabricado){

this.cor = cor;
this.anoFabricado = anoFabricado;

}

public boolean pintar(String cor){
    
 
    
    cor = JOptionPane.showInputDialog(null,"Digite qual a cor do seu carro");
    String escolha = JOptionPane.showInputDialog(null,"Deseja pintar de que cor o carro ? ");
    
    if(cor.equals(escolha)){
    
    return false;
    } 
    
    else{
     
    return true;
    
    }
}

}

