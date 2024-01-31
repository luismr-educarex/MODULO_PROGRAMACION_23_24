package unidad7.ejemplos;

public class Almazara {
	private static final int NUM_PROCESOS_MAX = 10;
	private int id;
	private String localidad;
	private ProcesoAlmazara[]  procesos = new ProcesoAlmazara[NUM_PROCESOS_MAX];

	public Almazara(int id,String localidad) {
		this.id=id;
		this.localidad=localidad;
	}
	
	public Almazara(int id,String localidad,int numeroProcesos) {
		this.id=id;
		this.localidad=localidad;
		if(numeroProcesos<=NUM_PROCESOS_MAX) {
			for(int i=0;i<numeroProcesos;i++) {
				procesos[i]=new ProcesoAlmazara();
			}
		}
		
	}

	public Almazara(int id, String localidad, ProcesoAlmazara[] procesos) {
		super();
		this.id = id;
		this.localidad = localidad;
		this.procesos = procesos;
	}
	
	public void mostrarDatos() {
		System.out.println("Almazara:"+id);
		System.out.println("Localidad:"+localidad);
		mostrarProcesos();
		System.out.println("_______________________");
	}
	
	public void mostrarProcesos() {
		
		for(int i=0;i<NUM_PROCESOS_MAX;i++) {
			if(procesos[i]!=null) {
				procesos[i].mostrarDatos();
				System.out.println("######################");
			}
			
			
		}
}

	public void addProceso(ProcesoAlmazara proceso) {
		
		boolean anadido=false;
		int i=0;
		while(!anadido && i<NUM_PROCESOS_MAX) {
			if(procesos[i]==null) {
				procesos[i]=proceso;
				anadido=true;
			}else {
				i++;
			}
		}
		
	}


}










