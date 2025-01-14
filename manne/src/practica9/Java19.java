package practica9;

import java.util.Scanner;

/**
 * INF - 111 Verano 2024 Practica 1 - p19
 *
 * @author marianne liz
 */
public class Java19 {

    /* Ejercicio 19 */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa n: ");
        int n = teclado.nextInt();
        int p = 2;
        for (int i = 1; i <= n; i++) {
            System.out.print(p + ", ");
            p = p + 1;
            int ep = 0;
            while (ep == 0) {
                int cd = 0;
                for (int k = 1; k <= p; k++) {
                    if (p % k == 0) {
                        cd = cd + 1;
                    }
                }
                if (cd == 2) {
                    ep = 1;
                } else {
                    p = p + 1;
                }
            }
        }
        System.out.println();
    }
}
