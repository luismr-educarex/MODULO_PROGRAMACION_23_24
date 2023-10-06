package unidad2.ejmplos;

import java.util.Scanner;

public class LectorEscritor {

	public static void main(String[] args) {
		
		int dato;
		int dato2;
		System.out.print("Dame un número entero:");
		Scanner entrada = new Scanner(System.in);
	
		dato = entrada.nextInt();	
		System.out.println("Usted ha introducido el número:"+dato);
		
		System.out.print("Dame otro:");	
		dato2 = entrada.nextInt();
		System.out.println("Y ahora:"+dato2);
		
		int suma = dato+dato2;
		
		System.out.println("La suma es:"+suma);
		System.out.println("La suma es:"+dato+dato2);
		System.out.println("La suma es:"+(dato+dato2));
		
		
		entrada.close();
	}

}






