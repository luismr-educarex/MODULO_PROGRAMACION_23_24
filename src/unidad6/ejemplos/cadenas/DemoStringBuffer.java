package unidad6.ejemplos.cadenas;

public class DemoStringBuffer {

	public static void main(String[] args) {
		
		String cadenaString = new String("Progamación");
		StringBuffer cadenaBuffer = new StringBuffer("Progamación");
		StringBuilder cadenaBuilder = new StringBuilder("Programación");
		
		System.out.println("Cadena:"+cadenaString);
		System.out.println("Cadena:"+cadenaBuffer);
		System.out.println("Cadena:"+cadenaBuilder);
		
		String cadenaStringMod = cadenaString.concat(" en Daw");
		cadenaBuffer.append(" en Daw");
		cadenaBuilder.append(" en Daw");
		
		System.out.println("Cadena:"+cadenaStringMod);
		System.out.println("Cadena:"+cadenaBuffer);
		System.out.println("Cadena:"+cadenaBuilder);
		
		cadenaBuffer.reverse();
		System.out.println(cadenaBuffer);
		cadenaBuffer.append(1987);
		System.out.println(cadenaBuffer);
		
		
		System.out.println("Longitud:"+cadenaBuffer.length());
		System.out.println("Capacidad:"+cadenaBuffer.capacity());
	}

}








