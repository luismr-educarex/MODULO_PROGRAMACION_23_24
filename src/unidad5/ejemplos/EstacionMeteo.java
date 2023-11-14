package unidad5.ejemplos;

public class EstacionMeteo{

	public static void main(String[] args) {
		
		int []temperaturas= {12,7,14,15,19,21,27,26,20,18,12,-5};
		int []diasLluviosos = new int[]{28,6,48,89};
		int []humedad = {10,67,24,89,76,50};
		
		System.out.println("_________ TEMPERATURAS MEDIAS");
		imprimirArray(temperaturas, "º");
		System.out.println("_________ DIAS LLUVIOSOS ESTACIONE");
		imprimirArray(diasLluviosos, "dias");
		System.out.println("_________ HUMEDAD");
		imprimirArray(humedad, "%");

	}
	
	
	private static void imprimirArray(int[] datos,String unidad) {
		
		for(int indice=0;indice<datos.length;indice++) {
			System.out.println("Mes "+(indice+1)+":"+datos[indice]+unidad);
		}
	}

}
