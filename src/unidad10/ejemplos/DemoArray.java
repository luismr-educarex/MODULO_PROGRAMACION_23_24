package unidad10.ejemplos;

public class DemoArray {

	public static void main(String[] args) {
		
		int[] numeros = {1,2,3};
		
		try {
			System.out.println(numeros[-2]);
		}catch(ArrayIndexOutOfBoundsException | NullPointerException ex) {
			System.out.println("Se ha producido un eror desconocido, llama el técnico"
				    +ex.getMessage());
		}catch(Exception ex) {
			System.out.println("Se ha producido un eror desconocido, llama el técnico"
		    +ex.getMessage());
		}
		
		finally {
			System.out.println("Me alegra saber de ti");
		}
		
		
	}

}





