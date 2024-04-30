package unidad13.botones;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;



public class Botones extends JFrame{

	private Button boton1,boton2,boton3,boton4;
	
	
	
	public Botones() {
	
		setTitle("ventana con botones");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 200);
		
		boton1 = new Button("ALTA EMPLEADO");
		boton2 = new Button("BAJA EMPLEADO");
		boton3 = new Button("MODIFIAR EMPLEADO");
		boton4 = new Button("LISTAR EMPLEADOS");
		
		JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
		
		panel.add(boton1);
		panel.add(boton2);
		panel.add(boton3);
		panel.add(boton4);
		
		getContentPane().add(panel);
		
		setVisible(true);
		
	}



	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			
			public void run() {
				new Botones();
			}
		});

	}

}
