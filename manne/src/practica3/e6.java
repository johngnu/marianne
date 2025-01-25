package practica3;

import java.util.Scanner;
import javaapplication4.Funciones;

public class e6 {

    /* Ejercicio: 6 */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa n: ");
        int n = sc.nextInt();
        int vec[] = new int[100];
        int a = -1;
        int b = 1;
        int p = 2;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                while (!es_primo(p)) {
                    p = p + 1;
                }
                vec[i] = p;
                p = p + 1;
            } else {
                int t = a + b;
                vec[i] = t;
                a = b;
                b = t;
            }
        }
        mostrarVector(vec, n);

    }

    private static void mostrarVector(int vec[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(vec[i] + ", ");
        }
        System.out.println();
    }

    private static boolean es_primo(int n) {
        int cd = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                cd++;
            }
        }
        if (cd == 2) {
            return true;
        } else {
            return false;
        }
    }
}
