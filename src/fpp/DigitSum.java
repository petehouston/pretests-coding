package fpp;

public class DigitSum {
    public static void main(String[] args) {
        test(32121, 10, 1);
        test(32121, 9, 0);
        test(13, 6, 1);
        test(3, 3, 0);
    }

    static int isDigitSum(int n, int m) {
        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum < m ? 1 : 0;
    }

    static void test(int n, int m, int e) {
        if (isDigitSum(n, m) == e) {
            System.out.println("PASSED");
        } else {
            System.out.println(">>> FAILED");
        }
    }
}
