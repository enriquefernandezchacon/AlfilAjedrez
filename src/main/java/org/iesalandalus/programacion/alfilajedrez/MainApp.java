package org.iesalandalus.programacion.alfilajedrez;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

import javax.naming.OperationNotSupportedException;

public class MainApp {

	public static void main(String[] args) throws OperationNotSupportedException {
		// TODO Auto-generated method stub
		Alfil alfilBlanco;
		
		alfilBlanco=new Alfil(Color.BLANCO);
		try {
			System.out.println(alfilBlanco);
			alfilBlanco.mover(Direccion.ARRIBA_DERECHA, 2);
			System.out.println(alfilBlanco);
			alfilBlanco.mover(Direccion.ARRIBA_IZQUIERDA, 5);
			System.out.println(alfilBlanco);			
			alfilBlanco.mover(Direccion.ABAJO_IZQUIERDA, 2);
			System.out.println(alfilBlanco);			;
			alfilBlanco.mover(Direccion.ABAJO_DERECHA, 5);
			System.out.println(alfilBlanco);			
		} catch (OperationNotSupportedException ex) {
			System.out.println(ex.getMessage());
		}
	
	}

}
