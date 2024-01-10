package unidad6.ejemplos.aleatorios;

public class GeneradorAletoriosMath {

	public static void main(String[] args) {
		
		//Se genera aletorio entre 0.0 y 1.0
		double numero = Math.random();
		System.out.println(numero);
		
		//Se genera aletorio entre 0 y 9
		int numero2 =(int)(Math.random()*100);
		System.out.println(numero2);
		
		//Se genera aletorio entre 1 y 10
		int numero3=(int)(Math.random()*100+1);
		System.out.println(numero3);
		
		

	}

}
