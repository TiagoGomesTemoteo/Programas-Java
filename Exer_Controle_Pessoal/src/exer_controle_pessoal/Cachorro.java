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
public class Cachorro {
    
    private String nome, raca; 
    private double alimento, vacina, banho, tosa, remedios, Vl_tratamento;
    
    public double getVl_tratamento(){
        return Vl_tratamento;
    }
    
    public void setVl_tratamento(double Vl_tratamento){    
        this.Vl_tratamento = Vl_tratamento; 
    }
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome=nome;
    }
    
    public String getRaca(){
       return raca; 
    }
    
    public void setRaca( String raca){
       this.raca=raca;
    }
    
    public double getAlimento(){
      return alimento;
    }
    
    public void setAlimento(double alimento){
      this.alimento=alimento;
    }
    
    public double getVacina(){
      return vacina;
    }
    public void setVacina(double vacina){
      this.vacina =vacina;      
    }
    
    public double getBanho(){
      return banho;        
    }
    
    public void setBanho(double banho){
      this.banho=banho;
    }
    
    public double getTosa(){
      return tosa; 
    }
    public void setTosa(double tosa){
       this.tosa=tosa;        
    }
    
    public double getRemedios(){
      return remedios;      
    }
    
    public void setRemedios(double remedios){
      this.remedios=remedios;
    }
    
    public Cachorro(){
     this(0,"","",0,0,0,0,0);
    }
    
    public Cachorro(double Vl_tratamento,String nome, String raca, double alimento, double vacina, double banho, double tosa, double remedios){
      
      this.Vl_tratamento = Vl_tratamento;  
      this.nome=nome;  
      this.raca=raca;
      this.alimento=alimento;
      this.vacina=vacina;
      this.banho=banho;
      this.tosa=tosa;
      this.remedios=remedios;
        
    }
    
    public void dadosAnimal(){
       this.setNome(nome);
       this.setRaca(raca);
        
       nome = JOptionPane.showInputDialog(null,"Digite o nome do animal : ");
       raca = JOptionPane.showInputDialog(null,"Digite a raça do "+nome);
    }
    
    public void despesasAnimal(){
      this.setAlimento(alimento);
      this.setVacina(vacina);
      this.setBanho(banho);
      this.setTosa(tosa);
      this.setRemedios(remedios);
      this.setVl_tratamento(Vl_tratamento);
      
      alimento = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite as dispesas mensais com a alimentação do(a) " +nome));
      vacina = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite os castos mensais com as vacinas do(a) "+nome));     
      banho = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite os castos mensais com os banhos do(a) "+nome));
      tosa = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite os castos mensais com tosa do(a) "+nome));
      remedios = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite os castos mensais com os remedios do(a) "+nome));    
   
      JOptionPane.showMessageDialog(null,"Dispesas com  o(a)"+nome
      +"\n"+"Alimentação :"+alimento
      +"\n"+"Vacina :"+vacina
      +"\n"+"banho :"+banho
      +"\n"+"tosa :"+tosa
      +"\n"+"remedios :"+remedios        
      );
    
       
      Vl_tratamento+= vacina + alimento + banho + tosa + remedios;
      
      JOptionPane.showMessageDialog(null,"Total"+Vl_tratamento);
    }
    
    
}
