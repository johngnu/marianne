package practica9;

import java.util.Scanner;

/**
 * INF - 111 Verano 2024 Practica 1 - p10
 *
 * @author marianne liz
 */
public class Java10 {

    /* Ejercicio 10 */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese a y b: ");
        int a = teclado.nextInt();
        int b = teclado.nextInt();
        int j = 1;
        int k = 0;
        int c = 0;
        for (int i = 1; i <= b; i++) {
            int t = j + k;
            c = c + 1;
            if (c >= a) {
                System.out.print(t + ", ");
            }
            j = k;
            k = t;
        }
        System.out.println();
    }
}
