package practica9;

import java.util.Scanner;

/**
 * INF - 111 Verano 2024 Practica 1 - p9
 *
 * @author marianne liz
 */
public class Java9 {

    /* Ejercicio 9 */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("5 numeros: ");
        int n1 = teclado.nextInt();
        int n2 = teclado.nextInt();
        int n3 = teclado.nextInt();
        int n4 = teclado.nextInt();
        int n5 = teclado.nextInt();

        int menor = n1;
        if (n2 < menor) {
            menor = n2;
        }
        if (n3 < menor) {
            menor = n3;
        }
        if (n4 < menor) {
            menor = n4;
        }
        if (n5 < menor) {
            menor = n5;
        }
        int mayor = n1;
        if (n2 > mayor) {
            mayor = n2;
        }
        if (n3 > mayor) {
            mayor = n3;
        }
        if (n4 > mayor) {
            mayor = n4;
        }
        if (n5 > mayor) {
            mayor = n5;
        }

        System.out.println("El menor es: " + menor + ", Y el mayor es: " + mayor);
    }
}
