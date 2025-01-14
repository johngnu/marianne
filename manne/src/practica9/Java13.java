package practica9;

import java.util.Scanner;

/**
 * INF - 111 Verano 2024 Practica 1 - p13
 *
 * @author marianne liz
 */
public class Java13 {

    /* Ejercicio 13 */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa n: ");
        int n = teclado.nextInt();
        int k = 1;
        int c = 0;
        int t = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print(t + ", ");
            c = c + 1;
            if (c == k) {
                k = k + 1;
                c = 0;
                if (t == 0) {
                    t = 1;
                } else {
                    t = 0;
                }
            }
        }
        System.out.println();
    }
}
