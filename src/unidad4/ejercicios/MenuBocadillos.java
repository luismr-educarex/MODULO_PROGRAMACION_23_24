package unidad4.ejercicios;

import java.util.Scanner;

public class MenuBocadillos {
    // Variables estáticas para almacenar la cantidad de cada tipo de bocadillo
    static int cantidadBocadilloA = 0;
    static int cantidadBocadilloB = 0;
    static int cantidadBocadilloC = 0;
    static int cantidadBocadilloD = 0;
    final static  double PRECIO_A =3.50 ;
    final static  double PRECIO_B =3.00 ;
    final static  double PRECIO_C =4.00 ;
    final static  double PRECIO_D =3.50 ;
    

    // Función para mostrar el menú de bocadillos
    public static void mostrarMenu() {
        System.out.println("Bienvenido al menú de bocadillos:");
        System.out.println("a. Bocadillo de jamón - 3.50 €");
        System.out.println("b. Bocadillo de queso - 3.00 €");
        System.out.println("c. Bocadillo mixto - 4.00 €");
        System.out.println("d. Bocadillo vegetal - 3.50 €");
        System.out.println("e. Salir");
    }

    // Función para procesar la elección del usuario
    public static void procesarPedido(char opcion) {
        switch (opcion) {
            case 'a':
                cantidadBocadilloA++;
                break;
            case 'b':
                cantidadBocadilloB++;
                break;
            case 'c':
                cantidadBocadilloC++;
                break;
            case 'd':
                cantidadBocadilloD++;
                break;
            default:
                System.out.println("Opción inválida. Por favor, elige entre a, b, c, d o e.");
                break;
        }
    }

    // Función para mostrar el resumen de pedidos
    public static void mostrarResumen(double precioA, double precioB, double precioC, double precioD) {
        double total = 0;
        System.out.println("Resumen de pedidos:");
        if (cantidadBocadilloA > 0) {
            System.out.println("Bocadillo a: " + cantidadBocadilloA + " - " + (precioA * cantidadBocadilloA)+"€");
            total += precioA * cantidadBocadilloA;
        }
        if (cantidadBocadilloB > 0) {
            System.out.println("Bocadillo b: " + cantidadBocadilloB + " - " + (precioB * cantidadBocadilloB)+"€");
            total += precioB * cantidadBocadilloB;
        }
        if (cantidadBocadilloC > 0) {
            System.out.println("Bocadillo c: " + cantidadBocadilloC + " - " + (precioC * cantidadBocadilloC)+"€");
            total += precioC * cantidadBocadilloC;
        }
        if (cantidadBocadilloD > 0) {
            System.out.println("Bocadillo d: " + cantidadBocadilloD + " - " + (precioD * cantidadBocadilloD)+"€");
            total += precioD * cantidadBocadilloD;
        }
        System.out.println("Coste total:" + total +"€");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        char opcion;

        do {
            mostrarMenu();
            System.out.println("Elige una opción:");
            opcion = scanner.next().charAt(0);
            procesarPedido(opcion);
        } while (opcion != 'e');

        mostrarResumen(PRECIO_A, PRECIO_B, PRECIO_C, PRECIO_D);
    }
}
