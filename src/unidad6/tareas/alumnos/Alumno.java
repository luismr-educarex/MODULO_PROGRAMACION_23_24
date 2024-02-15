package unidad6.tareas.alumnos;

public class Alumno {
	
	private Asignatura asignatura1;
	private Asignatura asignatura2;
	private Asignatura asignatura3;
	
	public Alumno(Asignatura asignatura1, Asignatura asignatura2, Asignatura asignatura3) {
		super();
		this.asignatura1 = asignatura1;
		this.asignatura2 = asignatura2;
		this.asignatura3 = asignatura3;
	}
	
	public Alumno(int id1, int id2, int id3) {
		this.asignatura1 = new Asignatura(id1);
		this.asignatura2 = new Asignatura(id2);
		this.asignatura3 = new Asignatura(id3);
		
	}
	
	
	
}
