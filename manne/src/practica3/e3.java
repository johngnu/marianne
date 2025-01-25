package practica3;

import java.util.Scanner;

public class e3 {

    /* Ejercicio: 3 */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa n: ");
        int n = sc.nextInt();
        System.out.println("vector 1: ");
        int vec1[] = new int[100];
        int vec2[] = new int[100];
        for (int i = 0; i < n; i++) {
            vec1[i] = sc.nextInt();
        }
        System.out.println("vector 2: ");
        for (int i = 0; i < n; i++) {
            vec2[i] = sc.nextInt();
        }

        mostrarVector(vec1, n);
        mostrarVector(vec2, n);
        // sumar vectores
        System.out.println("suma: ");
        for (int i = 0; i < n; i++) {
            int s = vec1[i] + vec2[i];
            System.out.print(s + ", ");
        }
        System.out.println();
    }

    private static void mostrarVector(int vec[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(vec[i] + ", ");
        }
        System.out.println();
    }
}
