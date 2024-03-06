package unidad9.ejemplos.eventos;

import java.util.List;

public class SistemaGestionEventos {

	public static void main(String[] args) {
		
		Evento evento = new Evento("Charla GO", null, 2);
				
		evento.registrarAsistente("Sid");
		List asistentesEvento =  evento.obtenerListaAsistentes();

	}

}
