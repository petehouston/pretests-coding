package fpp;

//    An array is defined to be prime-sparse if no prime-valued elements are adjacent to one another.
//    Recall that a prime number is a positive integer whose only factors are 1 and itself.
//    For example, the array {6, 11, 13, 28, 5, 6} is not prime-sparse because the primes 11 and 13 are next to one
//    another.
//    The array {6, 11, 88, 13, 28, 5, 6, 17} is prime sparse because the 11 and 13 are separated by a non-prime (88).
//    If the array has no primes, then it is prime-sparse by definition.
//    Write a function named isPrimeSparse that returns 1 if its array argument is prime-sparse, otherwise it returns 0.


public class PrimeSparse {
    public static void main(String[] args) {
        test(new int[] {6, 11, 13, 28, 5, 6}, 0);
        test(new int[] {6, 11, 88, 13, 28, 5, 6, 17}, 1);
        test(new int[] {17}, 1);
        test(new int[] {6, 17, 15}, 1);
        test(new int[] {7, 25, 7, 4, 7}, 1);
        test(new int[] {}, 1);
    }

    static int isPrimeSparse(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (isPrime(a[i]) == 1 && isPrime(a[i + 1]) == 1) return 0;
        }

        return 1;
    }

    static void test(int[] a, int e) {
        if (isPrimeSparse(a) == e) {
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
