package practica9;

import java.util.Scanner;

/**
 * INF - 111 Verano 2024 Practica 1 - p17
 *
 * @author marianne liz
 */
public class Java17 {

    /* Ejercicio 17 */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa n: ");
        int n = teclado.nextInt();
        int c = 0;
        int p = 2;
        int t = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(t + ", ");
            if (t == 1) {
                t = p;
            } else {
                if (t == p) {
                    t = -5;
                    p = p + 2;
                } else {
                    t = 1;
                }
            }
        }
        System.out.println();
    }
}
