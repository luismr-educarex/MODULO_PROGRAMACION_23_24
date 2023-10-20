package unidad3.ejemplos;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int opcion;
		int anyo;
		boolean bisiesto=false;
		
		do {
			
			System.out.println("----- MENU -----");
			System.out.println("1. Calcular si el año es bisiesto");
			System.out.println("2. Salir");
			
			opcion = entrada.nextInt();
			
			if(opcion==1) {
				System.out.println("Introduzca un año");
				anyo = entrada.nextInt();
				//Divisile por 4 y no por 100
				//Divisible por 400
				bisiesto = (((anyo%4==0) && (anyo%100!=0))||(anyo%400==0));
				
				if(bisiesto) {
					System.out.println("El año "+anyo+" es bisiesto");
				}else {
					System.out.println("El año "+anyo+" no es bisiesto");
				}
				
				
			}else if(opcion==2) {
				System.out.println("Gracias. Hasta la próxima");
			}else {
				System.out.println("La opción no es válida.Inténtelo de nuevo");
			}
		
			
		}while(opcion!=2);
	}

}






