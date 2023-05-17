package entities;

import java.util.ArrayList;

public class PrimeLinear {
    public static ArrayList<Integer> getPrimes(int n) {
        ArrayList<Integer> primes = new ArrayList<>();
        boolean[] b = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            if (!b[i]) {
                primes.add(i);
                for (int j = i * i; j <= n; j += i) {
                    b[j] = true;
                }
            }
        }
        return primes;
    }
}
