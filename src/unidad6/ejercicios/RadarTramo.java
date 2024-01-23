package unidad6.ejercicios;

import java.util.Scanner;

public class RadarTramo {
	
	public static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		
		 		
		 double distancia= entrada.nextDouble();
		 double vel_max_permitida=entrada.nextDouble();; //Velocidad máxima permitida km/h
		 double tiempo=entrada.nextDouble();; //s
		 double vel_media=0;
		 boolean haSuperadoVelocidadMax;
		 double porcentajeSuperado;
		 
		 if(distancia<0 || vel_max_permitida<0 || tiempo<=0) {
			 System.out.println("ERROR");
		 }else {
			 
			 vel_max_permitida = vel_max_permitida/3.6; // m/s
			 //Calcular la velocidad media
			 vel_media = distancia/tiempo;
			 
			 haSuperadoVelocidadMax = vel_media>vel_max_permitida;
			 
			 porcentajeSuperado = ((vel_media-vel_max_permitida)/vel_max_permitida)*100;
			 
			 if(!haSuperadoVelocidadMax) {
				 System.out.println("OK");
			 }else if(porcentajeSuperado<20) {
				 System.out.println("MULTA");
			 }else {
				 System.out.println("PUNTOS");
			 }
			 
		 }
		 
		 
		 

	}

}







