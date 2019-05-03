package fpp;

public class MeeraNUmber {
    public static void main(String[] args) {
        test(6, 1);
        test(30, 1);
        test(21, 0);
    }

    static int isMeera(int n) {
        if (n < 6) return 0;
        int count = 0;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) count++;
        }

        return n % count == 0 ? 1 : 0;
    }

    static void test(int n, int e) {
        if (isMeera(n) == e) {
            System.out.println("PASSED");
        } else
            System.out.println(">>> FAILED");
    }
}
