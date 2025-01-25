package practica3;

import java.util.Scanner;

public class e4 {

    /* Ejercicio: 4 */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa n: ");
        int n = sc.nextInt();
        int vec[] = new int[100];
        int a = -1;
        int b = 1;
        for (int i = 0; i < n; i++) {
            int t = a + b;
            vec[i] = t;
            a = b;
            b = t;
        }
        mostrarVector(vec, n);

    }

    private static void mostrarVector(int vec[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(vec[i] + ", ");
        }
        System.out.println();
    }
}
