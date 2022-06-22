/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qnt_onibus;

/**
 *
 * @author 53919153x
 */
public class Onibus {
    
    
    QNT_onibus ref = new QNT_onibus();
    EntradaSaida  es = new EntradaSaida();
    Conversor cv = new  Conversor();
    
    public  void informacao(){
    
    ref.setMsg("Digite a quantidade de lugares no  onibus");
    double onibus = cv.ConvSI(es.Entrada(ref.getMsg()));
    
    ref.setMsg("Digite a quantidade de pessoas");
    double qnt_ps = cv.ConvSI(es.Entrada(ref.getMsg()));
    
    
    ref.setQnt_ps(qnt_ps);
    ref.setOnibus(onibus);
    }

    public void calcular (){
    
         double calcular;
        
    calcular = ref.getQnt_ps()/ref.getOnibus();
    
    
     ref.setMsg("Sera necessario "+Math.ceil(calcular)+" onibus");
     es.Saida(ref.getMsg());
    }
}
