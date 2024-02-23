package unidad8.ejemplos.sooper.contenedores;

import unidad8.ejemplos.sooper.IContenedores;
import unidad8.ejemplos.sooper.Producto;
import unidad8.ejemplos.sooper.enums.TipoContenedor;

public class Contenedores implements IContenedores{

	protected String referencia;
	protected int alto;
	protected int ancho;
	protected int resistencia;
	
	protected Producto[] productos;

	public Contenedores(String referencia, int alto, int ancho) {
		super();
		this.referencia = referencia;
		this.alto = alto;
		this.ancho=ancho;
		
		
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public int getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}

	public int getResistencia() {
		return resistencia;
	}
	
	

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public void setResistencia(int resistencia) {
		this.resistencia = resistencia;
	}

	public Producto[] getProductos() {
		return productos;
	}

	public void setProductos(Producto[] productos) {
		this.productos = productos;
	}

	@Override
	public int getVolumen() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int volumenDisponilbe() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public TipoContenedor getTipo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean meter(Producto producto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean resiste(Producto producto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getSuperficie() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
	

	
	
	
	
}
