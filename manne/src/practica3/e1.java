package practica3;

import java.util.Scanner;

public class e1 {

    /* Ejercicio: 1 */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa n: ");
        int n = sc.nextInt();
        int vec[] = new int[100];
        for (int i = 0; i < n; i++) {
            vec[i] = sc.nextInt();
        }
        mostrarVector(vec, n);
        for (int i = 0; i < n; i++) {
            if (vec[i] % 2 == 0) {
                vec[i] = invertirNumero(vec[i]);
            }
        }
        mostrarVector(vec, n);
    }

    private static int invertirNumero(int n) {
        int nuevo = 0;
        while (n > 0) {
            int dig = n % 10;
            n = n / 10;
            nuevo = (nuevo * 10) + dig;
        }
        return nuevo;
    }

    private static void mostrarVector(int vec[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(vec[i] + ", ");
        }
        System.out.println();
    }
}
