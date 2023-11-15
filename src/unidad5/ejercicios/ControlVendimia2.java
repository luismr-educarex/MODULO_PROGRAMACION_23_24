package unidad5.ejercicios;

import java.util.Scanner;

public class ControlVendimia2 {

	static final int TAM = 10;
	static final int NUM_ZONAS = 6;
	static double zona1[] = new double[TAM];
	static double zona2[] = new double[TAM];
	static double zona3[] = new double[TAM];
	static double zona4[] = new double[TAM];
	static double zona5[] = new double[TAM];
	static double zona6[] = new double[TAM];
	static Scanner entrada  = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		
		int opcion = 0;
		do {

			mostrarMenu();
			opcion = entrada.nextInt();
			operar(opcion);

		} while (opcion != 5);
		
	}
	
	private static void operar(int opcion) {

		switch (opcion) {
		case 1:
			registrarPeso(pedirZona(),  pedirPeso());
			break;
		case 2:
			System.out.println("Peso total:"+obtenerPesoTotal()+" kg"); 
			break;
		case 3:
			
			break;
		case 4:
			
			break;
		case 5:
			salir();
			break;
		default:
			System.out.println("Opción no válida");
			break;
		}

	}
	
	private static void salir() {
		System.out.println("Saliendo...");
		
	}

	private static double obtenerPesoTotal() {
		
		double total1= obtenerPesoTotalPorZona(zona1);
		double total2= obtenerPesoTotalPorZona(zona2);
		double total3= obtenerPesoTotalPorZona(zona3);
		double total4= obtenerPesoTotalPorZona(zona4);
		double total5= obtenerPesoTotalPorZona(zona5);
		double total6= obtenerPesoTotalPorZona(zona6);
		
		return total1+total2+total3+total4+total5+total6;
	}
	
	private static double obtenerPesoTotalPorZona(double[] zonas) {
		
		double total=0;
		for(int i=0;i<zonas.length;i++) {
			total = total + zonas[i];
		}
		return total;
	}

	private static double pedirPeso() {
		double peso;
		System.out.println("Introduzca el peso:");
		peso = entrada.nextDouble();
		return peso;
	}
	
	private static int pedirZona() {
		int zona=0;
		boolean zonaCorrecta = false;
		do {
			System.out.println("Introduzca la zona(1-"+NUM_ZONAS+"):");
			zona = entrada.nextInt();
			if(zona<1 || zona>NUM_ZONAS) {
				System.out.println("Zona no existente");
			}else {
				zonaCorrecta= true;
			}
			
		}while(!zonaCorrecta);
		
		return zona;
	}

	private static void registrarPeso(int zona, double peso) {
		
		switch (zona) {
		case 1: 
			registraPesoEnZona(zona1,peso);
		break;
		case 2: 
			registraPesoEnZona(zona2,peso);
		break;
		case 3: 
			registraPesoEnZona(zona3,peso);
		break;
		case 4: 
			registraPesoEnZona(zona4,peso);
		break;
		case 5: 
			registraPesoEnZona(zona5,peso);
		break;
		case 6: 
			registraPesoEnZona(zona6,peso);
		break;
		default:
		
		}
	}
	
	private static void registraPesoEnZona(double[] zonas, double peso) {
		
		for(int i=0;i<zonas.length;i++) {
			if(zonas[i]==0) {
				zonas[i]=peso;
			}
		}
		
	}

	private static void mostrarMenu() {
		System.out.println("----- CONTROL VENDIMIA ---.");
		System.out.println("1. Añadir cantidad a zona");
		System.out.println("2. Obtener peso total");
		System.out.println("3. Cantidad por zona");
		System.out.println("4. Media de peso");
		System.out.println("5. Salir");
	}

}
