package unidad12.ejemplos.ferreteria;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class ProductoDAO {
	
	private String jdbcURL="" ;
	private String jdbcUser = "";
	private String jdbcPass = "";
	private Connection jdbcConnection;
	
	
	public ProductoDAO(String jdbcURL, String jdbcUser, String jdbcPass) {
		super();
		this.jdbcURL = jdbcURL;
		this.jdbcUser = jdbcUser;
		this.jdbcPass = jdbcPass;
		
	}


	public boolean insertProducto(Producto producto) {
		
		String sql = "INSERT INTO productos(codigo,nombre,descripcion,precio)"
				+ "VALUES (?,?,?,?)";
		boolean filaInsertada = false;
		//conectarnos a la base de datos
		conectar();
		
		try {
			PreparedStatement sentenciaPreparada = jdbcConnection.prepareStatement(sql);
			sentenciaPreparada.setString(1, producto.getCodigo());
			sentenciaPreparada.setString(2, producto.getNombre());
			sentenciaPreparada.setString(3, producto.getDescripcion());
			sentenciaPreparada.setDouble(4, producto.getPrecio());
			
			filaInsertada = sentenciaPreparada.executeUpdate() > 0;
			sentenciaPreparada.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		//nos desconectamos de la base de datos
		desconectar();
		
		return filaInsertada;
	}
	
	
	public List<Producto> listarTodosLosProductos(){
		return null;
		
		
	}
	
	public boolean eliminarProducto(Producto producto) {
		return false;
	}
	
	public boolean actualizarProducto(Producto producto) {
		return false;
	}
	
	public Producto obtenerProducto(String codigo) {
		return null;
	}


	private void desconectar() {
		try {
			if(jdbcConnection!=null && !jdbcConnection.isClosed()) {
				jdbcConnection.close();
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

	private void conectar() {
		
		try {
			if(jdbcConnection==null || jdbcConnection.isClosed()) {
				jdbcConnection = DriverManager.getConnection(jdbcURL,jdbcUser,jdbcPass);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	
}
