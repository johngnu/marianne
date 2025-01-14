package practica9;

import java.util.Scanner;

/**
 * INF - 111 Verano 2024 Practica 1 - p22
 *
 * @author marianne liz
 */
public class Java22 {

    /* Ejercicio 22 */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa n y x: ");
        int n = teclado.nextInt();
        int x = teclado.nextInt();
        int s = 0;

        int t1 = 2;
        int t2 = 2;
        int p = 2;

        for (int i = 1; i <= n; i++) {
            t1 = 2 << i;
            System.out.print("x^" + t1 + "/" + t2 + "! (" + p + ") + ");                        
            t2 = t2 + 2;
            p = 1;
            for (int k = 1; k <= t2; k++) {
                p = p * k;
            }
        }
        System.out.println();
    }
}
