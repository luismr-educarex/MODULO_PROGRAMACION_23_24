package unidad8.ejemplos.herencia;

public class Concesionario {

	public static void main(String[] args) {
	
		Motor motorCoche = new Motor("Diesel",2000,150);
	
		Coche coche = new Coche("8765-KWH",
				"9287339872SFAD98432",
				"Lancia",
				"Stratos",
				motorCoche,
				3,
				4,
				80,
				"rally");
		
		Motor motorMoto = new Motor("Gasolina",1500,80);
		Moto moto = new Moto("1234-GHD",
				"2W43984723ASDFSF",
				"Yamaha",
				"Virago",
				motorMoto,
				false,
				"Custom");
	
		coche.mostrarDatos();
		moto.mostrarDatos();
		
	}

}



