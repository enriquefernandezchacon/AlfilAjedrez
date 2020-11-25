package org.iesalandalus.programacion.alfilajedrez;

import javax.naming.OperationNotSupportedException;

public class Alfil {

	// ATRIBUTOS
	
	private Color color;
	private Posicion posicion;
	private Posicion alfilCambio;
	
	// METODOS
	
	// CONSTRUCTOR POR DEFECTO
	
	public Alfil() throws NullPointerException,IllegalArgumentException {
		posicion=new Posicion(8,'f');
		setColor(Color.NEGRO);
	}
	
	// CONSTRUCTOR DE ALFIL CON EL COLOR
	
	public Alfil(Color color) throws NullPointerException,IllegalArgumentException {
		setColor(color);
		if(color==Color.NEGRO) {
			posicion=new Posicion(8,'f');
		}else {
			posicion=new Posicion(1,'f');
		}
	}
	
	//CONSTRUCTOR DE ALFIL CON COLOR Y COLUMNA
	
	public Alfil(Color color,char columna)throws NullPointerException,IllegalArgumentException {
		setColor(color);
		int fila=1;
		if(color==Color.NEGRO) {
			fila=8;
		}
		posicion=new Posicion(fila, columna);
	}
	
	// SET Y GET
	
	private void setPosicion(Posicion alfilCambio) throws NullPointerException,IllegalArgumentException {
		if (alfilCambio==null) {
			throw new NullPointerException("Null no valido.");
		}
		
		posicion=new Posicion(alfilCambio);
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
			throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
		}
		alfilCambio=new Posicion(filaNueva, columnaNueva);
		setPosicion(alfilCambio);
		}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((posicion == null) ? 0 : posicion.hashCode());
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
		Alfil other = (Alfil) obj;
		if (color != other.color)
			return false;
		if (posicion == null) {
			if (other.posicion != null)
				return false;
		} else if (!posicion.equals(other.posicion))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return posicion + ", color="+color;
	}

		
}
	
	
	
	
	
	
	