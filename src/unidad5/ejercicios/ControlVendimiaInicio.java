package unidad5.ejercicios;

import java.util.Scanner;

public class ControlVendimiaInicio {

	static final int NUMERO_ZONAS = 6;
	static Scanner entrada  = new Scanner(System.in);
	static double[]zonas = new double[NUMERO_ZONAS];
	
	public static void main(String[] args) {
		
		int opcion=0;

		do{
			mostrarMenu();
			opcion = entrada.nextInt();
			if(opcion<1 && opcion>(NUMERO_ZONAS-1)) {
				System.out.println("Opción no válida");
			}else {
				operar(opcion);
			}
		}while(opcion!=(NUMERO_ZONAS-1));
	}
	
	private static void operar(int opcion) {
		
		switch(opcion) {
		case 1:
			registrarPesoEnZona(pedirZona(),pedirPeso());
		break;
		case 2:
			imprimirDatos();
		break;
		case 3:
			imprimirDatosZona(pedirZona());
		break;
		case 4:
			obtenerMediaPeso();
		break;
	    case 5:
	    	salir();
		break;
		}
	}

	private static void salir() {
		System.out.println("Cerrando programa...");
		
	}

	private static void registrarPesoEnZona(int zona, double peso) {
		zonas[zona-1]=zonas[zona-1]+peso;
	}
	
	private static void obtenerMediaPeso() {
		
		double pesoTotal=0;
		for(int i=0;i<zonas.length;i++) {
			pesoTotal = pesoTotal + zonas[i];
		}
		System.out.println("La media total de todas las zonas es:"+(pesoTotal/NUMERO_ZONAS));
	}

	private static int pedirZona() {
		int zona=0;
		boolean zonaCorrecta=false;
		do {
			System.out.println("Introduzca una zona (1-"+NUMERO_ZONAS+"):");
			zona = entrada.nextInt();
			if(zona<1 || zona>NUMERO_ZONAS) {
				System.out.println("Zona no existente");
			}else {
				zonaCorrecta=true;
			}
		}while(!zonaCorrecta);
		
		 return zona;
	}
	
	private static double pedirPeso() {
		double peso=0;
		
		System.out.println("Introduzca el peso:");
		peso = entrada.nextDouble();
		
		 return peso;
	}

	private static void mostrarMenu() {
		System.out.println("------ VENDIMIA  ------ ");
		System.out.println("1.Añadir cantidad a zona");
		System.out.println("2.Obtener peso total");
		System.out.println("3.Cantidad por zona");
		System.out.println("4.Media de peso");
		System.out.println("5.Salir");
	}
	
	private static void imprimirDatos() {
		
		for(int i=0;i<zonas.length;i++) {
			System.out.println("Zona "+(i+1)+" -->"+zonas[i]);
		}
	}
	
    private static void imprimirDatosZona(int zona) {
	
		System.out.println("Zona "+zona+" -->"+zonas[zona-1]+" kg");
	}

}
