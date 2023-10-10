package unidad2.ejemplos;

import java.util.Scanner;

public class Operadores {

	public static void main(String[] args) {
	
		int primerNumero;
		int segundoNumero;
		int tercerNumero;
		final double PI =3.1416; 
		int radio;
		double area;
		int suma;
		int resta;
		int producto;
		double media;
		int modulo;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduzca el primer número:");
		primerNumero = entrada.nextInt();
		System.out.println("Introduzca el segundo número:");
		segundoNumero = entrada.nextInt();
		System.out.println("Introduzca el tercer número:");
		tercerNumero = entrada.nextInt();
		
		//vamos a realizar la suma
		suma = primerNumero+segundoNumero+tercerNumero;
		resta = primerNumero-segundoNumero-tercerNumero;
		producto = primerNumero*segundoNumero*tercerNumero;
		
		media = suma/3;
		
		modulo = suma%2;
		
		System.out.println("La suma es:"+suma);
		System.out.println("La resta es:"+resta);
		System.out.println("El producto es:"+producto);
		System.out.println("La media es:"+media);
		System.out.println("El módulo 2 es:"+modulo);
		
		
		suma++; // equivale a suma = suma+1;
		resta--; // equivale a resta=resta-1;
		
		System.out.println("Incremantamos en uno la suma:"+suma);
		System.out.println("Decrementamos la resta en uno:"+resta);
		
		
		suma+=3; // equivale a suma=suma+3
		resta-=4; // equivale a resta=resta-4
		
		

		System.out.println("Incremantamos en 3 la suma:"+suma);
		System.out.println("Decrementamos la resta en 4:"+resta);
		
		System.out.printf("%n");
		System.out.println("Introduzca radio:");
		radio = entrada.nextInt();
		area = PI*radio*radio;
		System.out.println("El área es:"+area);	
		
		String nombre = "Pepe";
		System.out.println("Estos son los resultados,"+nombre);
		System.out.printf("Estos son los resultados,%s%n",nombre);
		
	System.out.printf("El numero 1 es %d, el numero 2 es %d%n",primerNumero,segundoNumero);
	System.out.println("El numero 1 es "+primerNumero+", el numero 2 es "+segundoNumero);	
	
		System.out.println("El área es:"+PI*radio*radio);
		System.out.printf("El área es:%f",PI*radio*radio);
		
		
		
		
		

	}

}
