package unidad11.ejemplos.historialReparaciones;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;


public class HistorialReparaciones {

	private static List<Reparacion> reparaciones = new ArrayList<Reparacion>();
	
	public static void main(String[] args) {
		
		
		try {
			
			//FICHERO DE CONFIGURAICÓN
			Properties propiedades  = new Properties();
			FileInputStream fis = new FileInputStream("ficheros/configuracion.properties");
			propiedades.load(fis);
			String directorio = propiedades.getProperty("directorio");
			String nombreFichero = propiedades.getProperty("ficheroHistorial");
			
			
			
			File fichero = new File(directorio+File.separator+nombreFichero);
			FileReader fr = new FileReader(fichero);
			BufferedReader br = new BufferedReader(fr);
			
			String linea = br.readLine();
			while(linea!=null) {
				tratarLineaDatosReparacion(linea);
				System.out.println(linea);
				linea=br.readLine();
			}
			
			br.close();
			fr.close();
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		mostrarDatos();

	}

	private static void mostrarDatos() {
		
		Iterator ite = reparaciones.iterator();
		while(ite.hasNext()) {
			Reparacion reparacion = (Reparacion)ite.next();
			System.out.println(reparacion);
		}
		
	}

	private static void tratarLineaDatosReparacion(String linea) {
		
		String[] datos = linea.split(" ");
		TipoVehiculo tipo=null;
		tipo = obtenerTipoVehiculo(datos[0]);
		if(datos.length==3) { //NO HAY REPARACIONES
			
			crearNuevaReparacion(tipo,datos[1],datos[2],null);
		}else {
			List<String> aniosReparacion = obtenerAniosReparacion(linea);
			crearNuevaReparacion(tipo,datos[1],datos[2],aniosReparacion);
		}
	}

	private static List<String> obtenerAniosReparacion(String linea) {
	
		String[] datos = linea.split(" ");
		List<String> anios = new ArrayList<String>();
		
		for(int i=3;i<datos.length;i++) {
			anios.add(datos[i]);
		}
		
		return anios;
	}

	private static void crearNuevaReparacion(TipoVehiculo tipo, String matricula, String anioCompra, List listaReparaciones) {
		
		Reparacion reparacion = new Reparacion(tipo, matricula, anioCompra, listaReparaciones);
		reparaciones.add(reparacion);
		
	}

	private static TipoVehiculo obtenerTipoVehiculo(String nombreTipo) {
		
		TipoVehiculo tipo = null;
		
		if(TipoVehiculo.COCHE.getNombre().equals(nombreTipo)) {
			tipo = TipoVehiculo.COCHE;
		}
		if(TipoVehiculo.MOTO.getNombre().equals(nombreTipo)) {
			tipo = TipoVehiculo.MOTO;
		}
		if(TipoVehiculo.CAMION.getNombre().equals(nombreTipo)) {
			tipo = TipoVehiculo.CAMION;
		}
		
		
		return tipo;
	}

}
