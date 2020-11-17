package org.iesalandalus.programacion.alfilajedrez;

public class Alfil {

	// ATRIBUTOS
	
	private Color color;
	private Posicion posicion;
	
	// METODOS
	
	// CONSTRUCTOR POR DEFECTO
	
	public Alfil(){
		color=Color.NEGRO;
		posicion=new Posicion(8,'f');
	}
	
	// SET Y GET
	
	private void setPosicion(Posicion posicion) {
		this.posicion = posicion;
	}
	
	public Posicion getPosicion() {
		return posicion;
	}
	
	private void setColor(Color color) {
		if(color.equals("NEGRO")||color.equals("BLANCO")) {
		this.color = color;
		}else {
			System.out.println("VALOR NO VALIDO PARA COLOR");
		}
	}
	
	public Color getColor() {
		return color;
	}
	
	
	
	
	
}
