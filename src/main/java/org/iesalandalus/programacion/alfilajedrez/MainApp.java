package org.iesalandalus.programacion.alfilajedrez;

import javax.naming.OperationNotSupportedException;

import org.iesalandalus.programacion.utilidades.Entrada;

public class MainApp {
	
	private Alfil alfil; 

	public static void main(String[] args)  {
		mostrarMenu();
		int opcion=elegirOpcion();
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
}
