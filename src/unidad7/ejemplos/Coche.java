package unidad7.ejemplos;

public class Coche {
	
	private String bastidor;
	private String marca;
	private String modelo;
	private int anioModelo;
	private int numPuertas;
	private String color;
	private Motor motor = new Motor();
	private double peso;
	private char emisiones;
	private double precio;
	
  public Coche() {
	  bastidor="Sin bastidor";
	  marca="Sin marca";
	  modelo="Sin modelo";
	}
	
  
	public Coche(String bastidor,String marca,String modelo) {
		this.bastidor = bastidor;
		this.marca = marca;
		this.modelo = modelo;
	}
	
  public Coche(String bastidor,String marca,String modelo,int anioModelo) {
		
		this.bastidor = bastidor;
		this.marca = marca;
		this.modelo = modelo;
		this.anioModelo = anioModelo;
	}
  
  public Coche(String bastidor,String marca,String modelo,int anioModelo,String color) {
		
		this.bastidor = bastidor;
		this.marca = marca;
		this.modelo = modelo;
		this.anioModelo = anioModelo;
		this.color=color;
	}
  
  public String mostraDatos() {
		
	  	String informacion = "";
	  	
	  	informacion = "Información coche____________\n";
	  	informacion = informacion + "Bastidor:"+bastidor+"\n";
	  	informacion +="Marca:"+marca+"\n";
	  	informacion +="Modelo:"+modelo+"\n";
	  	informacion +="Motor:"+motor.getNombre()+"\n";
	  	
	  	return informacion;
	  	
	  }
  
  public Motor getMotor() {
	return motor;
}


public void setMotor(Motor motor) {
	this.motor = motor;
}


public String toString() {
		
  	String informacion = "";
  	
  	informacion = "Información coche____________\n";
  	informacion = informacion + "Bastidor:"+bastidor+"\n";
  	informacion +="Marca:"+marca+"\n";
  	informacion +="Modelo:"+modelo+"\n";
  	
  	return informacion;
  	
  }
    
    
	public void setBastidor(String bastidor) {
		this.bastidor = bastidor;
	}
	public String getBastidor() {
		return bastidor;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAnioModelo() {
		return anioModelo;
	}
	public void setAnioModelo(int anioModelo) {
		this.anioModelo = anioModelo;
	}
	public int getNumPuertas() {
		return numPuertas;
	}
	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public char getEmisiones() {
		return emisiones;
	}
	public void setEmisiones(char emisiones) {
		this.emisiones = emisiones;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
}
