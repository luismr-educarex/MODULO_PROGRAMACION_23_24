package unidad2.ejemplos;

public class Conversiones {

	public static void main(String[] args) {
		
		byte numeroByte;
		int numeroEntero=2345678;
		double numeroFloat = 4.9999;
		//double numeroDouble = 34.5678;
		numeroByte = (byte)numeroEntero;
		String saludo = "Nos vamos de puente";
		char caracter = 'b';
		String subsaludo = saludo.substring(0, 1);
		System.out.println(subsaludo);
		
		

		System.out.println("Número byte:"+numeroByte);
		System.out.println("Número entero:"+numeroEntero);
		
		numeroEntero = (int)numeroFloat;
		
		System.out.println("Número float:"+numeroFloat);
		System.out.println("Número entero:"+numeroEntero);

	}

}
