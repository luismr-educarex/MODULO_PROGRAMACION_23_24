package unidad5.ejercicios;

public class Burbuja {

	public static void main(String[] args) {
		
		int[] arreglo = {62,23,10,20,9};
		System.out.println("Arreglo original");
		mostrarArreglo(arreglo);
		ordenarPorBurbuja(arreglo);
		System.out.println("\nArreglo ordenado");
		mostrarArreglo(arreglo);
	}

	private static void ordenarPorBurbuja(int[] arreglo) {
		
		int tam = arreglo.length;
		int tmp;
		for(int i=0;i<tam-1;i++) {
			for(int j=0;j<tam-i-1;j++) {
				if(arreglo[j]>arreglo[j+1]) {
					tmp = arreglo[j];
					arreglo[j]=arreglo[j+1];
					arreglo[j+1]=tmp;
					
				}
			}
		}
		
	}

	private static void mostrarArreglo(int[] arreglo) {
		
		for(int elemento:arreglo) {
			System.out.print(elemento+"|");
		}
		
	}

}
