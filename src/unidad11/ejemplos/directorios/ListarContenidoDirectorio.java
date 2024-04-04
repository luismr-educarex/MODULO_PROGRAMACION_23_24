package unidad11.ejemplos.directorios;

import java.io.File;

public class ListarContenidoDirectorio {

	public static void main(String[] args) {
		
		File directorio = new File("/home/profesor/LUIS/FICHEROS");
		
		if(!directorio.exists() || !directorio.isDirectory()) {
			System.out.println("El directorio no existe o no es un directorio válido");
		}else {
			
			//Listar el contenido usando list()
			String[] elementos = directorio.list();
			for(String elemento: elementos) {
				System.out.println(elemento);
			}
			
			System.out.println("___________________________");
			//Listar el contenido usando listFiles()
			File[] elementosFile = directorio.listFiles();
			for(File elementoFile: elementosFile) {
				System.out.println(elementoFile.getName());
			}
			
		}
		

	}

}
