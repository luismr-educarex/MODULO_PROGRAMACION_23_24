package unidad10.ejemplos;

public class Programa {

	public static void main(String[] args) {
	
		try {
			metodo1();
		} catch (IllegalAccessException e) {
			System.out.println(e.getMessage());
		}

	}
	
	public static void metodo1() throws IllegalAccessException {
		
		
		try {
			metodo2();
		}catch(IllegalAccessException ex) {
			throw new IllegalAccessException(ex.getMessage()+"|"+"Error producido en metodo2");
		}
		
		
	}
	
	public static void metodo2() throws IllegalAccessException {
		
		lanzarExcepcion();
	}
	
	public static void lanzarExcepcion() throws IllegalAccessException {
		
		try {
			System.out.println("Lanzamos una Execpión");
			throw new IllegalAccessException("Error producido en lanzarExcepcion");
		}catch(IllegalAccessException ex) {
			throw ex;
		}
		
	}

	
	
	
	
	
	
	
}
