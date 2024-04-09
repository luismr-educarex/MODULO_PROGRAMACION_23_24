package unidad11.ejemplos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Series {

	public static void main(String[] args) {
		
		Map<String,Map> series = new HashMap<String, Map>();
		
		Map<String,List> personajes1 = new HashMap<String, List>();
		Map<String,List> personajes2 = new HashMap<String, List>();
		
		List<String> personajesPP_S1  = new ArrayList<String>();
		List<String> personajesPS_S1  = new ArrayList<String>();
		
		personajesPP_S1.add("Fulanito");
		personajesPP_S1.add("Menganito");
		personajesPS_S1.add("Paquito");
		personajesPS_S1.add("Suspensos");
		
		List<String> personajesPP_S2  = new ArrayList<String>();
		List<String> personajesPS_S2  = new ArrayList<String>();
		
		personajesPP_S2.add("Fulanita");
		personajesPP_S2.add("Menganita");
		personajesPS_S2.add("Paquita");
		personajesPS_S2.add("Suspensas");
		
		
		personajes1.put("pp", personajesPP_S1);
		personajes1.put("ps", personajesPS_S1);
		
		personajes2.put("pp", personajesPP_S2);
		personajes2.put("ps", personajesPS_S2);
		
		series.put("serie1", personajes1);
		series.put("serie2", personajes2);
		
		Set nombresSeries = series.keySet();
		
		List personajesP = (List)series.get("serie1").get("pp");
		List personajesS = (List)series.get("serie1").get("ps");
		
		


	}

}
