package practica3;

import java.util.Scanner;

public class e7 {

    /* Ejercicio: 7 */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa x: ");
        int x = sc.nextInt();
        int aux = invertirNumero(x);
        int vec1[] = new int[100];
        int vec2[] = new int[100];
        int i1 = 0;
        int i2 = 0;
        while (aux > 0) {
            int dig = aux % 10;
            aux = aux / 10;
            if (dig % 2 == 1) {
                vec1[i1] = dig;
                i1 = i1 + 1;
            } else {
                vec2[i2] = dig;
                i2 = i2 + 1;
            }
        }

        // mostrar vectores
        mostrarVector(vec1, i1);
        mostrarVector(vec2, i2);
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
