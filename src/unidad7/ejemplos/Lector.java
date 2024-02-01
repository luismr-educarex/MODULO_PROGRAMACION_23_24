package unidad7.ejemplos;

import java.util.Scanner;

public class Lector {

	static Scanner  entrada = new Scanner(System.in);

	public static double leerDouble() {
		
		double numero=0;
		String lectura = entrada.next();
		numero = Double.parseDouble(lectura);
		return numero;
	}
	
	public static Integer leerEnteroObjeto() {
		
		Integer numero=0;
		String lectura = entrada.next();
		numero = new Integer(Integer.parseInt(lectura));
		return numero;
	}
	
	public static int leerEntero() {
		
		int numero=0;
		String lectura = entrada.next();
		numero = Integer.parseInt(lectura);
		return numero;
	}
	
    public static String leerCadena() {
		
		String cadena="";
		cadena = entrada.next();
		return cadena;
	}
    
   public static String leerLinea() {
		
		String cadena="";
		cadena = entrada.nextLine();
		return cadena;
	}
}
