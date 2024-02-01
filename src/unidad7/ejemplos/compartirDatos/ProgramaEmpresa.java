package unidad7.ejemplos.compartirDatos;

import unidad7.ejemplos.Lector;

public class ProgramaEmpresa {

	public static void main(String[] args) {
		
		Empleado e1= new Empleado(1, "Tomás", "Ventas");
		System.out.println("Nº de empleados creados:"+e1.getContador());
		Empleado e2 = new Empleado(2,"Susana","Administración");
		System.out.println("Nº de empleados creados:"+e2.getContador());
		Empleado e3 = new Empleado(3, "Pedro", "Operaciones");
		System.out.println("Nº de empleados creados:"+e3.getContador());
		Empleado e4 = new Empleado(4, "Juana","RRHH");
		
		System.out.println("Nº de empleados creados:"+Empleado.getContador());
		System.out.println("Nº de empleados creados:"+e1.getContador());
		System.out.println("Nº de empleados creados:"+e2.getContador());
		System.out.println("Nº de empleados creados:"+e4.getContador());
		
		int numero = Lector.leerEntero();
		System.out.println(numero);
		
	}

}
