/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pet2;

/**
 *
 * @author 53919153X
 */
public class PetShop {
    private String Cliente;
    private String Endereco;
    private String Email;
    private String NM_animal;
    private String Especie;
    private int idade;
    private String Msg = " ";
    
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
}
