package unidad3.ejercicios;

import java.util.Scanner;

public class NominaHoras {

	public static void main(String[] args) {
		
		
		int numHoras=0;
		double sueldo=0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce el número de horas:");
		numHoras = entrada.nextInt();
		
		if(numHoras<=40) {
			sueldo = numHoras*12.5;
		}else if(numHoras<=48) {
			sueldo = 40*12.5 + (numHoras-40)*25;
		}else {
			sueldo = 40*12.5 + 8*25 + (numHoras-48)*37.5;
		}
		
		System.out.println("Su sueldo es:"+sueldo+" €");
	}

}








