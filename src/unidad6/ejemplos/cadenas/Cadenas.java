package unidad6.ejemplos.cadenas;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class Cadenas {
	
    public static final String CAMPEON = "Real Madrid";

	public static void main(String[] args) {
	
		String cadena = new String("  Esto es una linea de texto"
				+ " que se almacena como cadena");
		
		
		
		System.out.println("Longitud:"+cadena.length());
		
		String otraCadena = ", y ahora ampliamos la cadena";
		
		String cadenaFinal = cadena + otraCadena;
		System.out.println(cadenaFinal);
		
		String otraCadenaFinal = cadena.concat(otraCadena);
		
		System.out.println(otraCadenaFinal);
		
		String alumno1 = new String("Mucho Beti");
		String alumno2 = new String("Mucho Beti");
		
		if(alumno1==alumno2) {
			System.out.println("Son iguales");
		}else {
			System.out.println("No son iguales");
		}
		
		if(alumno1.equals(alumno2)) {
			System.out.println("Son iguales");
		}else {
			System.out.println("No son iguales");
		}
		
		System.out.println(cadena.trim());
		System.out.println(cadena.charAt(4));
		String matricula = "5555 mhl";
		System.out.println(matricula.toUpperCase());
		System.out.println(cadena.indexOf("linea"));
		String cadenaConI 
		= ((((cadena.toLowerCase()).replace("a", "i")).
				replace("e", "i")).
				replace("o", "i")).
				replace("u", "i");
		System.out.println(cadenaConI);
		
		System.out.println(cadena.contains("linea"));
		
		String nombres = "1;6;8;3;9;2;2;5";
		String champions[] = nombres.split(";");
		
		for (String nombre : champions) {
			System.out.println(nombre);
		}
		
		String sumaCadena = champions[0] + champions[1];
		int suma = Integer.parseInt(champions[0])+Integer.parseInt(champions[1]);
		System.out.println(sumaCadena);    
		System.out.println(suma);
		
		
		if(champions[0].equals(CAMPEON)) {
			System.out.println("sNo lloreis mucho...");
		}else {
			System.out.println("La mano de Negreira...");
		}
		champions[0]=null;
		if(CAMPEON.equals(champions[0])) {
			System.out.println("No lloreis mucho...");
		}else {
			System.out.println("La mano de Negreira...");
		}
		
		
	}

}














