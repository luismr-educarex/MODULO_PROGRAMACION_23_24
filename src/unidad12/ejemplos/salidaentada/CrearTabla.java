package unidad12.ejemplos.salidaentada;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;



public class CrearTabla {

	static Properties props = new Properties();
	static String[] cabecera ;
	
	public static void main(String[] args) {
		
		cabecera = new String[] {"ID","NOMBRE","APELLIDO","CIUDAD"};
		
		String[][] datos = recuperarListadoPersonas();
		
		String titulo = "Empleados";
		
		new Tabla(datos,cabecera,titulo).setVisible(true);

	}
	
	public static String[][] recuperarListadoPersonas() {
		
		//cargar fichero de propiedades
				cargarPropiedades();
				//reading property
				String url = props.getProperty("url");
				String user = props.getProperty("user");
				String password = props.getProperty("password");
				
				String[][] datos = null;
				
				try {
					RowSetFactory rowSetFactory = RowSetProvider.newFactory();
					
					JdbcRowSet rowSet = rowSetFactory.createJdbcRowSet();
					
					rowSet.setUrl(url);
					rowSet.setUsername(user);
					rowSet.setPassword(password);
					
					rowSet.setCommand("SELECT * FROM personas");
					rowSet.execute();
					
					//Obtener el número de filas que nos devuelve la sentencia
					int numFilas = 0;
					if(rowSet.last()) {
						numFilas = rowSet.getRow();
						rowSet.beforeFirst(); // Regresa el cursor a la primera posición
					}
					
					
					datos = new String[numFilas][cabecera.length];
					
					int contadorFila=0;
					while(rowSet.next()) {
						String[] fila = new String[cabecera.length];
						fila[0] = String.valueOf(rowSet.getInt("id"));
						fila[1] = rowSet.getString("nombre");
						fila[2] = rowSet.getString("apellido");
						fila[3] = rowSet.getString("ciudad");
						
						datos[contadorFila]= fila;
						contadorFila++;
					}
					
					
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				return datos;
		
	}
	
	public static void cargarPropiedades(){
			
			FileInputStream fis;
			try {
				fis = new FileInputStream(Constantes.ficheroPropiedades);
				
				 //loading properties from a property file
			    props.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

}
