package unidad7.ejemplos;

public class AplicacionTaller {

	public static void main(String[] args) {
		
		Coche coche1 = new Coche();
		Coche coche2 = new Coche("WAUBGAFB2AN013725","Chevrolet","Silverado 2500");
		Coche coche3 = new Coche("1C4SDHCTXDC202222","Audi","200",1989);
		Coche coche4 = new Coche("1N6AA0ED1FN538910","Mazda","CX5",2020,"Azul");
		Motor motorRenault = new Motor();
		motorRenault.setNombre("MR2024");
		motorRenault.setCilindrada(2200);
		motorRenault.setPotencia(220);
		motorRenault.setTipo_motor(1);
		
		coche1.setMotor(motorRenault);
		coche2.setMotor(motorRenault);
		coche3.setMotor(motorRenault);

		
		
		mostrarDatosCoche(coche1);
		mostrarDatosCoche(coche2);
		mostrarDatosCoche(coche3);
		mostrarDatosCoche(coche4);
		
		System.out.println("####################################3");
		
		System.out.println(coche1.toString());
		System.out.println(coche2.toString());
		System.out.println(coche3.mostraDatos());
		System.out.println(coche4.mostraDatos());
	}
	
	private static void mostrarDatosCoche(Coche coche) {
		String informacion = "";
	  	
	  	informacion = "Información coche____________\n";
	  	informacion = informacion + "Bastidor:"+coche.getBastidor()+"\n";
	  	informacion +="Marca:"+coche.getMarca()+"\n";
	  	informacion +="Modelo:"+coche.getModelo()+"\n";
	  	
	  	System.out.println(informacion);
	}

}




