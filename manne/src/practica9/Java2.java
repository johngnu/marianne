package practica9;

import java.util.Scanner;

/**
 * INF - 111 Verano 2024 Practica 1 - p2
 *
 * @author marianne liz
 */
public class Java2 {

    /* Ejercicio 2 */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("tamaño archivo: ");
        float m = teclado.nextFloat();
        System.out.println("velocidad de descarga: ");
        float v = teclado.nextFloat();

        float k = m * 1024;
        float b = k * 1024;
        float bit = b * 8;
        float kb = bit / 1024;
        float mb = kb / 1024;
        float t = mb / v;

        System.out.println("tiempo: " + t + " segundos");
    }
}
