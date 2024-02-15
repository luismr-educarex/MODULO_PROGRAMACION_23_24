package unidad8.ejemplos.herenciaObjects;

public class GestionPersonal {

	public static void main(String[] args) {
		
		Persona p1 = new Persona("Manuel");
		Persona p2 = new Persona("Manuel");
		Persona p3 = new Persona("Paco");
		Persona p4 = new Persona("Pedro");
		Persona p5 = new Persona("Ana");
		p1.setLocalidad("Málaga");
		p2.setLocalidad("Berlin");
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		System.out.println(p5);
		
		
		Animal a1 = new Animal();
	
		if(p1.equals(p2)) {
			System.out.println("Son las mismas personas");
		}else {
			System.out.println("No son las mismas personas");
		}
	

	

	}

}
