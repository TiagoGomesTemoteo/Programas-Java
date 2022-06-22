/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baskara;

import javax.swing.JOptionPane;

/**
 *
 * @author 53919153X
 */
public class Baskara {

    /**
     * @param args the command line arguments
     */
   private int valor_A, valor_B,valor_C,x,y,raiz  ;
     
public int getraiz(){
return raiz;
}    
void setraiz(int raiz){
this.raiz = raiz;
}



public int getx(){
return x;
} 
void setx(int x){
this.x = x;
}


public int gety (){
return y;
}
void sety(int y){
this.y = y;
}


public int getvalor_A(){
return valor_A;
}    
void setvalor_A(int valor_A){
this.valor_A = valor_A;
}



public  int getvalor_B(){
return valor_B;
}
void setvalor_B(int valor_B){
this.valor_B = valor_B;
}



public int getvalor_C(){
return valor_C;
}
void setvalor_C(int valor_C){
this.valor_C = valor_C; 
}



public Baskara (){

this(0,0,0,0,0,0);
}

public Baskara (int vla,int vlb, int vlc, int x,int y,int raiz){

this.valor_A = vla;
this.valor_B = vlb;
this.valor_C = vlc;
this.x=x;
this.y=y;
this.raiz=raiz;


}
 
public void print (){

int vla = Integer.parseInt(JOptionPane.showInputDialog(" Digite o valor de A "));
this.setvalor_A(vla);

int vlb = Integer.parseInt(JOptionPane.showInputDialog(" Digite o valor de B "));
this.setvalor_B(vlb);

int vlc = Integer.parseInt(JOptionPane.showInputDialog(" Digite o valor de C "));
this.setvalor_C(vlc);     
    
JOptionPane.showMessageDialog(null,vla+ "X²"+vlb+"X"+"+"+vlc+" = 0 ");

}
public void raizes(int vla , int vlb , int vlc){
    
    int Delta = ( vlb * vlb) - (4 * vla * vlc);
    
    if(Delta >= 0 ){
    
         x = (int) (-vlb + Math.sqrt(Delta)) / (2 * vla);
         y = (int) (-vlb - Math.sqrt(Delta)) / (2 * vla);
        JOptionPane.showMessageDialog(null,"X¹ "+x+"\n"+"X² "+y);
         
    }    
    else {
    
    JOptionPane.showMessageDialog(null," Não há raiz ");
    }
}
public void somaRaizes (int valor_X , int valor_Y){
        this.x= valor_X;
        this.y= valor_Y;
    
         int somaraizes  = valor_X + valor_Y;
    
    JOptionPane.showMessageDialog(null,"Soma das raizes " + somaraizes);
}
public void produtoRaizes (int valor_X , int valor_Y){
       this.x = valor_X;
       this.y = valor_Y;
       
       int produtoraizes = valor_X * valor_Y;
       
       JOptionPane.showMessageDialog(null,"Produto da raiz " + produtoraizes);

}
}
