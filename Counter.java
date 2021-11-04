/*
 * 
 * Autore Giuseppe Liberati.
 */

package Interfaccia;

public class Counter {
	
	private int numero;
	private int numClick;
	
	public Counter() {
		
		numero = 0;
		numClick = 0;
	}
	
	public int random() {
		
		numero = (int)(Math.random() * 100);
		
		return numero;
	}
	
	public int add() {
		
		 numero++;
		 numClick++;
		 return numero;
	}
	
	public int addDieci() {
		
		numero = (numero + 10);
		 numClick++;
		 return numero;
	}
	
	public int sottr() {
		
		numero--;
		numClick++;
		return numero;
	}
	
	public int sottrDieci() {
		
		numero = (numero - 10);
		numClick++;
		return numero;
	}
	
	public int reset() {
		
		 numero = 0;
		 return numero;
	}
	
	public int click() {
		
		return numClick;
	}

}
