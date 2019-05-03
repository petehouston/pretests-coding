package fpp;

public class Evens {
    public static void main(String[] args) {
        test(2424, 1);
        test(3224, 0);
    }

    static int isEvens(int n) {
        while (n > 0) {
            if ( (n % 10) % 2 == 1) return 0;
            n /= 10;
        }

        return 1;
    }

    static void test(int n, int e) {
        if (isEvens(n) == e) {
            System.out.println("PASSED");
        } else {
            System.out.println(">>> FAILED");
        }
    }
}
