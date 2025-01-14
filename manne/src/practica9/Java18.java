package practica9;

import java.util.Scanner;

/**
 * INF - 111 Verano 2024 Practica 1 - p18
 *
 * @author marianne liz
 */
public class Java18 {

    /* Ejercicio 18 */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa n: ");
        int n = teclado.nextInt();
        while (n >= 0) {
            System.out.print(n + ", ");
            n = n - 5;
        }
        System.out.println();
    }
}
