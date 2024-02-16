package unidad8.ejemplos.interfaces.mascostas;

public class Animal {

	private Sexo sexo;
	

	public Animal() {
		sexo = Sexo.HEMBRA;
	}
	
	public Animal(Sexo sexo) {
		this.sexo = sexo;
	}
	
	public Sexo getSexo() {
		return sexo;
	}
	
	@Override
	public String toString() {
		
		return "Sexo:"+this.sexo+"\n";
	}
	
	public void duerme() {
		System.out.println("Zzzzzzz");
	}
	
	
	
	
}
