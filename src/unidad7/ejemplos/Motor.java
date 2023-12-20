package unidad7.ejemplos;

public class Motor {

	private String nombre;
	private int tipo_motor;
	public int getTipo_motor() {
		return tipo_motor;
	}
	public void setTipo_motor(int tipo_motor) {
		this.tipo_motor = tipo_motor;
	}
	private int cilindrada;
	private int potencia;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCilindrada() {
		return cilindrada;
	}
	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
}
