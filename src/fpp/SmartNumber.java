package fpp;

public class SmartNumber {
    public static void main(String[] args) {
        test(11, 1);
        test(22, 1);
        test(23, 0);
        test(1, 1);
    }

    static int isSmart(int n) {
        if (n < 1) return 0;
        if (n == 1) return 1;

        int i = 1, agg = 1;

        while (agg <= n) {
            agg += i++;

            if (agg == n) return 1;
            else if (agg > n) break;
        }

        return 0;
    }

    static void test(int n, int e) {
        if (isSmart(n) == e) {
            System.out.println("PASSED");
        } else {
            System.err.println(">>> FAILED");
        }
    }
}
