package org.iesalandalus.programacion.alfilajedrez;

public class Posicion {

	// ATRIBUTOS
	
	private int fila;
	private char columna;
	
	
	// METODOS
	
		//SET y GET
	
	private void setFila(int fila) {
		//CHECK FILA
		if(fila>=1&&fila<=8) {
			this.fila=fila;
		}else {
			System.out.println("VALOR NO VALIDO PARA EL ATRIBUTO FILA");
		}
	}
	
	public int getFila() {
		return fila;
	}
	
	private void setColumna(char columna) {
		boolean validacionColumna=false;
		String caracteresValidos="abcdefgh";
		int i;
		for(i=0;i<=7;i++) { /* Bucle para evaluar si el valor esta entre "A" y "H" */
			if(caracteresValidos.charAt(i)==columna) { 
				i=8;
				validacionColumna=true;
			}	
		}
		if(validacionColumna==true) {
			this.columna=columna;
		}else {
			System.out.println("Valor no valido para la columna");
		}
		this.columna = columna;
	}
	
	public char getColumna() {
		return columna;
	}
	
	
}
