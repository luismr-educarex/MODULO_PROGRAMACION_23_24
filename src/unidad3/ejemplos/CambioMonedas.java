package unidad3.ejemplos;

import java.util.Scanner;

/*Realiza un programa que dada una cantidad de euros que 
 * el usuario introduce por teclado (múltiplo de 5 €) mostrará 
 * los billetes de cada tipo que serán necesarios para alcanzar dicha cantidad 
 * (utilizando billetes de 500, 200, 100, 50, 20, 10 y 5). 
 * Hay que indicar el mínimo de billetes posible. 
 * Por ejemplo, si el usuario introduce 145 el programa indicará que 
 * será necesario 1 billete de 100 €, 2 billetes de 20 € y 1 billete de 5 € 
 * (no será válido por ejemplo 29 billetes de 5, 
 * que aunque sume 145 € no es el mínimo número de billetes posible).*/

public class CambioMonedas {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		int cantidad;
		int numBilletes500;
		int numBilletes200;
		int numBilletes100;
		int numBilletes50;
		int numBilletes20;
		int numBilletes10;
		int numBilletes5;
		
		System.out.println("Introduzca la cantidad (múltiplo de 5):");
		
		cantidad = entrada.nextInt();
		
		
		if(cantidad>=500) {
			numBilletes500 = cantidad/500;
			cantidad = cantidad%500;
			//cantidad = cantidad-numBilletes500*500;
			System.out.println("Número de billetes 500:"+numBilletes500);
		}
		if(cantidad>=200) {
			numBilletes200 = cantidad/200;
			cantidad = cantidad%200;
			System.out.println("Número de billetes 200:"+numBilletes200);
		}
		if(cantidad>=100) {
			numBilletes100 = cantidad/100;
			cantidad = cantidad%100;
			System.out.println("Número de billetes 100:"+numBilletes100);
		}
		if(cantidad>=50) {
			numBilletes50 = cantidad/50;
			cantidad = cantidad%50;
			System.out.println("Número de billetes 50:"+numBilletes50);
		}
		if(cantidad>=20) {
			numBilletes20 = cantidad/20;
			cantidad = cantidad%20;
			System.out.println("Número de billetes 20:"+numBilletes20);
		}
		if(cantidad>=10) {
			numBilletes10 = cantidad/10;
			cantidad = cantidad%10;
			System.out.println("Número de billetes 10:"+numBilletes10);
		}
		if(cantidad>=5) {
			numBilletes5 = cantidad/5;
			cantidad = cantidad%5;
			System.out.println("Número de billetes 5:"+numBilletes5);
		}
		

		
	}

}







