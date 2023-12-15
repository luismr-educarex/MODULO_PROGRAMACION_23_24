package unidad6.ejemplos.aleatorios;

import java.util.Random;

public class GenerarAleatorio {

	public static void main(String[] args) {
		
		Random aleatorio = new Random(System.currentTimeMillis());
		int numero = aleatorio.nextInt(10000);
		
		System.out.println("Numero:"+numero);
	}

}
