package unidad8.ejemplos.abstractas;

import java.util.Scanner;

public class Bicicleta extends Vehiculo{

	static Scanner entrada = new Scanner(System.in);
	
	public Bicicleta() {
		super("Una persona",2);
		setPrecio();
	}
	
	@Override
	public void setPrecio() {
		
		final int MAX = 3000;
		System.out.println("Introduzca un precio para la bicicleta:");
		precio = entrada.nextInt();
		if(precio>MAX) {
			precio = MAX;
		}
		if(precio < 0 ) {
			precio =0;
		}
	}
	
	@Override
	public String toString() {
		
		String salida ="La bici tiene como fuente de alimentación:"+getFuenteAlimentación()+"\n"
				+"Tiene "+getRuedas()+" ruedas\n"
				+"Coste de "+precio+"€";
		
		return salida;
	}
	
	@Override
	public double calcEficienciaCarburante() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calcDistanciaViaje() {
		// TODO Auto-generated method stub
		return 0;
	}

}
