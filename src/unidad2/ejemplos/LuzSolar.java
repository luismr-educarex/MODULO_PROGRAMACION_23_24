package unidad2.ejemplos;

public class LuzSolar {

	public static void main(String[] args) {
		// Distancia desde el sol (150 million kilometers)
		int kmDesdeSol = 150000000;
		int velocidadLuz = 299792458; // metros por segundo
		// Convertir distancia en metros.
		int mDesdeSol = kmDesdeSol * 1000;
		
		int segundos = mDesdeSol / velocidadLuz;
		System.out.print("La luz tardará  ");
		int min = segundos / 60;
		segundos = segundos - (min * 60);
		System.out.print(min + " minuto(s) y " + segundos + " segundo(s)");
		System.out.println(" en viajar desde el sol a la tierra.");
		
	}

}