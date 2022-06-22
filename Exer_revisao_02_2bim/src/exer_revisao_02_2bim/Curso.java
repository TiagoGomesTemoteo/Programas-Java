/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer_revisao_02_2bim;
import javax.swing.JOptionPane;
/**
 *
 * @author Tiago
 */
public class Curso {
     public int id;
     protected String periodo;
         
   
  public void cadastrarCurso(){
 
     this.id = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a ID: "));
     this.periodo = JOptionPane.showInputDialog(null,"Digite o periodo: ");
 
 }
}
