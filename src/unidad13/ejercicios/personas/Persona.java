package unidad13.ejercicios.personas;

public class Persona {
	
	private String nombre;
	private String apellido;
	private String ciudad;
	
//	
	public String getNombre() {
		return nombre;
	}
	
	public Persona(String nombre, String apellido, String ciudad) {
	super();
	this.nombre = nombre;
	this.apellido = apellido;
	this.ciudad = ciudad;
}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	

}
