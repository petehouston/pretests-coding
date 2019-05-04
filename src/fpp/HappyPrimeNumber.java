package fpp;

//    Check whether a given integer number, n, is Prime Happy. Return 1 if true or 0 if false.
//    A Prime Happy number is a number, n, which has at least one prime number less that n and
//    the sum of all prime numbers less than n is divisible by n.

public class HappyPrimeNumber {
    public static void main(String[] args) {
        test(3, 0);
        test(5, 1);
        test(8, 0);
    }

    static int isPrimeHappy(int n) {

        if (n < 2) return 0;

        int sum = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime(i) == 1) sum += i;
        }

        if (sum == 0) return 0;

        return sum % n == 0 ? 1 : 0;
    }

    static void test(int n, int e) {
        if (isPrimeHappy(n) == e) {
            System.out.println("PASSED");
        } else {
            System.err.println(">>> FAILED");
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
