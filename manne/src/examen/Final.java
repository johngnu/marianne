package examen;

import java.util.Scanner;

public class Final {

    /* examen final: 1 */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa n: ");
        int n;
        do {
            n = sc.nextInt();
        } while (n <= 0);

        int aux = invertirNumero(n);
        System.out.println(aux);
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
}
