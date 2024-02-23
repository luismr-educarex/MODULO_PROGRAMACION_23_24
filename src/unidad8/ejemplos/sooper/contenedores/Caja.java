package unidad8.ejemplos.sooper.contenedores;

import unidad8.ejemplos.sooper.enums.TipoContenedor;

public class Caja extends Contenedores{
	
	// OTRAS OPCIONES QUE SON MENOS ELEGANTES!!!!
	//private TipoContenedor tipo = TipoContenedor.CAJA;
	//private int tipoContenedor = 1;
	//private String tipoC = "Caja";

	public Caja(String referencia, int alto, int ancho) {
		super(referencia, alto, ancho);
		
	}
	
	public TipoContenedor getTipo() {
		return TipoContenedor.CAJA;
	}
	
	@Override
	public int getSuperficie() {
		return ancho*alto;
	}

}
