package unidad10.ejemplos.crearexcepcion;

public class Programa {

	public static void main(String[] args) {
		
		Programa programa = new Programa();
		try {
			programa.metodoQuePuedeLanzarExcepcion();
			
		}catch(AlgoHaSalidoMalExcepion ex) {
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}

	}
	
	public void metodoQuePuedeLanzarExcepcion() throws AlgoHaSalidoMalExcepion {
		
		boolean condicion = true;
		if(condicion) {
			throw new AlgoHaSalidoMalExcepion
			("Se ha producido un pequeño error, nos quedaremos "
					+ "esta Samana Santa estudianto programción");
		}
	}

}
