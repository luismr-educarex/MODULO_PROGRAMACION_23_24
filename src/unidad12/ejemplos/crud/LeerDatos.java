package unidad12.ejemplos.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LeerDatos {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/empresa";
		String usuario = "alumno"; //root
		String password = "admin1234"; //admin.1234
		
		String ciudad="Madrid"; // hemos leido este datos por teclado o por formulario
		
		
		try(Connection con= DriverManager.getConnection(url,usuario,password)){

	
			Statement sentencia = con.createStatement();
			ResultSet resultado = sentencia.executeQuery("SELECT nombre FROM personas WHERE ciudad='"+ciudad+"'");
			while(resultado.next()) {
				System.out.println(resultado.getString("nombre"));
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		

	}

}
