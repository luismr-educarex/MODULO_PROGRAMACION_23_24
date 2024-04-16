package unidad11.ejemplos.json;

import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class LeerJson {

	public static void main(String[] args) {
		
		JSONParser parser  = new JSONParser();
		try {
			FileReader lector = new FileReader("ficheros/json/Menu.json");
			Object objeto = parser.parse(lector);
			JSONObject jsonObject = (JSONObject)objeto;

			JSONArray array  = (JSONArray)jsonObject.get("PlatoFuerte");

			for(int i=0;i<array.size();i++){

				JSONObject plato = (JSONObject)array.get(i);
			

				System.out.println(plato);

				String nombre = (String) plato.get("nombre");
				String precio = (String) plato.get("precio");

				System.out.println("Nombre:"+nombre);
				System.out.println("Precio:"+precio);

			}


		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}








