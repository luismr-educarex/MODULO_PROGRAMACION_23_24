package unidad8.ejemplos.interfaces.animales1;

public class Leon implements Sonido{

	int pasos;
	@Override
	public void voz() {
		System.out.println("Grrrrrrrr");
		
	}
	@Override
	public void andar() {
		
		pasos=pasos+pasos*2;
		
	}

}
