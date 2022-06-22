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
public class ProgressaoAritmetica {
   
    static void progressaoWhile(int razao, int termo, int tamanho){
        System.out.println(" " + termo);
        while(tamanho > 0){
            termo = termo + razao;
            System.out.println(" " + termo);
            tamanho = tamanho - 1;     
        }
    }
    
    static void progressaoDoWhile(int razao, int termo, int tamanho){        
        System.out.println(" " + termo);  
        do{
            termo = termo + razao;
            System.out.println(" " + termo);  
            tamanho = tamanho - 1;
        }while(tamanho > 0);
    }
    
    static void progressaoFor(int razao, int termo, int tamanho){   
        System.out.println(" " + termo);
        for(;tamanho > 0; tamanho--){
            
            termo = termo + razao;
            System.out.println(" " + termo);
                
        }
    }
    
    static void progressaoRecursivo(int razao, int termo, int tamanho){
        if(tamanho == 9){
            System.out.println(" " + termo);
        }
        if(tamanho == 0 ){
            return;
        }
        termo = termo + razao;
        tamanho--;
        System.out.println(" " + termo);
        progressaoRecursivo(razao, termo, tamanho);
    }
}
