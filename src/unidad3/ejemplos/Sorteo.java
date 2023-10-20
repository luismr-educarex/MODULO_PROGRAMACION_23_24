package unidad3.ejemplos;

import java.util.Scanner;

public class Sorteo {

	public static void main(String[] args) {
		
		int sorteo = 6;
		Scanner entrada = new Scanner(System.in);
		int eleccion;
		int contador=1;
		
		System.out.println("Dame un número entre el 1 y 10");
		eleccion = entrada.nextInt();
		
		while(sorteo!=eleccion) {
			System.out.println("Inténtelo de nuevo. Dame otro número");
			System.out.println("Usted ha hecho "+contador+" intentos");
			contador++;
			eleccion=entrada.nextInt();
		}
		System.out.println("Has acertado");
		
		

	}

}
