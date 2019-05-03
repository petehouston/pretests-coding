package fpp;

//    A Fibonacci number is a number in the sequence 1, 1, 2, 3, 5, 8, 13, 21,….
//    Note that first two Fibonacci numbers are 1 and any Fibonacci number other than the first two is the sum of the
//        previous two Fibonacci numbers.
//    For example, 2 = 1 + 1, 3 = 2 + 1, 5 = 3 + 2 and so on.

public class Fibonacci {
    public static void main(String[] args) {
        test(0, 0);
        test(1, 1);
        test(2, 1);
        test(3, 1);
        test(4, 0);
    }

    static int isFibonacci(int n) {
        if (n < 1) return 0;

        int left = (int) Math.sqrt(5 * n * n - 4);
        int right = (int) Math.sqrt(5 * n * n + 4);

        return ((left * left) == (5 * n * n - 4)) || ((right * right) == (5 * n * n + 4)) ? 1 : 0;
    }

    static void test(int n, int e) {
        if (isFibonacci(n) == e) {
            System.out.println("PASSED");
        } else {
            System.err.println(">>> FAILED");
        }
    }
}
