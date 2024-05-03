package unidad13.ejemplos.pedirDatos;

import javax.swing.JOptionPane;

public class DialogoPedirDatos {
	
	public static void main(String[] args) {
		
		String nombre = JOptionPane.showInputDialog("Dame el nombre");
		String apellido = JOptionPane.showInputDialog("Dame el apellido");
		String ciudad = JOptionPane.showInputDialog("Dame la ciudad");
		
		String mensaje = String.format("Bienvenido, "
				+ "%s %s estás en la ciudad de %s", nombre,apellido,ciudad);
		
		JOptionPane.showMessageDialog(null, mensaje);
	}

}
