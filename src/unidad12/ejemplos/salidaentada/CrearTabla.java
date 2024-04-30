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
	
	
	public static void main(String[] args) {
		
		recuperarListadoPersonas();

	}
	
	public static void recuperarListadoPersonas() {
		
		//cargar fichero de propiedades
				cargarPropiedades();
				//reading property
				String url = props.getProperty("url");
				String user = props.getProperty("user");
				String password = props.getProperty("password");
				
				try {
					RowSetFactory rowSetFactory = RowSetProvider.newFactory();
					
					JdbcRowSet rowSet = rowSetFactory.createJdbcRowSet();
					
					rowSet.setUrl(url);
					rowSet.setUsername(user);
					rowSet.setPassword(password);
					
					rowSet.setCommand("SELECT * FROM personas");
					rowSet.execute();
					
					while(rowSet.next()) {
						System.out.println("PERSONA");
						System.out.println(rowSet.getInt("id"));
						System.out.println(rowSet.getString("nombre"));
						System.out.println(rowSet.getString("apellido"));
						System.out.println(rowSet.getString("ciudad"));
						System.out.println("_________________");
					}
					
					
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
		
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
