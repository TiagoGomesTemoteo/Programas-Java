/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repeticao;

/**
 *
 * @author tiago
 */
public class Fatorial {
    
    
    static void fatorialWhile(int num, int fat){             
        while(num > 1){
            fat = fat * num;
            num = num - 1;
        }
        System.out.println("Fat while :" + fat);
    }
    
    static void fatorialDoWhile(int num, int fat){
         do{
    
            fat = fat * num;
            num = num - 1;

        }while(num > 1);

        System.out.println("Fat do/While :" + fat);
    }
    static void fatorialFor(int num, int fat){    
        for(; num > 1; num-- ){
            fat = fat * num;
        }
        System.out.println("Fat for :" + fat);
    }
    
    static void fatorialRecursivo(int num, int fat){
        if(num <= 1){
            System.out.println("Fat while :" + fat);
            return;
        } 
         fat = fat * num;
         num = num - 1;
         fatorialRecursivo(num, fat);
    }
}
