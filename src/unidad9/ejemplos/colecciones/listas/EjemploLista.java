package unidad9.ejemplos.colecciones.listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploLista {
	
	public static void main(String[] args) {
		
		List al1 = new ArrayList();
		List al2 = new ArrayList(10);
		List al3 = new ArrayList(al1);
		List<String> al4 = new ArrayList<String>();
		List<String> al5 = new ArrayList<String>(Arrays.asList("A","B","C"));
		
		
		Usuario usuario1 = new Usuario(1, "Pedro");
		Usuario usuario2 = new Usuario(2, "Susana");
		Usuario usuario3 = new Usuario(3, "Amparo");
		
		List<Usuario> usuarios = new ArrayList<Usuario>();
		
		usuarios.add(usuario1);
		usuarios.add(usuario2);
		usuarios.add(usuario3);
		
		System.out.println("Usuarios");
		System.out.println(usuarios);
		
		
		List<Usuario> listUsuarios = new ArrayList<Usuario>();
		listUsuarios.addAll(usuarios);
		System.out.println("List Usuarios");
		System.out.println(listUsuarios);
		
		List<Usuario> listEmpleados = new ArrayList<Usuario>(10);
		
		Usuario usuario4 = new Usuario(4, "Antonio");
		Usuario usuario5 = new Usuario(5, "Moises");
		Usuario usuario6 = new Usuario(6, "Laura");
		
		listEmpleados.add(usuario4);
		listEmpleados.add(usuario5);
		listEmpleados.add(usuario6);
		
		System.out.println("List Empleados");
		System.out.println(listEmpleados);
		
		listEmpleados.addAll(1, listUsuarios);
		
		System.out.println("List Empleados +");
		System.out.println(listEmpleados);
		
		Usuario usuario7 = new Usuario(7, "Amor");
		listEmpleados.add(2, usuario7);
		
		System.out.println("List Empleados ++");
		System.out.println(listEmpleados);
		
		listEmpleados.remove(usuario5);
		System.out.println("List Empleados - elemento usuario5");
		System.out.println(listEmpleados);
		
		listEmpleados.remove(3);
		System.out.println("List Empleados - elemento posición 3");
		System.out.println(listEmpleados);
		
		
		Usuario usuario8 = new Usuario(8, "Serapio");
		listEmpleados.set(3, usuario8);
		System.out.println("List Empleados <-> elemento posición 3");
		System.out.println(listEmpleados);
		
		
		listEmpleados.clear();
		System.out.println("List Empleados ### LIMPIEZA");
		System.out.println(listEmpleados);
		
		
		
		
	}
	
	
	
	
	
}





