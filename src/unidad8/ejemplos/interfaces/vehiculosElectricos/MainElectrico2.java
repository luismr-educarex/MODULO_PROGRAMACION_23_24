package unidad8.ejemplos.interfaces.vehiculosElectricos;

public class MainElectrico2 {

	public static void main(String[] args) {
		
		
		IVehiculosElectricos arrayVehiculos[] = new IVehiculosElectricos[10];
		
		IVehiculosElectricos vehiculo1 = new CocheElectrico();
		IVehiculosElectricos vehiculo2 = new BicicletaElectrica();
		IVehiculosElectricos vehiculo3 = new FurgonetaElectrica();
		IVehiculosElectricos vehiculo4 = new MotoElectrica();
		IVehiculosElectricos vehiculo5 = new PatineteElectrico();
		
		arrayVehiculos[0]=vehiculo1;
		arrayVehiculos[1]=vehiculo2;
		arrayVehiculos[2]=vehiculo3;
		arrayVehiculos[3]=vehiculo4;
		arrayVehiculos[4]=vehiculo5;
		
		
		vehiculo1.cargar();
		vehiculo1.descargar();
		vehiculo2.cargar();
		vehiculo2.descargar();
		vehiculo3.cargar();
		vehiculo3.descargar();
		vehiculo4.cargar();
		vehiculo4.descargar();
		vehiculo5.cargar();
		vehiculo5.descargar();

	}

}
