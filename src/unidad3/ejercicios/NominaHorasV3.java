package unidad3.ejercicios;

import java.util.Scanner;

public class NominaHorasV3 {

	public static void main(String[] args) {
		
		final double VALOR_HORA_A = 12.5;
		final double VALOR_HORA_B = 25;
		final double VALOR_HORA_C = 37.5;
		final int LIMITE_A = 40;
		final int LIMITE_B = 48;
		
		int numHoras=0;
		double sueldo=0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce el número de horas:");
		numHoras = entrada.nextInt();
		
		if(numHoras<=LIMITE_A) {
			sueldo = numHoras*VALOR_HORA_A;
		}else if(numHoras<=LIMITE_B) {
			sueldo = LIMITE_A*VALOR_HORA_A + (numHoras-LIMITE_A)*VALOR_HORA_B;
		}else {
			sueldo = LIMITE_A*VALOR_HORA_A + (LIMITE_B-LIMITE_A)*VALOR_HORA_B + (numHoras-LIMITE_B)*VALOR_HORA_C;
		}
		
		System.out.println("Su sueldo es:"+sueldo+" €");
	}

}








