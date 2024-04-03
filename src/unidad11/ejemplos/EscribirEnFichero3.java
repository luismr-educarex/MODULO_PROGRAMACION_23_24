package unidad11.ejemplos;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class EscribirEnFichero3 {

	public static void main(String[] args) {

		
			String linea = "Badajoz	2008	Enero	51,4";
			String[] datos = linea.split("\\s+");
			System.out.println("Provincia:"+datos[0]);
			System.out.println("Año:"+datos[1]);
			System.out.println("Mes:"+datos[2]);
		
			try {
				PrintWriter escritor = new PrintWriter("ejemplo3.txt");
				
				escritor.write("Este es un ejemplo de cómo escribir con PrintWriter");
				escritor.println();
				escritor.printf("Podemos escribir %s con formato","textos");
				escritor.println();
				escritor.printf("Podemos escribir %d con formato",6);
				
				
				escritor.close();
				
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			}
	
	}

}
