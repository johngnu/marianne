package practica9;

import java.util.Scanner;

/**
 * INF - 111 Verano 2024 Practica 1 - p6
 *
 * @author marianne liz
 */
public class Java6 {

    /* Ejercicio 6 */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese 1 año: ");
        int a = teclado.nextInt();
        if (a % 4 == 0) {
            if (a % 100 != 0) {
                System.out.println("Es Bisiesto");
            } else {
                if (a % 400 == 0) {
                    System.out.println("Es Bisiesto");
                } else {
                    System.out.println("No es Bisiesto");
                }
            }
        } else {
            System.out.println("No es Bisiesto");
        }
    }
}
