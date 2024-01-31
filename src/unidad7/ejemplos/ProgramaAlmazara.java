package unidad7.ejemplos;

public class ProgramaAlmazara {
	
	public static final int NUM_PROCESOS = 10;

	public static void main(String[] args) throws InterruptedException  {
		
		
		ProcesoAlmazara[] procesosAlmazara = new ProcesoAlmazara[NUM_PROCESOS];
		
		for(int i=0;i<NUM_PROCESOS;i++) {
			procesosAlmazara [i] = new ProcesoAlmazara();
			System.out.println("Proceso creado");
		}
		
		for(int i=0;i<NUM_PROCESOS;i++) {
			System.out.println("_____________________");
			procesosAlmazara[i].mostrarDatos();
			Thread.sleep(3000);
		}
		

	}

}






