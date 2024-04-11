package unidad11.ejemplos.historialReparaciones;

public enum TipoVehiculo {

	COCHE("Coche"), MOTO("Moto"),CAMION("Camión");
	
	private final String nombre;
	
	private TipoVehiculo(String nombre) {
		this.nombre=nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
}
