package unidad5.ejercicios;

import java.util.Scanner;

public class ControlVendimia {

	static final int NUM_ZONAS=6;
	static Scanner entrada = new Scanner(System.in);
	static double[] zonas = new double[NUM_ZONAS]; 

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
			cantidadPorZona(pedirZona());
			break;
		case 4:
			obtenerMediaPesos();
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
		System.out.println("Cerrando programa...:-(((");
		
	}

	private static void obtenerMediaPesos() {
		
		double mediaPesos = obtenerPesoTotal()/NUM_ZONAS;
		System.out.println("La media recogida por zona es:"+mediaPesos+ " kg");
		
	}

	private static void cantidadPorZona(int zona) {
		
		System.out.println("Zona "+zona+"--->"+zonas[zona-1]);
		
	}

	private static double obtenerPesoTotal() {
		double pesoTotal=0;
		for(int i=0;i<NUM_ZONAS;i++) {
			pesoTotal+=zonas[i];
		}
		
		return pesoTotal;
	}

	private static void imprimirDatos() {
		
		for(int i=0;i<NUM_ZONAS;i++) {
			System.out.println("Zona "+(i+1)+"--->"+zonas[i]+" kg");
		}
		
	}

	private static void registrarPeso2() {
		int zona = pedirZona();
		double peso = pedirPeso();
		zonas[zona-1]=zonas[zona-1]+peso;
	}
	
	private static void registrarPeso(int zona, double peso) {
		zonas[zona-1]=zonas[zona-1]+peso;
	}
	
	private static void quitarPeso(int zona, double peso) {
		zonas[zona-1]=zonas[zona-1]-peso;
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

	private static void mostrarMenu() {
		System.out.println("----- CONTROL VENDIMIA ---.");
		System.out.println("1. Añadir cantidad a zona");
		System.out.println("2. Obtener peso total");
		System.out.println("3. Cantidad por zona");
		System.out.println("4. Media de peso");
		System.out.println("5. Salir");
	}
}
