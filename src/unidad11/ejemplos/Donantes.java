package unidad11.ejemplos;

import java.util.HashMap;
import java.util.Map;

public class Donantes {

	static final String AB_POSITIVO="AB+";
	static final String AB_NEGATIVO="AB+";
	static final String A_POSITIVO="A+";
	static final String A_NEGATIVO="A-";
	static final String B_POSITIVO="B+";
	static final String B_NEGATIVO="B-";
	static final String CERO_POSITIVO="0+";
	static final String CERO_NEGATIVO="0-";
	
	public static void main(String[] args) {
		
		
		
		Map<String,Integer> donantes = new HashMap<String,Integer>();
		
		int valorInicial=0;
		donantes.put(AB_NEGATIVO, 
				donantes.getOrDefault(AB_NEGATIVO, valorInicial)+1);
		
	

		

	}

}
