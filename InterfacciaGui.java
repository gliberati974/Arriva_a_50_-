/*
 * 
 * 
 * Autore Giuseppe Liberati
 */

package Interfaccia;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;



public class InterfacciaGui extends JPanel implements ActionListener{
	
	Counter c = new Counter();
	private JButton b1;
	private JButton b2;
	private JButton b3;
	private JTextField txf4;
	private JButton b5;
	private JButton b6;
	private int casuale = 0;
	private String str_casuale = "";
	
	
	public InterfacciaGui() {
		
		//POSIZIONO IL GRIDLAYOUT SOPRA IL CONTENITORE JPANEL
		super(new GridLayout(1,1));
		
		//Definisco la funzione
		add(buttons());
		
		this.setBorder(BorderFactory.createEmptyBorder(0,2,2,2));
	}
	
		@Override
		public void actionPerformed(ActionEvent e)  {
			Integer newNum = 0;
			if (e.getActionCommand().equals("BTN_SUB")) {
				newNum = c.sottr();
				txf4.setText( " [ " + newNum.toString() + " ] ");
				
				if (newNum.toString().equals("50") ) {
					txf4.setText( " [ " + newNum.toString() + " ] " + " num click a 50: " + c.click());
				}
			}if (e.getActionCommand().equals("BTN_SUB_10")) {
				newNum = c.sottrDieci();
				txf4.setText( " [ " + newNum.toString() + " ] ");
				
				if (newNum.toString().equals("50") ) {
					txf4.setText( " [ " + newNum.toString() + " ] " + " num click a 50: " + c.click());
				}
			
			}if (e.getActionCommand().equals("BTN_ADD")) {
				newNum = c.add();
				txf4.setText( " [ " + newNum.toString() + " ] ");
				
				if (newNum.toString().equals("50") ) {
					txf4.setText( " [ " + newNum.toString() + " ] " + " num click a 50: " + c.click());
				}
			
			}if (e.getActionCommand().equals("BTN_ADD_10")) {
				newNum = c.addDieci();
				txf4.setText( " [ " + newNum.toString() + " ] ");
				
				if (newNum.toString().equals("50") ) {
					txf4.setText( " [ " + newNum.toString() + " ] " + " num click a 50: " + c.click());
				}
			
			}else if (e.getActionCommand().equals("RESET")) {
				newNum = c.random();
				txf4.setText( " [ " + newNum.toString() + " ] ");
			}
			
		}
	
	
	
	public JPanel buttons() {
		JPanel panel = new JPanel(new GridLayout(6,1));
		
		b1 = new JButton("10,00");
		b1.setHorizontalAlignment(SwingConstants.CENTER);
		Font lblFontb1 = new Font(b1.getFont().getFamily(), Font.BOLD, 18);
		b1.setActionCommand("BTN_ADD_10");
		b1.addActionListener(this);
		b1.setFont(lblFontb1);
		
		b2 = new JButton("-10,00");
		b2.setHorizontalAlignment(SwingConstants.CENTER);
		Font lblFontb2 = new Font(b2.getFont().getFamily(), Font.BOLD, 18);
		b2.setActionCommand("BTN_SUB_10");
		b2.addActionListener(this);
		b2.setFont(lblFontb2);
		
		b3 = new JButton("1,00");
		b3.setHorizontalAlignment(SwingConstants.CENTER);
		Font lblFontb3 = new Font(b3.getFont().getFamily(), Font.BOLD, 18);
		b3.setActionCommand("BTN_ADD");
		b3.addActionListener(this);
		b3.setFont(lblFontb3);
		
		txf4 = new JTextField("[0]");
		txf4.setHorizontalAlignment(SwingConstants.CENTER);
		Font lblFont = new Font(txf4.getFont().getFamily(), Font.BOLD, 18);
		txf4.setFont(lblFont);
		Integer newNum = c.random();
		txf4.setText("[ " + newNum.toString() + " ]");
		
		b5 = new JButton("-1,00");
		b5.setHorizontalAlignment(SwingConstants.CENTER);
		Font lblFontb5 = new Font(b5.getFont().getFamily(), Font.BOLD, 18);
		b5.setActionCommand("BTN_SUB");
		b5.addActionListener(this);
		b5.setFont(lblFontb5);
		
		b6 = new JButton("RESET");
		b6.setHorizontalAlignment(SwingConstants.CENTER);
		Font lblFontb6 = new Font(b6.getFont().getFamily(), Font.BOLD, 18);
		b6.setFont(lblFontb6);
		b6.setActionCommand("RESET");
		b6.addActionListener(this);
		
		panel.add(b1);
		panel.add(b3);
		panel.add(txf4);
		panel.add(b5);
		panel.add(b2);
		panel.add(b6);
		
		return panel;
		
	}
	

}
