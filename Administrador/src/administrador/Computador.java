/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package administrador;

import javax.swing.JOptionPane;

/**
 *
 * @author Tiago
 */
public class Computador {
    private float tamanho_HD , frequencia_clock;
    private String NM_processador;
    

    
    public void setTamanho_HD(float tamanho_HD){
    this.tamanho_HD = tamanho_HD;
    }
    public float getTamanho_HD(){
    return tamanho_HD;    
    } 
    
    public void setFrequencia_clock(float frequencia_clock){
    this.frequencia_clock = frequencia_clock;    
    }
    public float getFrequencia_clock(){
    return frequencia_clock;
    }
   
    public void setNM_processador (String NM_processador){
    this.NM_processador = NM_processador;
    }
    public String getNM_processador(){
    return NM_processador;
    } 


    public Computador (){
    this(0,0,"");
    }
    public Computador (float tamanho,float Clock,String NM){
      
      this.NM_processador = NM;
      this.frequencia_clock =Clock;
      this.tamanho_HD = tamanho;
        
      
    }
     
    public void print (){
    
      
      String NM = JOptionPane.showInputDialog("Digite o nome do processador ");
      this.setNM_processador(NM);
      
      float Clock = Float.parseFloat(JOptionPane.showInputDialog("Digite a frequencia de clock "));
      this.setFrequencia_clock(Clock);
      
      float tamanho= Float.parseFloat(JOptionPane.showInputDialog("Digite o tamanho do HD "));
      this.setTamanho_HD(tamanho);
     
      JOptionPane.showMessageDialog(null,"Nome do procesador "+NM+"\n "
             +"Frequencia de Clock "+Clock+"\n "+"Tamanho do HD "+tamanho);
     
    
    }
    public void comparaCom(float tamanho, float Clock, String NM){
       
        
        float tamanho2;
        float Clock2;
        String NM2;
        
        
       
        tamanho2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o tamanho do HD do segundo Computador"));
        Clock2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a frequencia de clock do segundo Computador"));
        NM2 = JOptionPane.showInputDialog("Digite o nome do processador do segundo computador ");  
    
       
        
       
        if (tamanho == tamanho2 && Clock == Clock2 ){
            JOptionPane.showMessageDialog(null,"True");
       
        
        }    
      
        
        else{
            JOptionPane.showMessageDialog(null,"False");
       }
    }
    
    
    public void comparaCom2(float tamanho,float Clock,String NM){
    
        
        float tamanho3;
        float Clock3;
        String NM3; 
 
        
        tamanho3 = Float.parseFloat(JOptionPane.showInputDialog("Digite o tamanho do HD do terceiro computador"));
        Clock3 = Float.parseFloat(JOptionPane.showInputDialog("Digite a frequencia de clock do terceiro computador"));
        NM3 = JOptionPane.showInputDialog("Digite o nome do terceiro Processador");
        
        
        String escolha;
        
       
        
        escolha = JOptionPane.showInputDialog("Digite 'HD' se você quer compara o tamanho do HD "+"\n"+"OU"+"\n"+"'CLOCK' para compara frequencia de clock"); 
    
       if ("HD".equals(escolha) || "hd".equals(escolha)){
              
              if(tamanho > tamanho3){
              JOptionPane.showMessageDialog(null,"O HD do computador  1 "+tamanho+"\n"+"É maior que "+"\n"+"O  HD do computador 3 --> "+tamanho3);
              }
              else if (tamanho3 > tamanho){
              JOptionPane.showMessageDialog(null,"O HD do computador  3 "+tamanho3+"\n"+"É maior que"+"\n"+"O HD do computador 1 --> "+tamanho);
              }      
              else{
              
              JOptionPane.showMessageDialog(null,"O tamanho dos HD's são  iguais "+"\n"+"HD do 1º Computador "+tamanho+"\n"+"HD do 3° Computador"+tamanho3);
              }
       
       }
           
       else if ("CLOCK".equals(escolha) || "clock".equals(escolha)){
                                  
               if(Clock > Clock3 ){
               JOptionPane.showMessageDialog(null,"A frequencia de clock do computador  1 "+Clock+"\n"+"É maior que "+"\n"+" A frequencia de clock do computador 3 --> "+Clock3);          
               }              
               else if (Clock < Clock3){
               JOptionPane.showMessageDialog(null,"A frequencia de clock do computador 3 "+Clock3+"\n"+"É maior que "+"\n"+" A frequencia de clock do computador 1 -->"+Clock);           
               }
               else{
               
               JOptionPane.showMessageDialog(null," A frequencia de clock  do computador 1"+Clock+"\n"+"É"+" igual ao do computador 3 "+Clock3);
               }
       }
       
       else{
        JOptionPane.showMessageDialog(null,"Opção invalida");
       }
    
    }
}
