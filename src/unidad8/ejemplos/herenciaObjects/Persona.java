package unidad8.ejemplos.herenciaObjects;

public class Persona {
	
	private int id;
	private String nombre;
	private String localidad;
	private static int contador = 1000;
	
	
	public Persona(String nombre) {
		
		this.id=contador;
		this.nombre= nombre;
		contador++;
	}
	
    public Persona() {
		
		this.id=contador;
		this.nombre= "XXXXX";
		contador++;
	}
    
    @Override
    public String toString() {
    	
    	return this.id+"-"+this.nombre+"-"+this.localidad;
    }
   
    
    @Override
    public boolean equals(Object obj) {
    	
    	boolean sonIguales=false;
    	if(this==obj) {
    		sonIguales=true;
    	}
    	if(obj instanceof Persona) {
    		Persona laOtraPersona = (Persona) obj;
    		sonIguales = this.nombre.equals(laOtraPersona.getNombre())
    				&& this.localidad.equals(laOtraPersona.getLocalidad());
    	}
    	
    	return sonIguales;
    }
    
    
    
    

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		Persona.contador = contador;
	}
	
	

}
