package unidad3.ejemplos;

import java.util.Scanner;

public class Estacion {

	public static void main(String[] args) {
		
		int mes;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduzca un mes");
		mes = entrada.nextInt();
		
		switch(mes) {
		case 1:
		case 2:
		case 12:
			System.out.println("INVIERNO");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("PRIMAVERA");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("VERANO");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("OTOÑO");
			break;
		default:
			System.out.println("No es un valor válido");
	}

	}

}
