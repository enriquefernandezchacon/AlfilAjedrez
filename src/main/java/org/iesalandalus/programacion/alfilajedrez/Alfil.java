package org.iesalandalus.programacion.alfilajedrez;

import javax.naming.OperationNotSupportedException;

public class Alfil {

	// ATRIBUTOS
	
	private Color color;
	private Posicion posicion;
	
	// METODOS
	
	// CONSTRUCTOR POR DEFECTO
	
	public Alfil(){
		posicion=new Posicion(8,'f');
		setColor(Color.NEGRO);
	}
	
	// CONSTRUCTOR DE ALFIL CON EL COLOR
	
	public Alfil(Color color) {
		setColor(color);
		if(color==Color.NEGRO) {
			posicion=new Posicion(8,'f');
		}else {
			posicion=new Posicion(1,'f');
		}
	}
	
	//CONSTRUCTOR DE ALFIL CON COLOR Y COLUMNA
	
	public Alfil(Color color,char columna) {
		setColor(color);
		int fila=1;
		if(color==Color.NEGRO) {
			fila=8;
		}
		posicion=new Posicion(fila, columna);
	}
	
	// SET Y GET
	
	private void setPosicion(Posicion posicion) {
		if (posicion==null) {
			throw new NullPointerException("Null no valido.");
		}
		
		this.posicion=new Posicion(posicion);
	}
	
	public Posicion getPosicion() {
		return posicion;
	}
	
	private void setColor(Color color) {
		if(color==null) {
			throw new NullPointerException("ERROR: No se puede asignar un color nulo.");
		}else {
			if(color==Color.NEGRO) {
				this.color=color;
			}else {
				this.color=color;
			}
		}
	}
	
	public Color getColor() {
		return color;
	}

	public void mover (Direccion direccion, int pasos) throws OperationNotSupportedException {
		if (direccion==null) {
			throw new NullPointerException("ERROR: La dirección no puede ser nula.");
		}
	
		if(pasos<1) {
			throw new IllegalArgumentException("ERROR: El número de pasos debe ser positivo.");
		}
		
		
		int filaNueva=posicion.getFila(); //Pasamos de char a un valro númerico
		char columnaNueva=posicion.getColumna();
		String caracteres="abcdefgh";
		int valorColumnaNueva=9;
		for(int i=0;i<=7;i++) {
			if(columnaNueva==caracteres.charAt(i)) {
				valorColumnaNueva=i;
			}
		}
		
		switch(direccion) {
			case ARRIBA_DERECHA:
				filaNueva=filaNueva+pasos;
				valorColumnaNueva=valorColumnaNueva+pasos;
				break;
			case ARRIBA_IZQUIERDA:
				filaNueva=filaNueva+pasos;	
				valorColumnaNueva=valorColumnaNueva-pasos;
				break;
			case ABAJO_DERECHA:
				filaNueva=filaNueva-pasos;
				valorColumnaNueva=valorColumnaNueva+pasos;
				break;
			case ABAJO_IZQUIERDA:
				filaNueva=filaNueva-pasos;
				valorColumnaNueva=valorColumnaNueva-pasos;
				break;
		}
		
		if(valorColumnaNueva>=0&&valorColumnaNueva<=7) {
			columnaNueva=caracteres.charAt(valorColumnaNueva);
		}else {
			columnaNueva='w';
		}
		
		try {
			posicion.setColumna(columnaNueva);
			posicion.setFila(filaNueva);
		} catch (IllegalArgumentException posicion) {
			throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
		}
	}

		
}
	
	
	
	
	
	
	