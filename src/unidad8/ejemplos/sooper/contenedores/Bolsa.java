package unidad8.ejemplos.sooper.contenedores;

import unidad8.ejemplos.sooper.enums.TipoContenedor;

public class Bolsa extends Contenedores{
	
	private double resistenciaMaxima;
	
	public Bolsa(String referencia, int alto,int ancho) {
		super(referencia, alto,ancho);
		
	}
	
	public TipoContenedor getTipo() {
		return TipoContenedor.BOLSA;
	}

	public double getResistenciaMaxima() {
		return resistenciaMaxima;
	}

	public void setResistenciaMaxima(double resistenciaMaxima) {
		this.resistenciaMaxima = resistenciaMaxima;
	}
	
	@Override
	public int getSuperficie() {
		int radio = getDiametro()/2;
		return (int) (Math.PI*radio*radio);
	}

	private int getDiametro() {
		return (int) ((2*ancho)/Math.PI);
	}
	
	


	
	
}
