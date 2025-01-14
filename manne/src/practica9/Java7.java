package practica9;

import java.util.Scanner;

/**
 * INF - 111 Verano 2024 Practica 1 - p7
 *
 * @author marianne liz
 */
public class Java7 {

    /* Ejercicio 7 */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("n: ");
        int n = teclado.nextInt();
        if (n >= 0) {
            do {
                if (n % 2 == 0) {
                    n = n / 2;
                } else {
                    n = (n * 3) + 1;
                }
                System.out.print(n + ", ");
            } while (n != 1);
            System.out.println("");
        }
    }
}
