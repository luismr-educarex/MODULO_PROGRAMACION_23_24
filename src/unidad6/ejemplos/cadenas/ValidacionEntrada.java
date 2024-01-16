package unidad6.ejemplos.cadenas;

public class ValidacionEntrada {
	// valida el primer nombre
	//La primera letra en mayúsculas y a continuación 0 o cualquier número de letras tanto en mayúsculas como en minúsculas
	public static boolean validarPrimerNombre(String primerNombre) {
		return primerNombre.matches("[A-Z][a-zA-Z]*");
	} 

	// valida el apellido
	public static boolean validarApellidoPaterno(String apellidoPaterno) {
		return apellidoPaterno.matches("[A-Z][a-zA-Z]*");
	} 

	// valida la dirección
	// \\s+: Coincide con uno o más espacios en blanco.
	// ([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+\\d+)
	public static boolean validarDireccion(String direccion) {
		return direccion.matches("\\s+([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+ \\d+)");
	} 

	// valida la ciudad
	public static boolean validarCiudad(String ciudad) {
		return ciudad.matches("([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");
	} 

	public static boolean validarEstado(String estado) {
		return estado.matches("([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");
	}

	// valida el código postal
	public static boolean validarCP(String cp) {
		return cp.matches("\\d{5}");
	} 

	// valida el teléfono
	public static boolean validarTelefono(String telefono) {
		return telefono.matches("[1-9]\\d{2}-[1-9]\\d{2}-\\d{4}");
	} 
} // fin de la clase ValidacionEntrada