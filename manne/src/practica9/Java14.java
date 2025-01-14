package practica9;

import java.util.Scanner;

/**
 * INF - 111 Verano 2024 Practica 1 - p14
 *
 * @author marianne liz
 */
public class Java14 {

    /* Ejercicio 14 */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa n: ");
        int n = teclado.nextInt();
        int t1 = 1;
        int t2 = 3;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                System.out.print(t1 + ", ");
                t1 = t1 + 2;
            } else {
                System.out.print(t2 + ", ");
                t2 = t2 + 3;
            }
        }
        System.out.println();
    }
}
