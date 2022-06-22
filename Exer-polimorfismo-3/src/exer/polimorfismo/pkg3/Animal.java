/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer.polimorfismo.pkg3;

/**
 *
 * @author 53919153X
 */
public class Animal {
String nome;
String raca;

    Animal(){
    this("","");
    }
    public Animal(String nome, String raca){
    this.nome =nome;
    this.raca=raca;
    }
         
 void movimentar(){
     System.out.println("");
 }
 void comunicar(){
     System.out.println("");
 }
}
