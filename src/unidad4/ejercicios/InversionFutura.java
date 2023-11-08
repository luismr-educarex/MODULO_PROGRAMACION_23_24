package unidad4.ejercicios;

import java.util.Scanner;

public class InversionFutura {
	
	static double  inversion;
	static double  tipoInteres;
	static int  numAnios;
	public static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		/*
		inversion = pedirInversion();
		tipoInteres = pedirTipoInteres();
		numAnios = pedirNumAnios();
		*/
		pedirDatos();
		//validarDatos();
		
		//VF=VP* [(1+i)^n]
		//VF -> Valor de futuro
		//VP  -> Inversion
		// i -> Tipo interés
		// n -> tiempo (número de periodos = meses)
		
		
		/*
		pedirInversion2();
		pedirTipoInteres2();
		pedirNumAnios2();
		
		pedirDatos2();
        */
	}
	
	
	

	private static void pedirDatos() {	
		double inversionTmp;
		System.out.println("Introduzca la inversión a realizar");
		inversionTmp = entrada.nextDouble();
		if(inversionTmp>0) { //Validación
			inversion = inversionTmp;
		}else {
			inversion = 0.0;
		}
		
		System.out.println("Introduzca el tipo de interes");
		tipoInteres = entrada.nextDouble();
		System.out.println("Introduzca el número de años");
		numAnios = entrada.nextInt();
		
	}
	
	private static void pedirDatos2() {	
		
		pedirInversion2();
		pedirTipoInteres2();
		pedirNumAnios2();
		
	}



	private static int pedirNumAnios() {
		int numAnio=0;
		System.out.println("Introduzca el número de años");
		numAnio = entrada.nextInt();
		return numAnio;
	}
	

	private static void pedirNumAnios2() {
		
		System.out.println("Introduzca el número de años");
		numAnios = entrada.nextInt();
	
	}

	private static double pedirTipoInteres() {
		
		double interes = 0;
		System.out.println("Introduzca el tipo de interes");
		interes = entrada.nextDouble();
		return interes;
	}
	
private static void pedirTipoInteres2() {
		
		System.out.println("Introduzca el tipo de interes");
		tipoInteres = entrada.nextDouble();
		
	}

private static double pedirInversion() {
		
		double inversionTmp = 0;
		 
		System.out.println("Introduzca la inversión a realizar");
		inversionTmp = entrada.nextDouble();
		if(inversionTmp<=0) {
			inversionTmp = 0.0;
		}
		return inversionTmp;
		
		
	}

private static void pedirInversion2() {
	
	System.out.println("Introduzca la inversión a realizar");
	inversion = entrada.nextDouble();
	
}

}
