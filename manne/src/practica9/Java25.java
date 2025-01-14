package practica9;

import java.util.Scanner;

/**
 * INF - 111 Verano 2024 Practica 1 - p25
 *
 * @author marianne liz
 */
public class Java25 {

    /* Ejercicio 25 */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese N y k: ");
        int n = teclado.nextInt();
        int k = teclado.nextInt();
        int dig = 0;
        int c = 0;
        while (n > 0) {
            c = c + 1;
            if (c == k) {
                dig = n % 10;
            }
            n = n / 10;
        }

        System.out.println("Digitos: " + c + ", k-ésimo: " + dig);
    }
}
