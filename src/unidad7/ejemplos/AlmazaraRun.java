package unidad7.ejemplos;

public class AlmazaraRun {

	public static void main(String[] args) {
		
		Almazara a1 = new Almazara(1, "Coria");
		Almazara a2 = new Almazara(
				2, "Navalmoral de la Mata", 3);

		ProcesoAlmazara p1 = new ProcesoAlmazara();
		Cliente c1  = new Cliente("838383CFD","Raúl",true);
		
		p1.setCliente(c1);
		
		
		a1.mostrarDatos();
		a2.mostrarDatos();
		
		System.out.println("////////////////////////////////////");
		
		a1.addProceso(p1);
		a1.mostrarDatos();
		
	}

}









