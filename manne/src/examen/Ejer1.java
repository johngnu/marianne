package examen;

import java.util.Scanner;

/**
 * INF - 111 Verano 2024 Examen
 *
 * @author marianne liz
 */
public class Ejer1 {

    /* Ejercicio 1 */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresar numeros: ");
        int a = teclado.nextInt();
        int b = teclado.nextInt();
        int c = teclado.nextInt();
        int d = teclado.nextInt();

        int x = a + b;
        int y = c + d;
        if (x > y) {
            System.out.println("Anidados");
            if (a > b && a > c && a > d) {
                System.out.println(a + " es mayor");
            } else {
                if (b > a && b > c && b > d) {
                    System.out.println(b + " es mayor");
                } else {
                    if (c > a && c > b && c > d) {
                        System.out.println(c + " es mayor");
                    } else {
                        System.out.println(d + " es mayor");
                    }
                }
            }
        } else {
            System.out.println("No Anidados");
            int min = a;
            if (b < min) {
                min = b;
            }
            if (c < min) {
                min = c;
            }
            if (d < min) {
                min = d;
            }
            System.out.println(min + " es el minimo");
        }

    }
}
