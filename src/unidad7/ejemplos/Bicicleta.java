package unidad7.ejemplos;

public class Bicicleta {
	
	private String marca="Sin marca";
	private String modelo="Sin modelo";
	private String color="No definido";
	private int id=0;
	private int tipo=0;
	private double peso;
	private char talla;
	private double precio;
	
	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getTipo() {
		return tipo;
	}


	public void setTipo(int tipo) {
		this.tipo = tipo;
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}


	public char getTalla() {
		return talla;
	}


	public void setTalla(char talla) {
		this.talla = talla;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public Bicicleta(int id,int tipo, String marca,String modelo,String color) {
		this.id=id;
		this.tipo=tipo;
		this.marca=marca;
		this.modelo=modelo;
		this.color=color;
	}
	
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	
	public void imprimirDatos() {
		
		System.out.println("DATOS DE LA BICICLETA");
		System.out.println("ID:"+id);
		System.out.println("Tipo:"+tipo);
		System.out.println("Marca:"+marca);
		System.out.println("Modelo:"+modelo);
		System.out.println("Color:"+color);
	}
	

}






