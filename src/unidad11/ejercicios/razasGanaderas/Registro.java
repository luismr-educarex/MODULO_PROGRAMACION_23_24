package unidad11.ejercicios.razasGanaderas;

public class Registro {

	private int codigo;
	private String raza_ganado;
	private int numero;
	private String fecha;
	private String zonas;
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getRaza_ganado() {
		return raza_ganado;
	}
	public void setRaza_ganado(String raza_ganado) {
		this.raza_ganado = raza_ganado;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getZonas() {
		return zonas;
	}
	public void setZonas(String zonas) {
		this.zonas = zonas;
	}
	@Override
	public String toString() {
		return "Registro [codigo=" + codigo + ", raza_ganado=" + raza_ganado + ", numero=" + numero + ", fecha=" + fecha
				+ ", zonas=" + zonas + "]";
	}
	
	
	
	
	
}
