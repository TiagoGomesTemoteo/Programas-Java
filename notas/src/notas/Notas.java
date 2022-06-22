/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notas;

import java.util.Scanner;
/**
 *
 * @author Vitor Augusto
 */
public class Notas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Vamos usar o Scanner
        Scanner entrada =  new Scanner(System.in);
        
        // Vamos declarar as variaveis
        int nm;
        
        double soma = 0,media;
        
        // Vamos pedir a quantidade de vetores
        System.out.printf("Digite a quantidade de nomes e notas: ");
        nm = entrada.nextInt();
        
        String [] nomes = new String [nm];
       
        double [] notas = new double [nm];
   
        // Vamos ler os nomes e as notas
        for(int i = 0; i < nm; i++){
            System.out.printf("\nDigite o nome do aluno nº "+(i+1)+": ");
            nomes[i] = new Scanner(System.in).nextLine();
            System.out.printf("Digite a nota do aluno nº "+(i+1)+": ");
            notas[i] = new Scanner(System.in).nextDouble();
            System.out.println("");
            soma = soma + notas[i];
        }
        media = soma / nm;
        System.out.println("A média dos alunos é: " + media);
        System.out.println();
        System.out.println("Lista dos alunos com a nota maior que a média da sala");
        for (int i=0;i < nm;i++) {
            if (notas[i] > media)
                System.out.println(nomes[i]);
        }
        
    }
    
}
