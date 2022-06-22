/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_aula_05;
import javax.swing.JOptionPane;
/**
 *
 * @author 53919153X
 */
public class Produtos {
    
    private String descricao;
    private int quantidade;
    private float preco;
   
    
    public String getDescricao(){
    return descricao;   
    }
    
    public void setDescricao(String descricao){
   
    this.descricao = descricao;   
   } 

    
  
   public int getquantidade(){
   return quantidade;
   }

   public void setquantidade(int quantidade){
   
   this.quantidade = quantidade;
   }

  
   public float getpreco(){
   
   return preco;
   }

   public void setpreco(float preco){
   
   this.preco = preco ;
   }

   public void cadastrar(){
   
   this.descricao = JOptionPane.showInputDialog("Digite descricao");
   this.quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade do produto"));
   this.preco = Float.parseFloat(JOptionPane.showInputDialog("Digite o preco"));
   }

   public void calcularTotal(int qtd,float preco ){
  
   this.quantidade = qtd;
   this.preco = preco;
      
   double valor_total = quantidade * preco;
       
       JOptionPane.showMessageDialog(null,valor_total);
   }
}

