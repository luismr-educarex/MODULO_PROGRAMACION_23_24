package unidad9.ejemplos.colecciones.coches;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class DemoCochesLinkList {

	public static void main(String[] args) {
		
		
		
		List<String> listaMarcas = new LinkedList<String>();
		
		for(String marca:MarcasCoches.marcas) {
			listaMarcas.add(marca);
		}
		

		
		System.out.println("## LISTA MARCAS  ##");
		Iterator iteradorMarcas = listaMarcas.iterator();
		while(iteradorMarcas.hasNext()) {
			String marca = (String)iteradorMarcas.next();
			System.out.println(marca);
		}
		
		for(int i=0; i<listaMarcas.size();i++) {
			System.out.println(listaMarcas.get(i));
		}
		
	
		
		

	}

}



