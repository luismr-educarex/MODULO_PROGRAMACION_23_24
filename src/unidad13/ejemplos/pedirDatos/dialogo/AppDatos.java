package unidad13.ejemplos.pedirDatos.dialogo;

import javax.swing.JFrame;

public class AppDatos extends JFrame{

	public AppDatos() {
        // Configuración inicial de la ventana
        setTitle("Sistema de Parking");
        setSize(400, 300);
        setVisible(true);
	}
        
	public static void main(String[] args) {
		
		 JFrame frame = new JFrame();
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(300, 200);
	        frame.setVisible(true);
		
		DialogoMatricula dialogo = new DialogoMatricula(frame);
		String dato = dialogo.showDialog();
		System.out.println("Dato:"+dato);

	}

}
