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
public class Menu {
   
      EntradaSaida ES = new EntradaSaida();
      Conversor    CV = new Conversor();
      PetShop ref = new PetShop();
     
     
      public void cadastrar(){
   
    ref.setMsg("Digite o nome do Cliente");
    String Cli = ES.Entrada(ref.getMsg());
    
    ref.setMsg("Digite o Endereco do Cliente");
    String End = ES.Entrada(ref.getMsg());
    
    ref.setMsg(  "Digite o Email do Cliente");
    String Eml = ES.Entrada(ref.getMsg());
    
    ref.setMsg(  "Digite o nome do Animal");
    String NM_A = ES.Entrada(ref.getMsg());
    
    ref.setMsg ( "Digite a especie do Animal");
    String Esp = ES.Entrada(ref.getMsg());
    
    ref.setMsg(  "Digite a idade do animal");
    int ID_animal = CV.ConvSI(ES.Entrada(ref.getMsg()));         
    
    ref.setCliente(Cli);
    ref.setEmail(Eml);
    ref.setEndereco(End);
    ref.setNM_animal(NM_A);
    ref.setEspecie(Esp);
    ref.setID_animal(ID_animal);
    
    ref.setMsg(  "Cadastro bem - sucesso"
            +"\n"
            +"Digite '2' para exibir os dados");
    ES.Saida(ref.getMsg());
    }
    
    public void consultar(){
    ref.setMsg(  "Nome Cliente : " +ref.getCliente()
            +"\n"
            +"Endereco : "+ref.getEndereco()
            +"\n"
            +"Email : "+ref.getEmail()
            +"\n"
            +"Nome Animal : "+ref.getNM_animal()
            +"\n"
            +"Especie : "+ref.getEspecie()
            +"\n"
            +"Idade do Animal : "+ref.getID_animal())
            ; 
    
    ES.Saida(ref.getMsg());
    }
}
