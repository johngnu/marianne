package practica9;

import java.util.Scanner;

/**
 * INF - 111 Verano 2024 Practica 1 - p20
 *
 * @author marianne liz
 */
public class Java20 {

    /* Ejercicio 20 */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa n y x: ");
        int n = teclado.nextInt();
        int x = teclado.nextInt();
        int s = 0;
        
        int t1 = 0;
        int t2 = 2;
        int limite = 1;
        int c = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("x^" + t1 + "/" + t2 + " + ");
            t2 = t2 + 2;            
            c = c + 1;
            if (c == limite) {
                c = 0;
                limite = limite + 1;
                t1 = t1 + 1;
            }
        }
        System.out.println();
    }
}
