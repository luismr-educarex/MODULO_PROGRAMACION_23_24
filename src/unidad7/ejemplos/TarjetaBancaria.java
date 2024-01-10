package unidad7.ejemplos;

public class TarjetaBancaria {

	//atributos o propiedades o miembros
	private String numero;
	private int cvv;
	private String titular;
	private int mes;
	private int anio;
	private String marca;
	private String entidad;
	
	//constructores
	public TarjetaBancaria() {
		
	}
	
	public TarjetaBancaria(String numero,int cvv) {
		this.numero = numero;
		this.cvv = cvv;
	}
	
	public TarjetaBancaria(String numero,int cvv,String entidad) {
		this.numero = numero;
		this.cvv = cvv;
		this.entidad = entidad;
	}
	
	
	//funciones o métodos
	public String getNumero() {
		
		return numero.substring(5,10);
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}


	public int getCvv() {
		return cvv;
	}


	public void setCvv(int cvv) {
		this.cvv = cvv;
	}


	public String getTitular() {
		return titular;
	}


	public void setTitular(String titular) {
		this.titular = titular;
	}


	public int getMes() {
		return mes;
	}


	public void setMes(int mes) {
		this.mes = mes;
	}


	public int getAnio() {
		return anio;
	}


	public void setAnio(int anio) {
		this.anio = anio;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getEntidad() {
		return entidad;
	}


	public void setEntidad(String entidad) {
		this.entidad = entidad;
	}
	
	
	
	
}
