package unidad5.ejercicios;

public class BusquedaLineal {

	public static void main(String [] args) {
	
		int arr[] = {2,3,14,10,56,40};
		//Elemento a buscar
		int x = Integer.parseInt(args[0]);
		
		int posicion = buscar(arr,x);
		if(posicion==-1) {
			System.out.println("Elemento  no encontrado en el array");
		}else {
			System.out.println("El elemento se encuentra en "
					+ "la posición:"+(posicion+1));
		}
	}

	private static int buscar(int[] arr, int x) {
	
		int resultado=-1;
		boolean noEncontrado=true;
		int numVeces = 1;
		for(int i=0;i<arr.length ;i++) {
			if(arr[i]==x) {
				resultado=i;
				//noEncontrado=false;
				i=arr.length;
			}
			System.out.println("Veces:"+numVeces);
			numVeces++;
		}
		
		return resultado;
	}
	
}
