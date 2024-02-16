package unidad8.ejemplos.interfaces.mascostas;

public interface Mascota {

	String getCodigo();
	void hacerRuido();
	void come(String comida);
	void peleaCon(Animal contrincante);
}
