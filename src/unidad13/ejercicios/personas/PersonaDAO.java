package unidad13.ejercicios.personas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PersonaDAO {
	
	public void insertarPersona(Persona persona) {
		
		String url = "jdbc:mysql://192.168.0.101:3306/luismr";
		String usuario = "luismr"; //root
		String password = "luis"; //admin.1234
		
		try(Connection con= DriverManager.getConnection(url,usuario,password)){

			String sql = "INSERT INTO personas (nombre,apellido,ciudad)"
					+ "VALUES (?,?,?)";
			PreparedStatement sentencia = con.prepareStatement(sql);
			
			sentencia.setString(1,persona.getNombre());
			sentencia.setString(2,persona.getApellido());
			sentencia.setString(3,persona.getCiudad());

			int filasAfectadas = sentencia.executeUpdate();
			System.out.println("Filas insertadas:"+filasAfectadas);
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}

}
