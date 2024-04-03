package unidad10.ejemplos.crearexcepcion;

public class Programa2 {

	public static void main(String[] args) {
		
		Programa2 programa = new Programa2();
		try {
			programa.metodoQuePuedeLanzarExcepcion();
			
		}catch(AlgoHaSalidoMalExcepion ex) {
			System.out.println(ex.getMessage());
			System.out.println("Causa de la Excepcion:"+ex.getCause());
			ex.printStackTrace();
		}

	}
	
	public void metodoQuePuedeLanzarExcepcion() throws AlgoHaSalidoMalExcepion {
		
		boolean condicion = true;
		if(condicion) {
			throw new AlgoHaSalidoMalExcepion
			("Se ha producido un pequeño error, nos quedaremos "
					+ "esta Samana Santa estudianto programción",new IllegalAccessError());
		}
	}

}










