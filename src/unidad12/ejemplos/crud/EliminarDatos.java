package unidad12.ejemplos.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class EliminarDatos {

	public static void main(String[] args) {
		String url = "jdbc:mysql://192.168.0.101:3306/luismr";
		String usuario = "luismr"; //root
		String password = "luis"; //admin.1234
		
		String dato="3 OR 1";

		try(Connection con= DriverManager.getConnection(url,usuario,password)){

			String sql = "DELETE FROM personas WHERE id="+dato;
			Statement sentencia = con.createStatement();
			
			int filasAfectadas = sentencia.executeUpdate(sql);
			System.out.println("Filas borradas:"+filasAfectadas);
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		

	}

}
