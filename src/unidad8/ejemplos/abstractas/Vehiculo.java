package unidad8.ejemplos.abstractas;

public abstract class Vehiculo {
	
	private String fuenteAlimentación;
	private int ruedas;
	protected int precio;
	
	public Vehiculo(String fuenteAlimentacion,int ruedas) {
		super();	
		setFuenteAlimentación(fuenteAlimentacion);
		setRuedas(ruedas);
	}

	public String getFuenteAlimentación() {
		return fuenteAlimentación;
	}

	public void setFuenteAlimentación(String fuenteAlimentación) {
		this.fuenteAlimentación = fuenteAlimentación;
	}

	public int getRuedas() {
		return ruedas;
	}

	public void setRuedas(int ruedas) {
		
		if(ruedas>=0) {
			this.ruedas = ruedas;
		}else {
			ruedas=0;
		}
		
	}

	public int getPrecio() {
		return precio;
	}

	

	public void saludo() {
		System.out.println("Aplicación Vehículos");
	}
	
	public abstract void setPrecio();
	public abstract double calcEficienciaCarburante();
	public abstract double calcDistanciaViaje();
}
