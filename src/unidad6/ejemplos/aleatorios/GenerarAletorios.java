package unidad6.ejemplos.aleatorios;

import java.util.Random;

public class GenerarAletorios {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		//Generar un numero entero aletorio
		int numAleatorio = random.nextInt();
		System.out.println(numAleatorio);
		//Generar numero enteros entre 0 y el 99
		int numAleatorio2 = random.nextInt(190);
		System.out.println(numAleatorio2);
		//Generar numero enteros entre 0 y el 99
		//double numAleatorio3 = random.nextDouble(100);
		//System.out.println(numAleatorio3);
	}

}
