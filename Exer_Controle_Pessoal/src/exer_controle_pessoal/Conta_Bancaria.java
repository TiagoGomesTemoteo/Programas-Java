/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer_controle_pessoal;

import javax.swing.JOptionPane;

/**
 *
 * @author Tiago
 */
public class Conta_Bancaria {
    
    private int nr_conta; 
    private double saldo;
    private String agencia;
    private double gasto_total;
    
    public double getGasto_total() {
        return gasto_total;
    }

    public void setGasto_total(double gasto_total) {
        this.gasto_total = gasto_total;
    }
    
           
    public int getNr_conta(){
      return nr_conta;
    }
    
    public void setNr_conta( int nr_conta){
     this.nr_conta=nr_conta;        
    }

    
    public double getSaldo(){
       return saldo;
    } 
    
    public void setSaldo(double saldo){
     this.saldo=saldo;
    }
    
  
    
    public String getAgencia(){
       return agencia;
    }
    
    public void setAgencia( String agencia){
      this.agencia=agencia;
    }

   
    Conta_Bancaria(){
     
         this(0,0,0,"");
     }
    
     Cachorro c1 = new Cachorro();
     Carro cr = new Carro();

    Conta_Bancaria( double gasto_total,int nr_conta, double saldo,  String agencia ){
          
        this.gasto_total = gasto_total;
        this.nr_conta=nr_conta;
        this.saldo=saldo;
        this.agencia=agencia;
    }
  
     public void dadosContaBancaria(){
       this.setNr_conta(nr_conta);
       this.setSaldo(saldo);
       this.setAgencia(agencia);
       
       nr_conta = Integer.parseInt(JOptionPane.showInputDialog(null," Digite o numero da sua conta Bancaria"));
       saldo = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o saldo atual da conta"));
       agencia = JOptionPane.showInputDialog(null,"Digite a agencia em que sua conta esta cadastrada");
     }

    public void creditar(){
        
        double creditar;
        
        creditar = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a quantia que você deseja creditar "));
        
        saldo+=creditar;
        
        JOptionPane.showMessageDialog(null,"Saldo atual "+saldo);
    }

    public void debitar(){
        
       int escolha = 1;
         
    
       if(escolha ==1){
       
        int debitado = Integer.parseInt(JOptionPane.showInputDialog(" Digite o valor a ser debitado"));
       
         
        this.saldo = this.saldo - debitado;
        
        
       }
       
       
       JOptionPane.showMessageDialog(null,"saldo "+ saldo);
    }
    
    
    
}
