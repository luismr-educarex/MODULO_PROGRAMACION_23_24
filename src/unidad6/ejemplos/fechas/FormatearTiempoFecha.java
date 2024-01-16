package unidad6.ejemplos.fechas;

import java.util.Calendar;
import java.util.Formatter;

public class FormatearTiempoFecha {

	public static void main(String[] args) {
		Formatter fmt = new Formatter();
		Calendar cal = Calendar.getInstance();
		// Muestra el formato estándar de tiempo 12-horas.
		fmt.format("%tr", cal);
		System.out.println(fmt);
		// Muetra información completa de fecha y hora
		fmt = new Formatter();
		fmt.format("%tc", cal);
		System.out.println(fmt);
		// Muestra sólamente la hora y los minutos
		fmt = new Formatter();
		fmt.format("%tl:%tM", cal, cal);
		System.out.println(fmt);
		// Muestra el nombre y número del mes
		fmt = new Formatter();
		fmt.format("%tB %tb %tm", cal, cal, cal);
		System.out.println(fmt);

	}

}
