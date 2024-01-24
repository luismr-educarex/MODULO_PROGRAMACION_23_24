package unidad6.ejemplos.enumerados;

public class JuegoCartas {

	public static final int PALO_PICAS =0;
	public static final int PALO_CORAZONES = 1;
	public static final int PALO_TREBOLES = 2;
	public static final int PALO_DIAMANTES = 3;
	
	private int palo;
	private int puntos;
	
	
	public JuegoCartas(int palo,int puntos) {
		this.palo=palo;
		this.puntos=puntos;
	}


	public int getPalo() {
		return palo;
	}


	public void setPalo(int palo) {
		this.palo = palo;
	}


	public int getPuntos() {
		return puntos;
	}


	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	
	public String getNombrePalo() {
		String nombre="";
		switch(palo) {
			case PALO_PICAS:
				nombre = "Picas";
				break;
			case PALO_CORAZONES:
				nombre = "Corazones";
				break;
			case PALO_TREBOLES:
				nombre = "Trebol";
				break;
			case PALO_DIAMANTES:
				nombre = "Diamantes";
				break;
			default:
				System.err.println("Palo inválido");
		}
		
		return nombre;
	}

}












