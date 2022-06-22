/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_treeset;

import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author tiago_bshvb2v
 */
public class Ex_TreeSEt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    TreeSet<Integer> tree = new TreeSet<Integer>();
	tree.add(12);
	tree.add(63);
	tree.add(34);
	tree.add(45);
	 
	Iterator<Integer> iterator = tree.iterator();
	System.out.print("Tree set data: ");
	while (iterator.hasNext()) {
	    System.out.print(iterator.next() + " ");
	}
    }
    
}
