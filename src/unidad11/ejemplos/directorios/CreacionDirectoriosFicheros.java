package unidad11.ejemplos.directorios;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CreacionDirectoriosFicheros {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese la ruta del directorio a crear");
		
		String nombreDirectorio = entrada.nextLine();
		
		//NO crea el directorio
		File directorio  = new File(nombreDirectorio);
		if(directorio.exists()) {
			System.out.println("El directorio ya existe...");
		}else {
			System.out.println("EL directorio no existe, vamos a crearlo");
			//mkdir crea toda la estructura necesaria
			if(directorio.mkdir()) {
				System.out.println("Directorio creado");
			}else {
				System.out.println("Directorio no creado");
			}
		}
		
		
		System.out.println("Ingrese el nombre del fichero a crear");
		String nombreFichero = entrada.nextLine();
		
		File fichero = new File(nombreDirectorio+"//"+nombreFichero);
		if(fichero.exists()) {
			System.out.println("El fichero ya existe");
		}else {
			try {
				if(fichero.createNewFile()) {
					System.out.printf("El fichero %s se ha creado con éxito%n",nombreFichero);
					System.out.println("El fichero "+nombreFichero+" se ha creado con éxito");
				}else {
					System.out.println("El fichero no se ha creado");
				}
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		
		entrada.close();

	}

}








