package practica9;

import java.util.Scanner;

/**
 * INF - 111 Verano 2024 Practica 1 - p8
 *
 * @author marianne liz
 */
public class Java8 {

    /* Ejercicio 8 */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese 4 notas: ");
        int n1 = teclado.nextInt();
        int n2 = teclado.nextInt();
        int n3 = teclado.nextInt();
        int n4 = teclado.nextInt();

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
        int s = 0;
        if (n1 != menor) {
            s = s + n1;
        }
        if (n2 != menor) {
            s = s + n2;
        }
        if (n3 != menor) {
            s = s + n3;
        }
        if (n4 != menor) {
            s = s + n4;
        }
        System.out.println("Nota eliminada: " + menor + ", promedio: " + (s / 3));
    }
}
