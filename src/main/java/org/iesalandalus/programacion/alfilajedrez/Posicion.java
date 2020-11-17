package org.iesalandalus.programacion.alfilajedrez;

public class Posicion {

	// ATRIBUTOS
	
	private int fila;
	private char columna;
	
	
	// METODOS
	
	// CONSTRUCTOR POR PARAMENTROS FILA Y COLUMNA
	
	public Posicion (int fila, char columna) {
		boolean validacionFila=false;
		boolean validacionColumna=false;
		
		if(fila>=1&&fila<=8) { 					/* COMPROBACION DE FILA */
			validacionFila=true;
		}
		
		String caracteresValidos = "abcdefgh"; /*COMPROBACION DE COLUMNA*/
		int i=0;
		while(i<=7) {
			if(caracteresValidos.charAt(i)==columna) {
				validacionColumna=true;
				i=8;
			}else {
				i++;
			}
		}
		
		if(validacionFila==true&&validacionColumna==true) {
			this.fila=fila;
			this.columna=columna;
		}else {
			if(validacionFila==false) {
				System.out.println("VALOR NO VALIDO PARA EL ATRIBUTO FILA");
			}
			if(validacionColumna==false) {
				System.out.println("VALOR NO VALIDO PARA EL ATRIBUTO COLUMNA");
			}
		}
		
	}
	
	//CONSTRUCTOR COPIA
	
	public Posicion (Posicion copia) {
		this.fila=copia.getFila();
		this.columna=copia.getColumna();
	}
	
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
