package unidad6.ejemplos.enumerados;

public class TestJuegoCartas {

	public static void main(String[] args) {
		
		JuegoCartas carta1 = new JuegoCartas(JuegoCartas.PALO_CORAZONES, 4);
		System.out.println("La carta 1 es "+carta1.getPuntos()+" de "
				+ ""
				+ carta1.getNombrePalo());
		
		JuegoCartas carta2 = new JuegoCartas(47, 6);
		System.out.println("La carta 2 es "+carta2.getPuntos()+" de "
				+ ""
				+ carta2.getNombrePalo());

	}

}
