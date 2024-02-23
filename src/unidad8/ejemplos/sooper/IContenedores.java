package unidad8.ejemplos.sooper;

import unidad8.ejemplos.sooper.enums.TipoContenedor;

public interface IContenedores {
	
	String getReferencia();
	int getVolumen();
	int volumenDisponilbe();
	int getResistencia();
	Producto[] getProductos();
	TipoContenedor getTipo();
	boolean meter(Producto producto);
	boolean resiste(Producto producto);
	int getSuperficie();

}
