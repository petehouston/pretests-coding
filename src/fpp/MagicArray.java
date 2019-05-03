package fpp;

public class MagicArray {
    public static void main(String[] args) {
        test(new int[] {21, 3, 7, 9, 11, 4, 6} , 1);
        test(new int[] {13, 4, 4, 4, 4} , 1);
        test(new int[] {10, 5, 5}, 1);
        test(new int[] {0, 6, 8, 20}, 1);
        test(new int[] {3}, 1);
        test(new int[] {8, 5, -5, 5, 3}, 0);

    }

    static int isMagicArray(int[] a) {
        int sum = 0;

        for (int x : a) {
            if (1 == isPrime(x)) sum += x;
        }

        if (0 == sum && a[0] == 0) return 1;

        return sum == a[0] ? 1 : 0;
    }

    static void test(int[] a, int e) {
        if (isMagicArray(a) == e) {
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
