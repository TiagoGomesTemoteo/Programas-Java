/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frasestring;

/**
 *
 * @author 53919153x
 */
public class Frase {

    private String frases,frase_maiuscula,palindromo,msg;
    private int num_caracter, num_vogais,qnt_numeros;
    
    public String getFrase() {
        return frases;
    }

    public void setFrase(String frases) {
        this.frases = frases;
    }

    public String getFrase_maiuscula() {
        return frase_maiuscula;
    }

    public void setFrase_maiuscula(String frase_maiuscula) {
        this.frase_maiuscula = frase_maiuscula;
    }

    public int getNum_vogais() {
        return num_vogais;
    }

    public void setNum_vogais(int num_vogais) {
        this.num_vogais = num_vogais;
    }

    public int getQnt_numeros() {
        return qnt_numeros;
    }

    public void setQnt_numeros(int qnt_numeros) {
        this.qnt_numeros = qnt_numeros;
    }

    public String getPalindromo() {
        return palindromo;
    }

    public void setPalindromo(String palindromo) {
        this.palindromo = palindromo;
    }
    
    public int getnum_caracter(){
        return num_caracter;
    }
    public void setnum_caracter(int num_caracter){
        this.num_caracter = num_caracter;
    }
   
    public String getMsg(){
       return msg;
    }
    public void setMsg(String msg){
       this.msg=msg;
    }
    
   public  Frase(){
       
   this("",0,0,"",0);
   } 
   
   public  Frase(String palindromo,int qnt_numeros, int num_vogais,String frase_maiuscula,int num_caracter){
  

       this.palindromo = palindromo;  
       this.num_caracter = num_caracter;
       this.qnt_numeros = qnt_numeros;
       this.num_vogais = num_vogais;
       this.frase_maiuscula = frase_maiuscula;
       
   }
   
   EntradaSaida ES = new EntradaSaida();
   
   public void numero_caracter(){
     
  this.setFrase(frases);
  this.setnum_caracter(num_caracter);
  
   msg="Digite uma seguencia de caracteres";
   frases = ES.Entrada(msg);
   
  
  
   num_caracter = frases.length();
   
   
   msg="A sequencia digitada tem "+this.getnum_caracter()+" Caracteres";
   ES.Saida(msg);
     
   }
   
   
  public void letra_maiuscula(){
        
  msg="Sequencia maiuscula "+this.getFrase().toUpperCase();
  ES.Saida(msg);
  } 
  
  public void numero_vogais(){
  
 this.setNum_vogais(num_vogais);
      
 
 for(int i = 0; i <frases.length(); i++){
  char c = frases.charAt(i); 
 
     if(c=='a' || c=='A' || c=='e' || c=='E' || c=='i' || c=='I' || c=='o' || c=='O' || c=='u' || c=='U'){
     
         num_vogais++;
     }
 }
      
  msg="Numero de vogais "+this.getNum_vogais();
  
  ES.Saida(msg);
  }
   
  public void num_digitos(){
  
      this.setQnt_numeros(qnt_numeros);

      for(int i=0; i<frases.length(); i++){
      char c  = frases.charAt(i);
      
      if(c=='1' || c=='2' || c=='3' || c=='4' || c=='5' || c=='6' || c=='7' || c=='8' || c=='9'){
          qnt_numeros++;
      }
      }
  
  msg="Numero de digitos "+this.getQnt_numeros();
  ES.Saida(msg);
  
  }
 
  public void palindromo(){
  
  this.setPalindromo(palindromo);
  
  palindromo = new StringBuffer(frases).reverse().toString();
  
  if(frases.equals(palindromo)){
  
      msg="Palindromo";
      
      ES.Saida(msg);
  }
  
  else{
      
      msg="Não é Palindromo";
      
      ES.Saida(msg);
      
  }
  
  }

}