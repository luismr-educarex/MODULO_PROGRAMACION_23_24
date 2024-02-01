package unidad7.ejemplos.miscelanea;

import java.awt.BorderLayout;

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
		String[][] datos =  new String[][] {
			{"Usuario 1 ","Coria,Cáceres","93333333","Sí"},
			{"Usuario 2 ","Plasencia,Cáceres","87878787","No"},
			{"Usuario 3 ","Mérida,Badajoz","655656565","No"},
			{"Usuario 4 ","Zafra,Badajoz","123456789","Sí"}
		};
		//Usando un array de Objects
		/*Object[][] datos =  new Object[][] {
			{"Usuario 1 ","Coria,Cáceres","93333333","Sí"},
			{"Usuario 2 ","Plasencia,Cáceres","87878787","No"},
			{"Usuario 3 ","Mérida,Badajoz","655656565","No"},
			{"Usuario 4 ","Zafra,Badajoz","123456789","Sí"}
		};*/
		
		String[] cabeceras = new String[] {
				"Nombre","Dirección","Teléfono","Casad@"
		};
		
		tabla = new JTable(datos, cabeceras);
		panel = new JScrollPane(tabla);

		getContentPane().add(panel,BorderLayout.CENTER);
	}	
		
		
		
	}


