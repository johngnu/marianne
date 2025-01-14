package practica9;

import java.util.Scanner;

/**
 * INF - 111 Verano 2024 Practica 1 - p1
 *
 * @author marianne liz
 */
public class Java1 {

    /* Ejercicio 1 */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("distancia en kilómetros: ");
        float d = teclado.nextFloat();
        System.out.println("velocidad en kilómetros por hora: ");
        float v = teclado.nextFloat();
        float t = d / v;
        System.out.println("tiempo que tardará en recorrer la distancia en horas: " + t);
    }

}
