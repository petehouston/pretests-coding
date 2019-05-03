package fpp;

public class FineArray {
    public static void main(String[] args) {
        test(new int[] {4, 7, 9, 6, 5}, 1);
        test(new int[] {4, 9, 6, 33},1 );
        test(new int[] {3, 8, 15}, 0);
    }

    static int isFineArray(int[] a) {
        int hasPrime = 0;

        for (int x : a) {
            if (1 == isPrime(x)) {
                hasPrime = 1;

                for (int y : a) {
                    if (x + 2 == y && 1 == isPrime(y)) {
                        return 1;
                    }
                }
            }
        }

        if (hasPrime == 0) return 1;

        return 0;
    }

    static void test(int[] a, int e) {
        if (isFineArray(a) == e) {
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
