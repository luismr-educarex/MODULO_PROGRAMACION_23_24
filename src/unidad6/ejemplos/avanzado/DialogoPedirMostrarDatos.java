package unidad6.ejemplos.avanzado;

import javax.swing.JOptionPane;

public class DialogoPedirMostrarDatos {
	public static void main(String[] args) {
		//prompt para introducir el nombre
		String nombre = JOptionPane.showInputDialog("Dime tu nombre");
		String apellidos = JOptionPane.showInputDialog("Apellidos");
		String mensaje = String.format("Bienvenido, %s %s, estás en el módulo de Programación!", nombre,apellidos);
		//Muestra el mensaje de bienvenida con el nombre y apellidos introducidos
		JOptionPane.showMessageDialog(null, mensaje);
	} // fin main
} // fin clase