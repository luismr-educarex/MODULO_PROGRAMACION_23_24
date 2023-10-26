package unidad3.ejercicios;

import java.util.Scanner;

public class NominaHorasV2 {

	public static void main(String[] args) {
		
		final double VALOR_HORA_A = 12.5;
		final double VALOR_HORA_B = 25;
		final double VALOR_HORA_C = 37.5;
		final int LIMITE_A = 40;
		final int LIMITE_B = 48;
		
		
		int numHoras=0;
		int numHorasA=0;
		int numHorasB=0;
		int numHorasC=0;
		double sueldo=0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce el número de horas:");
		numHoras = entrada.nextInt();
		
		numHorasC=numHoras-LIMITE_B;
		if(numHorasC<=0) {
			numHorasC=0;
		}
		numHorasB=numHoras-numHorasC-LIMITE_A;
		if(numHorasB<=0) {
			numHorasB=0;
		}
		numHorasA=numHoras-numHorasC-numHorasB;
		
		sueldo = numHorasA*VALOR_HORA_A+numHorasB*VALOR_HORA_B+numHorasC*VALOR_HORA_C;
		System.out.println("Su sueldo es:"+sueldo+" €");
		System.out.println("Horas tipo A:"+numHorasA);
		System.out.println("Horas tipo B:"+numHorasB);
		System.out.println("Horas tipo C:"+numHorasC);
	}

}








