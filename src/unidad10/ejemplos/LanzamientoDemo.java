package unidad10.ejemplos;

public class LanzamientoDemo {

	public static void main(String[] args) {
		try {
			metodoIntermedio();
		} catch (IllegalAccessException e) {
			System.out.println(e.getMessage());		}
	}
	
	public static void metodoIntermedio() throws IllegalAccessException {
		lanzarExcep();
	}
	
	public static void lanzarExcep() throws IllegalAccessException {
		
		throw new IllegalAccessException("Error producido en el método lanzarExcetp");
	}

}
