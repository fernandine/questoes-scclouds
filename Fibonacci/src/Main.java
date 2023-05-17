import java.util.Scanner;

import static entities.FibLinear.fibLinear;
import static entities.FibRecursive.fibRecursive;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um número inteiro maior que zero: ");
        int n = scan.nextInt();

        while (n < 0) {
            System.out.print("Número inválido. Digite um número inteiro maior que zero: ");
            n = scan.nextInt();
        }

        System.out.println("Fib(" + n + ") = " + fibRecursive(n) + " (Recursivo)");
        System.out.println("Fib(" + n + ") = " + fibLinear(n) + " (Linear)");

        scan.close();

    }
}