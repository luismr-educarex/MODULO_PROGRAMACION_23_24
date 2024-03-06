package unidad9.ejemplos.eventos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Evento implements IAsistible {

	private String nombre;
	private LocalDate fecha;
	private int duracionEnHoras;
	private List<String> asistentes;
	//private Set<String> asistentes;
	
	
	
	public Evento(String nombre, LocalDate fecha, int duracionEnHoras) {
		super();
		this.nombre = nombre; // NOMBRE DEL EVENTO
		this.fecha = fecha;
		this.duracionEnHoras = duracionEnHoras;
		this.asistentes = new ArrayList<String>(); //NOMBRES DE LOS ASISTENTES
	}
	
	

	@Override
	public void registrarAsistente(String nombre) {
		if(esNombreValido(nombre)) {
			if(!esAsistenteRegistrado(nombre)) {
				asistentes.add(nombre);
				System.out.println(nombre + "registrado como asistente en "+ this.nombre);
			}else {
				System.out.println(nombre + "ya está "
						+ "registrado como asistente en "+ this.nombre);
			}
			
		}else {
			System.out.println("Nombre incorrecto");
		}

	}

	private boolean esNombreValido(String nombre) {
		String patronValido = "[A-Z][a-z]*";
		return   nombre.matches(patronValido);
		
	}



	@Override
	public void cancelarRegistroAsistente(String nombre) {
		asistentes.remove(nombre);
		System.out.println(nombre + "ha cancelado su registro en:"+ this.nombre) ;
		

	}

	@Override
	public boolean esAsistenteRegistrado(String nombre) {
		return asistentes.contains(nombre);
	}

	@Override
	public List<String> obtenerListaAsistentes() {
		return new ArrayList<>(asistentes);
		//return asistentes;
		
	}

	@Override
	public void limpiarListaAsistente() {
		asistentes.clear();
		System.out.println("Lista de asistentes en "+this.nombre+" ha sido limpiado");

	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public LocalDate getFecha() {
		return fecha;
	}



	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}



	public int getDuracionEnHoras() {
		return duracionEnHoras;
	}



	public void setDuracionEnHoras(int duracionEnHoras) {
		this.duracionEnHoras = duracionEnHoras;
	}



	public List<String> getAsistentes() {
		return asistentes;
	}



	public void setAsistentes(List<String> asistentes) {
		this.asistentes = asistentes;
	}
	
	

}
