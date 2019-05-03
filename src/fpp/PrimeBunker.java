package fpp;

//    A Bunker array is an array that contains the value 1 if and only if it contains a prime number.
//    The array {7, 6, 10, 1} is a Bunker array because it contains a prime number (7) and also contains a 1.
//    The array {7, 6, 10} is not a Bunker array because it contains a prime number (7) but does not contain a 1.
//    The array {6, 10, 1} is not a Bunker array because it contains a 1 but does not contain a prime number.
//
//    It is okay if a Bunker array contains more than one value 1 and more than one prime,
//    so the array {3, 7, 1, 8, 1} is a Bunker array (3 and 7 are the primes).
public class PrimeBunker {
    public static void main(String[] args) {
        test(new int[] {7, 6, 10, 1}, 1);
        test(new int[] {7, 6, 10}, 0);
        test(new int[] {6, 10, 0}, 0);
        test(new int[] {}, 0);
    }

    static int isBunker(int[] a) {
        if (a.length < 2) return 0;

        boolean hasPrime = false, has1 = false;

        for (int x : a) {
            if (x == 1) has1 = true;
            else if (isPrime(x) == 1) hasPrime = true;
        }

        return has1 && hasPrime ? 1 : 0;
    }

    static void test(int[] a, int e) {
        if (isBunker(a) == e) {
            System.out.println("PASSED");
        } else
            System.out.println(">>> FAILED");
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
