package fpp;

public class NormalNumber {
    public static void main(String[] args) {
        test(-1, 0);
        test(0, 0);
        test(1, 1);
        test(2, 1);
        test(3, 1);
        test(4, 1);
        test(5, 1);
        test(6, 0);
        test(7, 1);
        test(8, 1);
    }

    static int isNormal(int n) {
        if (n < 1) return 0;

        if (n < 6) return 1;

        for (int i = 3; i <= n / 2; i += 2) {
            if (n % i == 0) return 0;
        }

        return 1;
    }

    static void test(int n, int e) {
        if (isNormal(n) == e) {
            System.out.println("PASSED");
        } else {
            System.out.println(">>> FAILED");
        }
    }
}
