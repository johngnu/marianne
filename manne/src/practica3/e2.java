package practica3;

import java.util.Scanner;

public class e2 {

    /* Ejercicio: 2 */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa n: ");
        int n = sc.nextInt();
        int vec[] = new int[100];
        for (int i = 0; i < n; i++) {
            vec[i] = sc.nextInt();
        }
        mostrarVector(vec, n);
        int s = 0;
        int c = 0;
        for (int i = 0; i < n; i++) {
            if (es_primo(vec[i])) {
                s = s + vec[i];
                c = c + 1;
            }
        }
        System.out.println("Promedio: " + (s / c));
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

    private static void mostrarVector(int vec[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(vec[i] + ", ");
        }
        System.out.println();
    }
}
