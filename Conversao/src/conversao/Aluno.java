/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversao;

/**
 *
 * @author 53919153x
 */
public class Aluno {

    private String nome;
    private int idade;
    private String sexo;
    private String msg;
  
    
    EntradaSaida io = new EntradaSaida();
    Conversor conversor = new Conversor();
    
    public Aluno(){
    this("",0,"");
    }
    
    public Aluno(String nm,int id,String sx){
    
    this.nome=nm;
    this.idade=id;
    this.sexo=sx;
        
    }
   
    public String getNome(){
    return nome;  
    } 
    public void setNome(String nm){
    this.nome = nm;
    }
    
    
    public int getIdade(){
    return idade;
    }
    public void setIdade(int id){
    this.idade=id;
    }
   
    public String getSexo(){
    return sexo;
    }  
    public void setSexo(String sx){
    this.sexo=sx;
    }
    
    
    public String getMSG(){
    return msg;
    }
    public void setMSG(String msg){
    this.msg = msg;
    }
    
    public void cadastrar(){
    
        msg="Digite seu nome";
        String nm = io.Entrada(msg);
  
        msg="Digite sua idade";
        int id=conversor.ConvSI(io.Entrada(msg));
        
        msg="Digite seu sexo";
        String sx=io.Entrada(msg);
        
        this.setNome(nm);
        this.setIdade(id);
        this.setSexo(sx);
        
    }
        
    public void exibir(){
         
      msg="Nome"+this.getNome()
      +"\n"
      +"Idade"+this.getIdade()
      +"\n"
      +"Sexo"+this.getSexo();
   
        io.Saida(msg);
        
    }
}
