package fpp;

public class PrimeProduct {
    public static void main(String[] args) {
        test(22, 1);
        test(21, 1);
        test(12, 0);
        test(1, 0);
        test(2, 0);
        test(3, 0);
        test(4, 0);
        test(6, 1);
    }

    static int isPrimeProduct(int n) {
        if (n < 6) return 0;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                if ((1 == isPrime(i)) && (1 == isPrime(n / i))) return 1;
            }
        }

        return 0;
    }

    static void test(int n, int e) {
        if (isPrimeProduct(n) == e) {
            System.out.println("PASSED");
        } else {
            System.out.println(">>> FAILED");
        }
    }

    static int isPrime(int n) {
        if (n <= 1) return 0;

        if (n == 2 || n == 3 || n == 5) return 1;

        for (int i = 2; i <= Math.sqrt(n); ++i) {
            if (n % i == 0) return 0;
        }

        return 1;
    }
}
