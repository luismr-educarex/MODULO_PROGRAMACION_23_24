package unidad12.ejemplos.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ObtenerConexion {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/empresa";
		String usuario = "alumno"; //root
		String password = "admin1234"; //admin.1234
		
		
		try(Connection con= DriverManager.getConnection(url,usuario,password)){

			System.out.println(con);
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		

	}

}
