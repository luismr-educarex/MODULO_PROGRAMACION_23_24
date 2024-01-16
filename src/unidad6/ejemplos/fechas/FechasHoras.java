package unidad6.ejemplos.fechas;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Date;



public class FechasHoras {

	public static void main(String[] args) {
		Date fecha = new Date();
		System.out.println(fecha);
		
		//Fechas con LocalDate
		LocalDate fechaActual = LocalDate.now();
		System.out.println(fechaActual);
		Month mes = fechaActual.getMonth();
		System.out.println("Mes:"+mes.getValue());
		System.out.println("Mes:"+fechaActual.getMonthValue());
		System.out.println("Dia:"+fechaActual.getDayOfMonth());
		
		LocalDate fechaPasado = LocalDate.of(2024, 1, 8);
		System.out.println(fechaPasado);
		LocalDate fechaFuturo = fechaActual.plusYears(4);
		System.out.println(fechaFuturo);
		DateTimeFormatter formatoFecha = 
				DateTimeFormatter.ofPattern("MM/yy");
		String fechaFormateada = fechaFuturo.format(formatoFecha);
		System.out.println("Fecha furuta formateada:"+fechaFormateada);
		
		DateTimeFormatter formatoFecha2 = 
				DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate fechaLocal = LocalDate.parse("25-12-2023", formatoFecha2);
		System.out.println(fechaLocal);
		System.out.println("Fecha"+" actual:"+fechaLocal.toString());
		String fechaCadena = fechaLocal.toString();
		fechaCadena += "CADUCIDAD"; 
		System.out.println(fechaCadena);
		System.out.println(fechaLocal.format(formatoFecha2));
		
		
		
		
		//****** HORAS
		LocalTime tiempo = LocalTime.now();
		System.out.println(tiempo);
		System.out.println(tiempo.toString());
		System.out.println("Hora:"+tiempo.getHour());
		System.out.println("Minuto:"+tiempo.getMinute());
		System.out.println(
			"Hora después de tres horas:"+tiempo.plusHours(3).plusMinutes(40).plusMinutes(10));
		
		
		//************ fecha y hora
		System.out.println("__________________");
		LocalDateTime fechaHoraActual = LocalDateTime.now();
		System.out.println(fechaHoraActual);
		
		LocalDateTime fechaHoraRecreo = LocalDateTime.of(2024,1,10,11,15,45);
		System.out.println("Recreo hoy:"+fechaHoraRecreo);
		
		DateTimeFormatter formatoFechaHora = DateTimeFormatter.
				ofPattern("HH:mm:ss");
		
		String fechaHoraCadena =  fechaHoraRecreo
				.format(formatoFechaHora);
		
		System.out.println("Fecha y hora recreo formateada:"+fechaHoraCadena);
		
		
		//****************************
		LocalDateTime inicio = LocalDateTime.now();
		LocalDateTime fin = inicio.plusHours(2).plusMinutes(30);
		Duration duracion = Duration.between(inicio,fin);
		System.out.println(duracion.getSeconds());
		
		
		
		
	}

	
	
	
	
	
	
}
