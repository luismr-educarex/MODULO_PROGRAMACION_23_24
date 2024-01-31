package unidad7.ejemplos.miscelanea;

import java.awt.BorderLayout;
import java.awt.event.WindowEvent;
import java.math.BigDecimal;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Tabla extends JFrame{
	
	private JTable tabla;
	private JScrollPane panel;
	
	public Tabla() {
		initComponents();
		setTitle("Teléfonos");
		setSize(500, 300);
	}
	
	private void initComponents() {
		
		//Datos para la tabla
		Object[][] datos =  new Object[][] {
			{"Usuario 1 ","Coria,Cáceres","93333333",true},
			{"Usuario 2 ","Plasencia,Cáceres","87878787",false},
			{"Usuario 3 ","Mérida,Badajoz","655656565",false},
			{"Usuario 4 ","Zafra,Badajoz","123456789",true}
		};
		
		String[] cabeceras = new String[] {
				"Nombre","Dirección","Teléfono","Casad@"
		};
		
		tabla = new JTable(datos, cabeceras);
		panel = new JScrollPane(tabla);

		getContentPane().add(panel,BorderLayout.CENTER);
	}	
		
		
		public static void main(String args[]) {
			new Tabla().setVisible(true);
		}
		
		
	}


