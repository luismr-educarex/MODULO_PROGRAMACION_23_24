package unidad11.ejemplos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class LeerFicheroTexto3 {

	public static void main(String[] args) {
		
		System.out.println("Leer fichero");
		String rutaFichero = "emisiones.txt";
		
		Map<String, Double> emisiones = new HashMap<String, Double>();
		File fichero = new File(rutaFichero);

		try (BufferedReader lector =new BufferedReader
				(new FileReader(fichero))){
		
			String cadena;
			String[] datos;
			cadena = lector.readLine();
			while(cadena!=null) {
				System.out.println(cadena);
				datos = cadena.split(",");
				System.out.println("Año:"+datos[0]);
				System.out.println("Pais:"+datos[1]);
				String pais = datos[1];
				Double valor = Double.parseDouble(datos[2]);
				emisiones.put(pais,emisiones.get(pais)+valor);
				
				System.out.println("Emisión:"+valor);
				System.out.println("_____________________");
				cadena = lector.readLine();
			}
			
			System.out.println(emisiones);
			lector.close();
	
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}	
		catch(IOException e ) {
			e.printStackTrace();
		}
		
		

	}

}
