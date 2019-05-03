package fpp;

public class ContinuousFactor {
    public static void main(String[] args) {
        test(6 ,1);
        test(60, 1);
        test(120, 1);
        test(90, 1);
        test(99, 0);
        test(121, 0);
    }

    static int isContinuousFactor(int n) {
        if (n < 6) return 0;

        int prevFactor = 1;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                if (prevFactor > 1) {
                    if (i == prevFactor + 1) return 1;

                }
                prevFactor = i;
            }
        }
        return 0;
    }

    static void test(int n, int e) {
        if (isContinuousFactor(n) == e) {
            System.out.println("PASSED");
        } else {
            System.err.println(">>> FAILED");
        }
    }
}
