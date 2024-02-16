package unidad8.ejemplos.interfaces.animales1;

public class Gato implements Sonido{

	double pasos;
	@Override
	public void voz() {
		System.out.println("Miauuuuuuu");
		
	}

	@Override
	public void andar() {
		pasos = pasos*(1.15);
			
		
	}

}
