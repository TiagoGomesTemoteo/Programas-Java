/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import javax.swing.JOptionPane;

/**
 *
 * @author teste
 */
public class Menus {
   public static String escolhaMenuCursosMaterias(){
       return JOptionPane.showInputDialog("Cursos e Matérias"
               + "1.Adicionar Curso"
               + "2.Remover Curso"
               + "3.Adicionar materia a um curso"
               + "4.Remover matéria de um curso"
               + "5.Exibir cursos e matérias"
               + "6.Sair");
             
   } 
   public static String escolhaMenuAlunoProfessor(){
       
       return JOptionPane.showInputDialog("Escolha uma opção:"
                + "\n1. Aluno"
                + "\n2. Professor");
   }
}
