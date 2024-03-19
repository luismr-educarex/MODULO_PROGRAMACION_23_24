package unidad6.ejemplos.aleatorios;

import java.security.SecureRandom;

public class GenerarAleatoriosSeguro {

	public static void main(String[] args) {
		
		SecureRandom random = new SecureRandom();
		
		int numAleatorio = random.nextInt(100);
		System.out.println(numAleatorio);
		
	/*	double numAleatorio2 = random.nextDouble(100);
		System.out.println(numAleatorio2);
		*/
	}

}
