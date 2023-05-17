import entities.PrimeLinear;
import entities.PrimeRecursive;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um número inteiro maior que 1: ");
        int n = scan.nextInt();

        while (n <= 1) {
            System.out.print("Número inválido. Digite um número inteiro maior que 1: ");
            n = scan.nextInt();
        }

        ArrayList<Integer> primesRecursive = PrimeRecursive.getPrimes(n);
        ArrayList<Integer> primesLinear = PrimeLinear.getPrimes(n);

        System.out.println("Números primos até " + n + " usando função recursiva: " + primesRecursive);
        System.out.println("Números primos até " + n + " usando função linear: " + primesLinear);

        scan.close();
    }
}