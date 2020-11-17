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
	
	// CONSTRUCTOR DE ALFIL CON EL COLOR
	
	public Alfil(Color color) {
		if(color.equals("NEGRO")) {
			color=Color.NEGRO;
			posicion=new Posicion(8,'f');
		} else {
			color=Color.BLANCO;
			posicion=new Posicion(1,'a');
		}
	}
	
	//CONSTRUCTOR DE ALFIL CON COLOR Y COLUMNA
	
	public Alfil(Color color,char columna) {
		if(columna=='c'||columna=='f') {
			if(color.equals("NEGRO")) {
				color=Color.NEGRO;
				posicion=new Posicion(8,columna);
			} else {
				color=Color.BLANCO;
				posicion=new Posicion(1,columna);
			}
		}else{
			System.out.println("VALOR NO VALIDO PARA EL VALOR DE COLUMNA");
		}
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
