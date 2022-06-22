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
public class QNT_onibus {

   private double qnt_ps;
   private double onibus;
   private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
   

    public double getQnt_ps() {
        return qnt_ps;
    }

    public void setQnt_ps(double qnt_ps) {
        this.qnt_ps = qnt_ps;
    }

    public double getOnibus() {
        return onibus;
    }

    public void setOnibus(double onibus) {
        this.onibus = onibus;
    }
   
   
    public QNT_onibus(){
    
    this(0,0);
    }

    public QNT_onibus(double qnt_ps,double onibus){
    
    this.onibus = onibus;
    this.qnt_ps = qnt_ps;
    }
}
