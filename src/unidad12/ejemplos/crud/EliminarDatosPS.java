package unidad12.ejemplos.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import java.sql.SQLException;

public class EliminarDatosPS {

	public static void main(String[] args) {
		String url = "jdbc:mysql://192.168.0.101:3306/luismr";
		String usuario = "luismr"; //root
		String password = "luis"; //admin.1234
		
		try(Connection con= DriverManager.getConnection(url,usuario,password)){

			String sql = "DELETE FROM personas WHERE id=?";
			PreparedStatement sentencia = con.prepareStatement(sql);
			
			sentencia.setInt(1,3);

			int filasAfectadas = sentencia.executeUpdate();
			System.out.println("Filas borradas:"+filasAfectadas);
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		

	}

}
