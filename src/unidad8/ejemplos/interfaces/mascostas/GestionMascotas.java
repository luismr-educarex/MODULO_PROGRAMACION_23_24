package unidad8.ejemplos.interfaces.mascostas;

public class GestionMascotas {

	public static void main(String[] args) {
		
		Mascota garfield = new Gato(Sexo.MACHO,"8383");
		Mascota lisa = new Gato(Sexo.HEMBRA,"siberiano","9872");
		Mascota kuki = new Perro(Sexo.HEMBRA,"5566");
		Mascota ayo = new Perro(Sexo.MACHO,"2222");
		
		System.out.println(garfield.getCodigo());
		System.out.println(lisa.getCodigo());
		System.out.println(kuki.getCodigo());
		System.out.println(ayo.getCodigo());
		
		garfield.come("pescado");
		System.out.println("______________");
		lisa.come("hambuerguesa");
		System.out.println("______________");
		kuki.come("pescado");
		System.out.println("______________");
		lisa.peleaCon((Gato)garfield);
		System.out.println("______________");
		garfield.peleaCon((Perro)ayo);
		System.out.println("______________");
		ayo.peleaCon((Perro)kuki);
		
		System.out.println(garfield);
		System.out.println(lisa.toString());
		
	}
}
