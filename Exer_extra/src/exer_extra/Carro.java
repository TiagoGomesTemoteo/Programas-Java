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
public class Carro extends Veiculo{

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }
 
private String motor;
    
Carro(){
this("");
}

Carro( String motor){
this.motor = motor;    
}
public void ligarMotor(){

    int ligar_motor = Integer.parseInt(JOptionPane.showInputDialog(null," Digite 1=ligar ou 2=nao ligar"));
    
    
    if(ligar_motor == 1){
    JOptionPane.showMessageDialog(null,"Motor ligado");
    }
    
    else{
    JOptionPane.showMessageDialog(null,"Motor desligado");
    }
}
} 