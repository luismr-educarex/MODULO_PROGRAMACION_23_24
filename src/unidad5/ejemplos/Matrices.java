package unidad5.ejemplos;

public class Matrices {

	public static void main(String[] args) {
		
		final int TAM_EDADES=10;
		int [] edades = new int[TAM_EDADES];
		edades[0]=13;
		edades[1]=6;
		edades[2]=34;
		edades[3]=56;
		edades[4]=19;
		edades[8]=25;
		edades[9]=42;
		int contadorMayorEdad=0;
		
		System.out.println("________ORDEN ASCENDENTE ________");
		for(int i=0;i<TAM_EDADES;i++) {
			if(edades[i]!=0) { // ¿No está vacío?
				System.out.println("Posición "+(i+1)+"-->"+edades[i]);
				if(edades[i]>=18) {
					contadorMayorEdad++;
				}
			}
		}	
		System.out.println("Existen "+contadorMayorEdad +" usuarios mayores de edad");
		
		
		System.out.println("________ORDEN DESCENDENTE ________");
		for(int j=TAM_EDADES-1;j>=0;j--) {
			if(edades[j]!=0) {
				System.out.println("Posición "+(j+1)+"-->"+edades[j]);
			}
			
		}
		
	}

}
