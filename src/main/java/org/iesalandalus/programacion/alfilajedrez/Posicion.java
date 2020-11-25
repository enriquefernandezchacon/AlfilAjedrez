package org.iesalandalus.programacion.alfilajedrez;

public class Posicion {

	// ATRIBUTOS
	
	private int fila;
	private char columna;
	
	
	// METODOS
	
	// CONSTRUCTOR POR PARAMENTROS FILA Y COLUMNA
	
	
	public Posicion (int fila, char columna) {	
			setFila(fila);
			setColumna(columna);
	}
	
	//CONSTRUCTOR COPIA
	
	public Posicion (Posicion copia) {
		if (copia==null)
			throw new NullPointerException("ERROR: No es posible copiar una posición nula.");
		setFila(copia.getFila());
		setColumna(copia.getColumna());
	}
	
	//SET y GET
	
	private void setFila(int fila) {
		//CHECK FILA
		if(fila>=1&&fila<=8) {
			this.fila=fila;
		}else {
			throw new IllegalArgumentException("ERROR: Fila no válida.");
		}
	}
	
	public int getFila() {
		return fila;
	}
	
	private void setColumna(char columna) {
		String caracteresValidos = "abcdefgh"; /*COMPROBACION DE COLUMNA*/
		boolean validacionColumna=false;
		for(int i=0;i<caracteresValidos.length();i++){
			if(caracteresValidos.charAt(i)==columna) {
				validacionColumna=true;
			}
		}
		if(validacionColumna==true) {
			this.columna=columna;
		}else {
			throw new IllegalArgumentException("ERROR: Columna no válida.");
		}
	}
	
	public char getColumna() {
		return columna;
	}

	// METODOS EQUALS Y HASHCODE
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + columna;
		result = prime * result + fila;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Posicion other = (Posicion) obj;
		if (columna != other.columna)
			return false;
		if (fila != other.fila)
			return false;
		return true;
	}

	// METODO TOSTRING
	
	@Override
	public String toString() {
		return "fila=" + this.fila + ", columna=" + this.columna;
	}
}
