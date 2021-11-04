/*
 * 
 * Autore Giuseppe Liberati
 */

package Interfaccia;

import javax.swing.JFrame;



public class InterfacciaTest{
public static void main(String[] args) {
	
	JFrame jf = new JFrame("Arriva a 50 !!");
	jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	jf.setSize(300, 430);
	jf.setLocationRelativeTo(null);
	jf.add(new InterfacciaGui());
	//jf.pack();
	jf.setVisible(true);
}
}