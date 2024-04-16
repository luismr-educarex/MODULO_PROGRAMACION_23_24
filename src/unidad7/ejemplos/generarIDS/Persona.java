package unidad7.ejemplos.generarIDS;

public class Persona {
	
	private static int contador = 0;
    private final int identificador;
    private String nombre;

    public Persona(String nombre) {
        super();
        this.nombre = nombre;
        contador++;
        this.identificador = contador;
    }


	public int getIdentificador() {
		return identificador;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	@Override
	public String toString() {
		return "Persona [id="+identificador+"nombre=" + nombre + "]";
	}
	
	
	
   
}
