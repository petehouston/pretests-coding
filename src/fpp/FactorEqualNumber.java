package fpp;

//    Two integers are defined to be factor equal, if they have the same number of factors.
//    For example, integers 10 and 33 are factor equal because, 10 has four factors: 1, 2, 5, 10
//    and 33 also has four factors: 1, 3, 11, 33.
//    On the other hand, 9 and 10 are not factor equal since 9 has only three factors: 1, 3, 9
//    and 10 has four factors: 1, 2, 5, 10.

public class FactorEqualNumber {
    public static void main(String[] args) {
        test(9, 10, 0);
        test(10, 33, 1);
    }

    static int factorEqual(int n, int m) {
        if (n < 0 || m < 0) return 0;

        if (n == m) return 1;

        int max = n > m ? n : m;

        int countN = 0, countM = 0;

        for (int i = 1; i <= max; i++) {
            if (n % i == 0) countN++;
            if (m % i == 0) countM++;
        }

        return countN == countM ? 1 : 0;
    }

    static void test(int n, int m, int e) {
        if (factorEqual(n, m) == e) {
            System.out.println("PASSED");
        } else {
            System.err.println(">>> FAILED");
        }
    }
}
