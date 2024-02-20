package unidad8.ejemplos.interfaces.vehiculosElectricos;

public class BicicletaElectrica implements IVehiculosElectricos{

	private int nivelBateria;
	
	public BicicletaElectrica() {
		nivelBateria=30;
	}
	
	@Override
	public void cargar() {
		
		System.out.println("Cargando la bici eléctrica....");
		nivelBateria=100;
		System.out.println("Carga completa. Nivel batería:"+nivelBateria);
		
	}

	@Override
	public void descargar() {
		
		System.out.println("Descargando la bici eléctrica...");
		nivelBateria-=5;
		if (nivelBateria<0) {
			nivelBateria=0;
		}
		System.out.println("Nivel de batería después de descargar:"+nivelBateria);
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Esto es una bici eléctrica";
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
