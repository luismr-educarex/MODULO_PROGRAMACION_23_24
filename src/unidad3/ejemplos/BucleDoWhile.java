package unidad3.ejemplos;

public class BucleDoWhile {

	public static void main(String[] args) {
		
		System.out.println("RESULTADO BUCLE DO-WHILE");
		int n=10;
		do {
			System.out.println("Número:"+n);
			n--;
		}while(n>11);
		
		System.out.println("RESULTADO BUCLE WHILE");
		n=10;
		while(n>11) {
			System.out.println("Número:"+n);
			n--;
		}

	}

}
