package unidad8.ejemplos.herencia;

public class Motor {

	private String tipoCombustible; // candidato a una enumeracion
	private double cc;
	private double cv;
	
	public Motor(String tipoCombustible, double cc, double cv) {
		super();
		this.tipoCombustible = tipoCombustible;
		this.cc = cc;
		this.cv = cv;
	}
	public String getTipoCombustible() {
		return tipoCombustible;
	}
	public void setTipoCombustible(String tipoCombustible) {
		this.tipoCombustible = tipoCombustible;
	}
	public double getCc() {
		return cc;
	}
	
	
	public void setCc(double cc) {
		
		if(cc>0) {
			this.cc = cc;
		}
		
	}	
	
	public double getCv() {
		return cv;
	}
	public void setCv(double cv) {
		this.cv = cv;
	}
	
	
	
	
}
