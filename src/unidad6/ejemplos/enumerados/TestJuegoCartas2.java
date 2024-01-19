package unidad6.ejemplos.enumerados;

public class TestJuegoCartas2 {

	public static void main(String[] args) {
		
		JuegoCartas2 carta = new JuegoCartas2(Palo.PALO_DIAMANTES, 7);
		
		System.out.println("La carta es el "+carta.getPuntos()+" de "
				+ carta.getNombrePalo());
		
		//Importante: Este código no compilará
		//JuegoCartas2 carta2 = new JuegoCartas2(47, 8);

	}

}
