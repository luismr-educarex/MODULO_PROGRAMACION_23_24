package unidad13.ejemplos.pedirDatos;

import javax.swing.JFrame;

public class AppDatos extends JFrame{

	public AppDatos() {
        // Configuración inicial de la ventana
        setTitle("Sistema de Parking");
        setSize(400, 300);
        setVisible(true);
	}
        
	public static void main(String[] args) {
		
		DialogoMatricula dialogo = new DialogoMatricula(this);
		String dato = dialogo.showDialog();
		System.out.println("Dato:"+dato);

	}

}
