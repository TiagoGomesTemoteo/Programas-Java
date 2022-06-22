/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pet;

/**
 *
 * @author 53919153x
 */
public class PetShop {
 
   //Atributos 
    private String Cliente;
    private String Endereco;
    private String Email;
    private String NM_animal;
    private String Especie;
    private int idade;
    private String Msg = " ";
    
  EntradaSaida ES = new EntradaSaida();
  Conversor    CV = new Conversor();
    
//metodo construtor

    public PetShop(){
    this("","","","","",0);
    }
    public  PetShop(String Cli,String End,String Email,String NM_A,String Esp, int ID_animal){
    
    this.Cliente = Cli;
    this.Email = Email;
    this.Endereco = End;
    this.Especie = Esp;
    this.NM_animal = NM_A;
    this.idade=ID_animal;
    
    }

//Modificadores de acesso

    public void setCliente(String Cli){
    this.Cliente = Cli;
    }
    public String getCliente(){
    return Cliente;
    }
   
   
    public void setEndereco(String End){
    this.Endereco = End;
    }
    public String getEndereco(){
    return Endereco;
    }
   
    
    public void setEmail (String Eml){
    this.Email = Eml;
    }  
    public String getEmail(){
    return Email;
    }

    public void setNM_animal(String NM_A){
    this.NM_animal = NM_A;
    }
    public String getNM_animal(){
    return NM_animal;
    }

    public void setEspecie (String Esp){
    this.Especie = Esp;
    }
    public String getEspecie(){
    return Especie;
    }
   
    public void setID_animal(int ID_animal ){
    this.idade=ID_animal;
    }
    public int getID_animal(){
    return idade;
    }
    
    public void setMsg(String Msg){
    this.Msg = Msg;
    }
    public String getMsg(){
    return Msg;
    }
    
    public void cadastrar(){
   
    Msg = "Digite o nome do Cliente";
    String Cli = ES.Entrada(Msg);
    
    Msg = "Digite o Endereco do Cliente";
    String End = ES.Entrada(Msg);
    
    Msg = "Digite o Email do Cliente";
    String Eml = ES.Entrada(Msg);
    
    Msg = "Digite o nome do Animal";
    String NM_A = ES.Entrada(Msg);
    
    Msg = "Digite a especie do Animal";
    String Esp = ES.Entrada(Msg);
    
    Msg = "Digite a idade do animal";
    int ID_animal = CV.ConvSI(ES.Entrada(Msg));         
    
    this.setCliente(Cli);
    this.setEmail(Eml);
    this.setEndereco(End);
    this.setNM_animal(NM_A);
    this.setEspecie(Esp);
    this.setID_animal(ID_animal);
    
    Msg  = "Cadastro bem - sucesso"
            +"\n"
            +"Digite '2' para exibir os dados";
    ES.Saida(Msg);
    }
    
    public void consultar(){
    Msg = "Nome Cliente : " +this.getCliente()
            +"\n"
            +"Endereco : "+this.getEndereco()
            +"\n"
            +"Email : "+this.getEmail()
            +"\n"
            +"Nome Animal : "+this.getNM_animal()
            +"\n"
            +"Especie : "+this.getEspecie()
            +"\n"
            +"Idade do Animal : "+this.getID_animal()
            ; 
    
    ES.Saida(Msg);
    }
    
    
    
}

