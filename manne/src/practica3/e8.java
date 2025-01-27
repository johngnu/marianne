package practica3;

import java.util.Scanner;

public class e8 {

    /* Ejercicio: 8 */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int na, nb, nc;
        do {
            System.out.println("n1, n2, n3");
            na = sc.nextInt();
            nb = sc.nextInt();
            nc = sc.nextInt();
        } while (na <= 0 && nb <= 00 && nc <= 0);
        int[] a = new int[na];
        int[] b = new int[nb];
        int[] c = new int[nc];
        int[] r = new int[na + nb + nc];
        System.out.println("Datos vectos a:");
        leerVector(a, na);
        System.out.println("Datos vectos b:");
        leerVector(b, nb);
        System.out.println("Datos vectos c:");
        leerVector(c, nc);
        System.out.println("Vectores:");
        mostrarVector(a, na);
        mostrarVector(b, nb);
        mostrarVector(c, nc);
        System.out.println("Resultado:");
        int k = 1;
        int ia = 0;
        int ib = 0;
        int ic = 0;
        int i = 0;
        while (i < (na + nb + nc)) {
            if (ia < na) {
                r[i] = a[ia];
                ia++;
                i++;
            }
            if (ib < nb) {
                r[i] = b[ib];
                ib++;
                i++;
            }
            if (ic < nc) {
                r[i] = c[ic];
                ic++;
                i++;
            }
        }
        mostrarVector(r, (na + nb + nc));
    }

    private static void leerVector(int[] a, int n) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
    }

    private static void mostrarVector(int[] a, int n) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + ", ");
        }
        System.out.println();
    }

}
