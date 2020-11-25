package org.iesalandalus.programacion.alfilajedrez;

import javax.naming.OperationNotSupportedException;

import org.iesalandalus.programacion.utilidades.Entrada;

public class MainApp {
	
	private static Alfil alfil; 

	public static void main(String[] args)  {
		mostrarMenu();
		int opcion=elegirOpcion();
		ejecutarOpcion(opcion);
		
		System.out.println(alfil);
	}

	private static void mostrarMenu() {
		System.out.println("MENU DE OPCIONES");
		System.out.println("----------------\n");
		System.out.println("1. CREAR ALFIL POR DEFECTO");
		System.out.println("2. CREAR ALFIL INTRODUCIENDO SU COLOR");
		System.out.println("3. CREAR ALFIL INTRODUCIENDO SU COLOR Y COLUMNA INICIAL");
		System.out.println("4. MOVER PEON CREADO");
		System.out.println("5. SALIR");
	}
	
	private static int elegirOpcion() {
		int i=0;
		do {
			System.out.print("INTRODUZCA LA OPCION DESEADA: ");
			i=Entrada.entero();
		}while(i<1||i>5);
		return i;
	}
	
	private static void ejecutarOpcion(int opcion) {
		switch(opcion) {
			case 1:
				crearAlfilDefecto();
				break;
			case 2:
				crearAlfilColor();					
				break;
			case 3:
				
				
				break;
			case 4:
				
				
				break;
			case 5:
				
				
				break;
		}
	}
	
	private static void crearAlfilDefecto() {
		alfil= new Alfil();
	}
	
	private static void crearAlfilColor() {
		Color color;
		color=elegirColor();
		alfil=new Alfil(color);
	}
	
	private static Color elegirColor() {
		System.out.println("ELIJA EL COLOR DEL PEON");
		System.out.println("-----------------------\n");
		System.out.println("1. NEGRO");
		System.out.println("2. BLANCO");
		int opcion=0;
		do {
			System.out.println("INTRODUZCA COLOR");
			opcion=Entrada.entero();
		}while(opcion!=1&&opcion!=2);
		if(opcion==1) {
			return Color.NEGRO;
		}else {
			return Color.BLANCO;
		}
	}
}
