package practica9;

import java.util.Scanner;

/**
 * INF - 111 Verano 2024 Practica 1 - p15
 *
 * @author marianne liz
 */
public class Java15 {

    /* Ejercicio 15 */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa n: ");
        int n = teclado.nextInt();
        int c = 0;
        int f = 1;
        int k = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(((i - 1) * f) + ", ");
            c = c + 1;
            if (c == k) {
                if (k == 1) {
                    k = 2;
                    f = -1;
                } else {
                    k = 1;
                    f = 1;
                }
                c = 0;
            }
        }
        System.out.println();
    }
}
