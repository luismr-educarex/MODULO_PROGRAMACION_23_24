package unidad9.ejemplos.colecciones.coches;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoCochesArrayList {

	public static void main(String[] args) {
		
		
		
		List<String> listaMarcas = new ArrayList<String>();
		
		for(String marca:MarcasCoches.marcas) {
			listaMarcas.add(marca);
		}
		
		
		
		System.out.println("## LISTA MARCAS  ##");
		Iterator iteradorMarcas = listaMarcas.iterator();
		while(iteradorMarcas.hasNext()) {
			String marca = (String)iteradorMarcas.next();
			System.out.println(marca);
		}
		
		listaMarcas.add("Toyota");
		
		for(int i=0; i<listaMarcas.size();i++) {
			System.out.println(listaMarcas.get(i));
		}
		
	
		
		

	}

}



