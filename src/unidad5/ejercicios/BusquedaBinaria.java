package unidad5.ejercicios;

public class BusquedaBinaria {

	public static void main(String[] args) {
		
		int arr[] = {3,11,22,34,49,51,64,78,86,90};
		
		int elementoBuscado = Integer.parseInt(args[0]); 
		int resultado=-1;
		
		System.out.println("Array");
		imprimirArray(arr);
		System.out.println();
		System.out.println("Elemento a buscar:"+elementoBuscado);

		resultado = buscarBinario(arr,elementoBuscado);
		System.out.println("_________________________");
		if(resultado==-1) {
			System.out.println("Elemento no está en el array");
		}else {
			System.out.println("El elemento está en la posición:"+resultado);
		}

	}

	private static int buscarBinario(int[] arr, int elementoBuscado) {
		
		int posicion=-1;
		int izquierda=0;
		int derecha=arr.length-1;
		int medio=-1;
		boolean noEncontrado=true;
		
		while(izquierda<=derecha && noEncontrado) {
			medio= izquierda+(derecha-izquierda)/2;
			
			if(arr[medio]==elementoBuscado) {
				noEncontrado=false;
				posicion=medio;
			}
			
			if(arr[medio]<elementoBuscado) {
				izquierda=medio+1;
			}else {
				derecha=medio-1;
			}
		}
		
		return posicion;
	}

	private static void imprimirArray(int[] arr) {	
     	for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}	
	}
	private static void mostrarArray(int []arr) {
		for(int numero:arr) {
			System.out.print(numero+" ");
		}
	}

}
