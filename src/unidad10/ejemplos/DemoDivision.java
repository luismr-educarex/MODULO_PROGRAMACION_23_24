package unidad10.ejemplos;

public class DemoDivision {

	public static void main(String[] args) {
	
		int a = 10;
		int b=0;
		double resultado = 0; 
		try {
			resultado = a/b;
		}catch(ArithmeticException excepcion) {
			
			System.out.println("Se ha producido un error");
			System.err.println(excepcion.getMessage());
			System.err.println(excepcion.toString());
			resultado = 10;
		}finally {
			System.out.println("Gracias por participar");
		}
		
		
		System.out.println("Resultado:"+resultado);

	}

}
