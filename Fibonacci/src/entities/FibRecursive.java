package entities;

public class FibRecursive {

    public static int fibRecursive(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibRecursive(n - 1) + fibRecursive(n - 2);
        }
    }
}
