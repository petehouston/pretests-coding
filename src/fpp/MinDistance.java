package fpp;

public class MinDistance {
    public static void main(String[] args) {
        test(13013, 2);
        test(8, 1);
        test(1, 0);
        test(2, 1);
        test(3, 2);
        test(4, 1);
    }

    static int minDistance(int n) {
        if (n == 1) return 0;

        int min = n;
        int prevFactor = 1;

        for (int i = 2; i <= n ; i++) {
            if (n % i == 0) {
                if (min > i - prevFactor) min = i - prevFactor;
                prevFactor = i;
            }
        }
        return min;
    }

    static void test(int n, int e) {
        if (minDistance(n) == e) {
            System.out.println("PASSED");
        } else {
            System.out.println(">>> FAILED");
        }
    }
}
