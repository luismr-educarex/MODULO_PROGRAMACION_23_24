package pruebas.evaluacion1.prueba2.ejercicio1;

import java.util.Scanner;

public class Carrera {

	static final int NUM_PARTICIPANTES = 10;
	static final int[] carrera = new int[NUM_PARTICIPANTES];
	static final int[] menores = new int[NUM_PARTICIPANTES];
	static final int[] positivos = new int[NUM_PARTICIPANTES];
	static final int[] morosos = new int[NUM_PARTICIPANTES];
	static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		leerDorsales();
		leerMenores();
		leerPositivos();
		leerMorosos();
		gestionarMenores();
		gestionarPositivos();
		mostrarClasificacion();

	}

	private static void gestionarPositivos() {
		
		int dorsalPositivo=0;
		for(int i=0;i<positivos.length;i++) {
			dorsalPositivo = positivos[i];
			if(dorsalPositivo!=0) {
				for(int j=0;j<carrera.length;j++) {
					
						carrera[j] = 0;
						
					}
				}
			}
		}
		
	}

	private static void gestionarMenores() {
		
		int dorsalMenor=0;
		int tmp;
		for(int i=0;i<menores.length;i++) {
			dorsalMenor = menores[i];
			if(dorsalMenor!=0) {
				for(int j=0;j<carrera.length;j++) {
					if(dorsalMenor==carrera[j] && j!=0) {
						tmp = carrera[j];
						carrera[j] = carrera[j-1];
						carrera[j-1] =tmp;
					}
				}
			}
		}
		
	}

	private static void mostrarClasificacion() {
		
		int posicion=1;
		for(int i=0;i<carrera.length;i++) {
			if(carrera[i]!=0) {
				System.out.println("Posicion:"+posicion+"--Dorsal:"+carrera[i]);
				posicion++;
			}
			
		}
		
	}

	private static void leerPositivos() {
		int dorsal=0;
		int contadorPositivos=0;
		do {
			System.out.println("Introduzca un dorsal del positivo(-1 para fin)");
			dorsal = entrada.nextInt();
			if(dorsal!=-1) {
				positivos[contadorPositivos]=dorsal;
				contadorPositivos++;
			}
		}while(dorsal!=-1);
		
	}

	private static void leerMorosos() {
		int dorsal=0;
		int contadorMorosos=0;
		do {
			System.out.println("Introduzca un dorsal del moroso(-1 para fin)");
			dorsal = entrada.nextInt();
			if(dorsal!=-1) {
				morosos[contadorMorosos]=dorsal;
				contadorMorosos++;
			}
		}while(dorsal!=-1);
		
	}

	private static void leerMenores() {
		
		int dorsal=0;
		int contadorMenor=0;
		do {
			System.out.println("Introduzca un dorsal del menor(-1 para fin)");
			dorsal = entrada.nextInt();
			if(dorsal!=-1) {
				menores[contadorMenor]=dorsal;
				contadorMenor++;
			}
		}while(dorsal!=-1);
		
	}

	private static void leerDorsales() {
		
		int dorsal=0;
		int contadorEntrada=0;
		do {
			System.out.println("Introduzca un dorsal (-1 para fin)");
			dorsal = entrada.nextInt();
			if(dorsal!=-1) {
				carrera[contadorEntrada]=dorsal;
				contadorEntrada++;
			}
		}while(dorsal!=-1);
		
	}

}
