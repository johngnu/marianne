package practica9;

import java.util.Scanner;

/**
 * INF - 111 Verano 2024 Practica 1 - p5
 *
 * @author marianne liz
 */
public class Java5 {

    /* Ejercicio 5 */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese 1 numero: ");
        int n = teclado.nextInt();
        int s = 0;
        if (n % 3 == 0) {
            System.out.println("Es multipo de 3");
            s = 1;
        }
        if (n % 5 == 0) {
            System.out.println("Es multipo de 5");
            s = 1;
        }
        if (s == 0) {
            System.out.println("No es multiplo ni de 3 ni de 5");
        }
    }
}
