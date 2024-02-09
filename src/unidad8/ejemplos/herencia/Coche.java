package unidad8.ejemplos.herencia;

public class Coche extends Vehiculo{
	
	private int numPuertas;
	private int numPlazas;
	private int capacidadMaletero;
	private String tipo;

	public Coche(String matricula, String bastidor, String marca, String modelo, Motor motor) {
		super(matricula, bastidor, marca, modelo, motor);
		
		
	}
	
	public Coche(String matricula, 
			String bastidor, 
			String marca, 
			String modelo, 
			Motor motor,
			int numPuertas,
			int numPlazas,
			int capacidadMaletero,
			String tipo
			) {
		super(matricula, bastidor, marca, modelo, motor);
		this.numPuertas= numPuertas;
		this.numPlazas = numPlazas;
		this.capacidadMaletero = capacidadMaletero;
		this.tipo = tipo;
		
	}
	
	public void mostrarDatos() {
		System.out.println("---- COCHE ----");
		System.out.println("Marca:"+marca);
		System.out.println("Modelo:"+modelo);
		System.out.println("Motor:"+motor.getTipoCombustible());
		System.out.println("Plazas:"+numPlazas);
	}

	public int getNumPuertas() {
		return numPuertas;
	}

	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}

	public int getNumPlazas() {
		return numPlazas;
	}

	public void setNumPlazas(int numPlazas) {
		this.numPlazas = numPlazas;
	}

	public int getCapacidadMaletero() {
		return capacidadMaletero;
	}

	public void setCapacidadMaletero(int capacidadMaletero) {
		this.capacidadMaletero = capacidadMaletero;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	
	

}
