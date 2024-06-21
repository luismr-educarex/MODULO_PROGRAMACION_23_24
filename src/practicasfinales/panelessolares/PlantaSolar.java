package practicasfinales.panelessolares;

public class PlantaSolar {
	
	/**
	 * Añade un  nuevo panel solar, que se pasa como parámetro.
	 * Si ya existe uno con el mismo identificador lanza YaExiste.
	 * En otro caso, añadel el panel en la lista de paneles
	 */
	
	public void anadePanel(PanelSolar p) throws YaExiste{
		
	}
	
	/**
	 * Alinea todos los paneles de la planta y con los que resulten correctamente alineados 
	 * y no estén averiados calcula el acimut y elevacion medios, almaceándolos en los respectivos
	 * atributos
	 */
	
	public void alinea() {
		
	}
	
	/**
	 * Encuentra y retorna un papel anómalo, que es aquel que sin estar averiado,
	 * su acimut y elevación se diferencia en más de un 5% de los valores medios almacenados
	 * en los atributos.
	 * Retorna null si no hay paneles que cumplan esa condición
	 */
	 public PanelSolar panelAnomalo() {
		return null;
		 
	 }

}
