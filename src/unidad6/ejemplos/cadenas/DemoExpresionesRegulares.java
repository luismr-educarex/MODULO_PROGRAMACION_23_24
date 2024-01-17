package unidad6.ejemplos.cadenas;

import java.util.Scanner;

public class DemoExpresionesRegulares {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Dame el dato");
		
		String dato = entrada.nextLine();
		
		// . = cualquier caracter
		// * = coincide con 0 o más repeticiones 
		// + = coincide con 1 o más repeticiones 
		// \\d
		// {n}
		// {n,m}
		// {n,}
		// Aakb
		String expresionRegular = "{2,20}([A-Z]+[a-z]+)";
		Boolean resultado =  dato.matches(expresionRegular);

		if(resultado) {
			System.out.println("Dato válido");
		}else {
			System.out.println("Dato NO válido");
		}
		
		entrada.close();
		

	}

}














