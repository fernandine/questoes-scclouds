package entities;

import java.util.ArrayList;

public class PrimeRecursive {
    public static ArrayList<Integer> getPrimes(int n) {
        ArrayList<Integer> primes = new ArrayList<>();
        getPrimesHelper(n, primes);
        return primes;
    }

    private static void getPrimesHelper(int n, ArrayList<Integer> primes) {
        if (n < 2) {
            return;
        }
        getPrimesHelper(n - 1, primes);
        if (isPrime(n)) {
            primes.add(n);
        }
    }

    private static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
