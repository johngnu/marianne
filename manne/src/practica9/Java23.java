package practica9;

import java.util.Scanner;

/**
 * INF - 111 Verano 2024 Practica 1 - p23
 *
 * @author marianne liz
 */
public class Java23 {

    /* Ejercicio 23 */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa n: ");
        int n = teclado.nextInt();

        float s = 0;
        for (float i = 1; i <= n; i++) {
            s = s + (2 * i) / 5;
        }
        System.out.println("suma: " + s);
    }
}
