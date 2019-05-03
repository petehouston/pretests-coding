package fpp;

public class BunkerArray {
    public static void main(String[] args) {
        test(new int[] {4, 9, 6, 7, 3}, 1);
        test(new int[] {4, 9, 6, 15, 21}, 0);

        test(new int[] {}, 0);
        test(new int[] {1}, 0);
        test(new int[] {1, 3}, 1);
        test(new int[] {1, 9}, 0);
    }

    static int isBunkerArray(int[] a) {
        if (a.length < 2) return 0;

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] % 2 == 1 && 1 == isPrime(a[i + 1])) return 1;
        }

        return 0;
    }

    static void test(int[] a, int e) {
        if (isBunkerArray(a) == e) {
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
