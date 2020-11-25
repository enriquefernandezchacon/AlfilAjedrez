package org.iesalandalus.programacion.alfilajedrez;

import javax.naming.OperationNotSupportedException;

public class MainApp {
	
	private Alfil alfil; 

	public static void main(String[] args)  {
		mostrarMenu();
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
	
}
