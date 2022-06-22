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
public class Informatica extends Curso{

ES es = new ES();
Conversor c = new Conversor();
    
    public String disciplina;
    public double notas; 
    
    public String msg;

public void calcularMedia(){
  
 msg="Digite quantas disciplinas tem em seu curso";
 int qnt_mt = c.ConvSI(es.Entrada(msg));
 double soma=0;
 
 for(int i=0; i<qnt_mt;i++){
 
 msg="Digite a "+(i+1)+" disciplina"; 
 disciplina = es.Entrada(msg);
 
 msg="Qual foi a sua nota na "+(i+1)+" disciplina -"+disciplina;
 notas = c.ConvSD(es.Entrada(msg));
 
  soma += notas;
 }
 double media =0;
 media = soma/qnt_mt;
 

msg="Informações do Aluno"
    +"\n"
    +"Id: "+this.id
    +"\n"
    +"Periodo: "+this.periodo
    +"\n"    
    +"Media: "+media;
    
es.Saida(msg);

}
}



