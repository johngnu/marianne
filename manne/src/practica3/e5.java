package practica3;

import java.util.Scanner;

public class e5 {

    /* Ejercicio: 5 */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa x: ");
        int x = sc.nextInt();
        int aux = invertirNumero(x);
        int vec[] = new int[100];
        int i = 0;
        while (aux > 0) {
            int dig = aux % 10;
            aux = aux / 10;
            if (dig % 2 == 0) {
                vec[i] = dig;
                i = i + 1;
            }
        }
        mostrarVector(vec, i);
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
