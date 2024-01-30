package unidad7.ejemplos;

public class ProgramaAlmazara {

	public static void main(String[] args) throws InterruptedException {
		
		
		ProcesoAlmazara[] procesosAlmazara = new ProcesoAlmazara[10];
		
		for(int i=0;i<10;i++) {
			procesosAlmazara [i] = new ProcesoAlmazara();
			System.out.println("PRoceso creado");
		}
		
		for(int i=0;i<10;i++) {
			System.out.println("_____________________");
			procesosAlmazara[i].mostrarDatos();
			Thread.sleep(2000);
		}
		

	}

}
