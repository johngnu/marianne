package practica9;

import java.util.Scanner;

/**
 * INF - 111 Verano 2024 Practica 1 - p3
 *
 * @author marianne liz
 */
public class Java3 {

    /* Ejercicio 3 */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese grados f: ");
        float f = teclado.nextFloat();

        float c = (f - 32) / 1.8f;
        System.out.println("Grados centigrados: " + c);
    }
}
