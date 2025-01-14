package practica9;

import java.util.Scanner;

/**
 * INF - 111 Verano 2024 Practica 1 - p11
 *
 * @author marianne liz
 */
public class Java11 {

    /* Ejercicio 11 */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa n: ");
        int n = teclado.nextInt();
        int k = 1;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                System.out.print(k + ", ");
            } else {
                System.out.print((k - 1) + ", ");
                k = k + 1;
            }            
        }
        System.out.println();
    }
}
