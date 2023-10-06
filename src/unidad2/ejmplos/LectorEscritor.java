package unidad2.ejmplos;

import java.util.Scanner;

public class LectorEscritor {

	public static void main(String[] args) {
		
		int dato;
		int dato2;
		double dato3;
		String nombre;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introzca su nombre:");
		//nombre = entrada.nextLine();
		nombre = entrada.next();
		
		
		System.out.print("Dame un número entero:");
		
	
		dato = entrada.nextInt();	
		System.out.println(nombre+" ha introducido el número:"+dato);
		
		System.out.print("Dame otro,"+nombre+":");	
		dato2 = entrada.nextInt();
		System.out.println("Y ahora:"+dato2);
		
		int suma = dato+dato2;
		
		System.out.println("La suma es:"+suma);
		System.out.println("La suma es:"+dato+dato2);
		System.out.println("La suma es:"+(dato+dato2));
		
		System.out.print("Dame su saldo en el banco:");
		 dato3 = entrada.nextDouble();
		 
		 System.out.print("Su saldo es:"+dato3);
		 
		System.out.print("Muchas gracias por todo "+nombre);
		
		
		entrada.close();
	}

}






