package fpp;

public class CountOnes {

    public static void main(String[] args) {
        test(5, 2);
        test(15, 4);
    }

    static void test(int n, int e) {
        if (countOnes(n) == e) {
            System.out.println("PASSED");
        } else {
            System.out.println(">>> FAILED");
        }
    }

    static int countOnes(int n) {
        int count = 0;

        while (n > 0) {
            if (n % 2 != 0) count++;
            n /= 2;
        }

        return count;
    }
}


