package fpp;

public class KSmallFactors {
    public static void main(String[] args) {
        test(10, 20, true);
        test(10, 22, false);
        test(7, 30, true);
        test(6, 14,  false);
        test(6, 30,  false);
    }

    static boolean hasKSmallFactors(int k, int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                if (i < k && (n / i) < k) return true;
            }
        }

        return false;
    }

    static void test(int k, int n, boolean e) {
        if (hasKSmallFactors(k, n) == e) {
            System.out.println("PASSED");
        } else
            System.out.println(">>> FAILED");
    }
}
