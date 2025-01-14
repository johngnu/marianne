package practica9;

import java.util.Scanner;

/**
 * INF - 111 Verano 2024 Practica 1 - p4
 *
 * @author marianne liz
 */
public class Java4 {

    /* Ejercicio 4 */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese 3 numeros: ");
        int a = teclado.nextInt();
        int b = teclado.nextInt();
        int c = teclado.nextInt();
        int s = 0;
        if (a % 2 == 0) {
            s = 1;
        }
        if (b % 2 == 0) {
            s = 1;
        }
        if (c % 2 == 0) {
            s = 1;
        }
        if (s == 1) {
            System.out.println("Hay al menos un numero PAR");
        } else {
            System.out.println("No hay numeros pares");
        }
    }
}
