package practica9;

import java.util.Scanner;

/**
 * INF - 111 Verano 2024 Practica 1 - p21
 *
 * @author marianne liz
 */
public class Java21 {

    /* Ejercicio 21 */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa n y x: ");
        int n = teclado.nextInt();
        int x = teclado.nextInt();
        int s = 0;

        int t1 = 1;
        int t2 = 4;

        for (int i = 1; i <= n; i++) {
            System.out.print("x^" + t1 + "/" + t2 + " + ");
            t1 = t1 + 2;
            t2 = t2 + 4;
        }
        System.out.println();
    }
}
