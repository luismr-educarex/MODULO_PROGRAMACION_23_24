package unidad7.ejemplos;

import java.text.DecimalFormat;
import java.util.Random;

public class DemoAlmazara {

    public static void main(String[] args) {
        // Generar aleatoriamente la cantidad inicial de aceitunas (entre 800 y 1200 kg)
        double pesoAceitunas = generarCantidadAleatoria(800, 1200);

        // Porcentajes aleatorios
        double porcentajeLimpieza = generarPorcentajeAleatorio(0.9, 0.95);
        double porcentajeMolturacion = generarPorcentajeAleatorio(0.9, 0.95);
        double porcentajeExtraccion = generarPorcentajeAleatorio(0.2, 0.25);
        double porcentajeFiltracion = generarPorcentajeAleatorio(0.95, 0.98);

        // Fases del proceso
        double pesoLimpio = aplicarPorcentaje(pesoAceitunas, porcentajeLimpieza);
        double pesoMolturado = aplicarPorcentaje(pesoLimpio, porcentajeMolturacion);
        double aceiteExtraido = aplicarPorcentaje(pesoMolturado, porcentajeExtraccion);
        double aceiteFiltrado = aplicarPorcentaje(aceiteExtraido, porcentajeFiltracion);

        DecimalFormat formato = new DecimalFormat("0.00");
        
        // Resultados
        System.out.println("Peso inicial de aceitunas: " +   formato.format(pesoAceitunas)  + " kg");
        System.out.println("Peso después de la limpieza: " + formato.format(pesoLimpio) + " kg");
        System.out.println("Peso después de la molturación: " + formato.format(pesoMolturado) + " kg");
        System.out.println("Aceite extraído: " + formato.format(aceiteExtraido) + " litros");
        System.out.println("Aceite después de la filtración: " + formato.format(aceiteFiltrado) + " litros");
    }

    // Genera una cantidad aleatoria dentro de un rango dado
    private static double generarCantidadAleatoria(double min, double max) {
        Random random = new Random();
        return min + (max - min) * random.nextDouble();
    }

    // Genera un porcentaje aleatorio dentro de un rango dado
    private static double generarPorcentajeAleatorio(double min, double max) {
        Random random = new Random();
        return min + (max - min) * random.nextDouble();
    }

    // Aplica un porcentaje a una cantidad dada
    private static double aplicarPorcentaje(double cantidad, double porcentaje) {
        return cantidad * porcentaje;
    }
}
