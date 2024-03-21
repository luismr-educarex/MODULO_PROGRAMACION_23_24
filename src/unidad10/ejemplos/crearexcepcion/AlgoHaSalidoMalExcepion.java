package unidad10.ejemplos.crearexcepcion;

public class AlgoHaSalidoMalExcepion extends Exception{
	
	public AlgoHaSalidoMalExcepion(String mensaje) {
		super(mensaje);
	}
	
	public AlgoHaSalidoMalExcepion(String mensaje, Throwable causa) {
		super(mensaje,causa);
	}

}
