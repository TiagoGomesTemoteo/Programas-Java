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
public class Exer_Controle_Pessoal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
    Pessoa p1 = new Pessoa();
    Cachorro c1 = new Cachorro();
    Conta_Bancaria  cb1= new Conta_Bancaria();  
    Carro cr = new Carro();
     
    JOptionPane.showMessageDialog(null," Bem-Vindo"
            +"\n"+"Insira as informações solicitadas para gerar um relatorio");  
    
    p1.metodos_pessoais();
    c1.dadosAnimal();
    c1.despesasAnimal();
    cr.dadosCarro();
    cr.abastecer();
    cr.custoAbastecimento();
    
    cb1.dadosContaBancaria();
    
    int op = Integer.parseInt(JOptionPane.showInputDialog(null," Digite :"
            + "\n1"+" para Creditar"
            + "\n2"+" para Debitar"
            + "\n3"+" Sair"           
    )); 
    
    if(op==1){
    cb1.creditar();
    }
    
    else if(op==2){
    cb1.debitar();
    }
    
    else{
      JOptionPane.showMessageDialog(null,"Opção invalida");
    }
    
    
        System.out.println("Relatorio"
                +"\n"+"Nome : "+p1.getNome()
                +"\n"+"Idade : "+p1.getIdade()
                +"\n"+"RG : "+p1.getRG()
                +"\n"
                +"\n"+" **** Animal ****"
                +"\n"+"Nome  :"+c1.getNome()
                +"\n"+"Raça  :"+c1.getRaca()
                +"\n"
                +"\n"+" **** Carro ****"
                +"\n"+"Cor :"+cr.getCor()
                +"\n"+"Modelo :"+cr.getModelo()
                +"\n"+"Marca :"+cr.getMarca()
                +"\n"
                +"\n"+" **** Conta Bancaria ****"
                +"\n"+"Numero da conta :"+cb1.getNr_conta()
                +"\n"+"Saldo atual :");
        
                System.out.printf( cb1.getSaldo() - (c1.getVl_tratamento() + cr.getVl_mes())  
                +"\n"+"Agencia :"+cb1.getAgencia()
                +"\n"
                +"\n"+" **** Despesas com o Cachorro ****"
                +"\n"+"Alimento :"+c1.getAlimento()
                +"\n"+"Vacina :"+c1.getVacina()
                +"\n"+"Banho :"+c1.getBanho()
                +"\n"+"Tosa :"+c1.getTosa()
                +"\n"+"Remedios :"+c1.getRemedios()
                +"\n"+"Gasto total :"+c1.getVl_tratamento()
                + "\n"
                +"\n"+"**** Despesas com o carro ****"
                +"\n"+"Combustivel :"+cr.getVl_mes()
                
        
    
        );        
// TODO code application logic here
    }
    
}
