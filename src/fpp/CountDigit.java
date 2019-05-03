package fpp;

public class CountDigit {
    public static void main(String[] args) {
        test(33331, 3, 4);
        test(33331, 4, 0);
        test(3, 3, 1);
    }

    static int countDigit(int n, int k) {
        if (n < 0) return -1;
        int count = 0;

        while (n > 0) {
            if (n % 10 == k) count++;
            n /= 10;
        }

        return count;
    }

    static void test(int n, int k, int e) {
        if (countDigit(n, k) == e) {
            System.out.println("PASSED");
        } else {
            System.out.println(">>> FAILED");
        }
    }
}
