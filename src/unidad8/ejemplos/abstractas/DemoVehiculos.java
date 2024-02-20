package unidad8.ejemplos.abstractas;

import javax.swing.JOptionPane;

public class DemoVehiculos {

	public static void main(String[] args) {
		
		Velero velero = new Velero();
		Bicicleta bici  = new Bicicleta();
		
		velero.saludo();
		bici.saludo();
		
		JOptionPane.showMessageDialog(null, 
				"\nDescrición vehículo:\n"+
				velero.toString()+"\n"+
				bici.toString());
		

	}

}
