package unidad8.ejemplos.interfaces.mascostas;

public class Gato extends Animal implements Mascota{
	
	private String codigo;
	private String raza;
	
	public Gato(Sexo sexo,String raza,String codigo) {
		super(sexo);
		this.raza=raza;
		this.codigo=codigo;
	}
	public Gato(Sexo sexo, String codigo) {
		super(sexo);
		this.codigo=codigo;
		raza="siamés";
	}
	public Gato(String codigo) {
		super(Sexo.HEMBRA);
		this.codigo=codigo;
		raza="siamés";
	}
	
	@Override
	public String getCodigo() {
		return codigo;
	}
	@Override
	public void hacerRuido() {
		this.maullar();
		this.ronronea();
		
	}
	private void ronronea() {
		System.out.println("mrrrrrrrrr");		
	}
	private void maullar() {
		System.out.println("Miauuuuuu");
		
	}
	@Override
	public void come(String comida) {
		if("pescado".equals(comida)) {
			System.out.println("Ummmm, gracias");
			ronronea();
		}else {
			System.out.println("Lo siento, yo solo como pescado");
			maullar();
		}
		
	}
	@Override
	public void peleaCon(Animal contrincante) {
		
		if(this.getSexo()==Sexo.HEMBRA) {
			System.out.println("No me gusta pelear");
		}else if(contrincante.getSexo()==Sexo.HEMBRA) {
			System.out.println("No peleo contra gatitas,salvo si es por comida");
		}else {
			System.out.println("Ven aquí que te vas a enterar");
		}
	}
	
	public String toString() {
		return super.toString()+
		"Raza:"+this.raza+"\n__________";

				
	}

}
