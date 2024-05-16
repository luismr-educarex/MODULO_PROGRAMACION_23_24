package unidad13.ejemplos.pedirDatos.dialogo;

import javax.swing.JFrame;

public class AppDatos extends JFrame{

	public AppDatos() {
        
	}
        
	public static void main(String[] args) {
		
		 JFrame frame = new JFrame();
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(300, 200);
	        frame.setVisible(true);
		
		DialogoMatricula dialogo = new DialogoMatricula(frame);
		String dato = dialogo.mostrarDialogo();
		System.out.println("Dato:"+dato);

	}

}
