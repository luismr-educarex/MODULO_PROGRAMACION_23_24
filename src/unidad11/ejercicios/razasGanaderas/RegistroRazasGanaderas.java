package unidad11.ejercicios.razasGanaderas;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class RegistroRazasGanaderas {

	static List<Registro> registros;
	static Map<String,Map> zonas = new HashMap<String, Map>();
	
	public static void main(String[] args) {
		
		
		String ruta = "ficheros/json/razasComarcasExtremadura.json";
		
		
		try(BufferedReader lector = new BufferedReader(new FileReader(ruta))){
			
			//Almacenamos el contenido del fichero en un StringBuffer
			StringBuilder contenido = new StringBuilder();
			String linea;
			while((linea=lector.readLine())!=null) {
				contenido.append(linea);
			}
			
			Gson gson = new Gson();
			Type listaTipo = new TypeToken<List<Registro>>(){}.getType();
			registros = gson.fromJson(contenido.toString(), listaTipo);
			
			for(Registro registro: registros) {
				System.out.println(registro);
			}
			
			registrarZonas();
			registrarRazas();
			sumarCantidadesRazasPorZona();
			mostrarDatos();
			
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		 
		
		
		

	}

	private static void mostrarDatos() {
		
		for(String nombreZona:zonas.keySet()) {
			Map<String,Integer> zona = zonas.get(nombreZona);
			for(String nombreRaza : zona.keySet()){
				int cantidad = zona.get(nombreRaza);
				System.out.println("Zona:"+nombreZona+
									"-Raza:"+nombreRaza+
										"-Cantidad:"+cantidad);
			}
		}
		
	}

	private static void sumarCantidadesRazasPorZona() {
		for(Registro registro: registros) {
			Map<String,Integer> zona = zonas.get(registro.getZonas());
			int cantidad = registro.getNumero();
			int contador = zona.get(registro.getRaza_ganado());
			zona.put(registro.getRaza_ganado(), contador+cantidad);
			
		}
		
	}

	private static void registrarRazas() {
		
		for(Registro registro: registros) {
			Map<String,Integer> zona = zonas.get(registro.getZonas());
			zona.put(registro.getRaza_ganado(), 0);
		}
		
	}

	private static void registrarZonas() {
		
		for(Registro registro: registros) {
			zonas.put(registro.getZonas(), new HashMap<String, Integer>());
		}
		
		
	}

}




