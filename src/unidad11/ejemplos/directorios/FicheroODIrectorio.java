package unidad11.ejemplos.directorios;

import java.io.File;

public class FicheroODIrectorio {

	public static void main(String[] args) {
		
		File fichero = new File("/home/profesor/LUIS/FICHEROS/pruebas/fichero.txt");
		
		if(fichero.isDirectory()) {
			System.out.println("Es un directorio");
		}else {
			System.out.println("Es un fichero");
		}
		

	}

}
