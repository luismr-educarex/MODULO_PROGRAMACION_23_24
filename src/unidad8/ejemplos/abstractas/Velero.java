package unidad8.ejemplos.abstractas;

import java.util.Scanner;

public class Velero extends Vehiculo{

	static Scanner entrada = new Scanner(System.in);
	private int longitud;
	
	public Velero() {
		super("viento",0);
		setLongitud();
		setPrecio();
		
	}
	
	
	public int getLongitud() {
		return longitud;
	}


	public void setLongitud() {
		System.out.println("Introduzca una longitud para el velero:");
		longitud = entrada.nextInt();
	}
	@Override
	public void setPrecio() {
		
		final int MAX = 10000;
		System.out.println("Introduzca un precio para el velero:");
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
		
		String salida ="Longitud:"+longitud+"\n"
				+"El velero tiene como fuente de alimentación:"+getFuenteAlimentación()+"\n"
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
