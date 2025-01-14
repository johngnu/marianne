package practica9;

import java.util.Scanner;

/**
 * INF - 111 Verano 2024 Practica 1 - p12
 *
 * @author marianne liz
 */
public class Java12 {

    /* Ejercicio 12 */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa n: ");
        int n = teclado.nextInt();
        int c = 0;
        int t = 2;
        for (int i = 1; i <= n; i++) {
            System.out.print(t + ", ");
            c = c + 1;
            if (c == 2) {
                c = 0;
                t = t + 2;
            }
        }
        System.out.println();
    }
}
