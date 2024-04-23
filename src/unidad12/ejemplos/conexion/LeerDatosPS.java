package unidad12.ejemplos.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LeerDatosPS {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/empresa";
		String usuario = "alumno"; //root
		String password = "admin1234"; //admin.1234
		
		String ciudad="Madrid"; // hemos leido este datos por teclado o por formulario
		
		
		try(Connection con= DriverManager.getConnection(url,usuario,password)){

			String sql = "SELECT nombre FROM personas WHERE id>=? AND ciudad=?";
			PreparedStatement sentencia = con.prepareStatement(sql);
			
			sentencia.setInt(1, 2);
			sentencia.setString(2, "Sevilla");
			
			ResultSet resultado = sentencia.executeQuery();
			while(resultado.next()) {
				System.out.println(resultado.getString("nombre"));
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		

	}

}
