package org.iesalandalus.programacion.alfilajedrez;

import javax.naming.OperationNotSupportedException;

import org.iesalandalus.programacion.utilidades.Entrada;
import org.junit.jupiter.params.shadow.com.univocity.parsers.conversions.LowerCaseConversion;

public class MainApp {
	
	private static Alfil alfil; 

	public static void main(String[] args)  {
		int i=1;
		do {
			mostrarMenu();
			int opcion=elegirOpcion();
			ejecutarOpcion(opcion);
			mostrarAlfil();
			System.out.println("\n");
		}while(i != 0);
	}

	private static void mostrarMenu() {
		System.out.println("----------------");
		System.out.println("MENU DE OPCIONES");
		System.out.println("----------------\n");
		System.out.println("1. CREAR ALFIL POR DEFECTO");
		System.out.println("2. CREAR ALFIL INTRODUCIENDO SU COLOR");
		System.out.println("3. CREAR ALFIL INTRODUCIENDO SU COLOR Y COLUMNA INICIAL");
		System.out.println("4. MOVER PEON CREADO");
		System.out.println("5. SALIR\n");
	}
	
	private static int elegirOpcion() {
		int i=0;
		do {
			System.out.print("INTRODUZCA LA OPCION DESEADA: ");
			i=Entrada.entero();
			System.out.print("\n");
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
				crearAlfilColorColumna();				
				break;
			case 4:
				mover();				
				break;
			case 5:
				System.out.println("\n¡HASTA PRONTO!");
				System.exit(0);			
				break;
		}
	}
	
	private static void crearAlfilDefecto() {
		try{
			alfil=new Alfil();
		}catch(NullPointerException | IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
	
	private static void crearAlfilColor() {
		Color color;
		color=elegirColor();
		
		try{
			alfil=new Alfil(color);
			System.out.println();
		}catch(NullPointerException | IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
			
	}
	
	private static Color elegirColor() {
		System.out.println("-----------------------");
		System.out.println("ELIJA EL COLOR DEL PEON");
		System.out.println("-----------------------\n");
		System.out.println("1. NEGRO");
		System.out.println("2. BLANCO");
		int opcion=0;
		do {
			System.out.print("\nINTRODUZCA COLOR: ");
			opcion=Entrada.entero();
		}while(opcion!=1&&opcion!=2);
		if(opcion==1) {
			return Color.NEGRO;
		}else {
			return Color.BLANCO;
		}
	}
	
	private static void crearAlfilColorColumna() {
		Color color;
		char columna;
		
		color=elegirColor();
		columna=elegirColumnaInicial();
		System.out.println();
		try{
			alfil=new Alfil(color, columna);
		}catch(NullPointerException | IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
	
	private static char elegirColumnaInicial(){
		System.out.println("\n------------------------");
		System.out.println("ELIJA LA COLUMNA INICIAL");
		System.out.println("------------------------\n");
		System.out.println("C. COLUMNA 'C'");
		System.out.println("F. COLUMNA 'F'");
		char columna;
		do {
			System.out.print("\nINTRODUZCA LA COLUMNA: ");
			columna=Character.toLowerCase(Entrada.caracter());
		}while(columna!='c'&&columna!='f');
		return columna;
	}
	
	private static void mover(){
		Direccion direccion;
		
		mostrarMenuDirecciones();
		direccion=elegirDireccion();
		int pasos;
		do {
			System.out.print("\nINTRODUZCA CANTIDAD DE PASOS: ");
			pasos=Entrada.entero();
			System.out.println();
		}while(pasos<1);
		try {
			alfil.mover(direccion, pasos);
		}catch(NullPointerException | IllegalArgumentException | OperationNotSupportedException e)
		{
			System.out.println(e.getMessage());
			System.out.println();
		}
	}
	
	private static void mostrarMenuDirecciones () {
		System.out.println("----------------");
		System.out.println("OPCIONES DE DIRECCIÓN");
		System.out.println("----------------\n");
		System.out.println("1. ARRIBA DERECHA");
		System.out.println("2. ABAJO DERECHA");
		System.out.println("3. ARRIBA IZQUIERDA");
		System.out.println("4. ABAJO IZQUIERDA");
	}
	
	private static Direccion elegirDireccion() {
		int i=0;
		
		do {
			System.out.print("\nIntroduzca la dirección: ");
			i=Entrada.entero();
		}while(i<1||i>4);
		switch(i){
			case 1:
				return Direccion.ARRIBA_DERECHA;
			case 2:
				return Direccion.ABAJO_DERECHA;				
			case 3:
				return Direccion.ARRIBA_IZQUIERDA;		
			case 4:
				return Direccion.ABAJO_IZQUIERDA;		
			default:
				return Direccion.ABAJO_DERECHA;
		}
		
	}
	
	private static void mostrarAlfil () {
		System.out.print(alfil);
	}
	
}
