package fpp;

public class BalancedArray {
    public static void main(String[] args) {
        test(new int[] {-2, 3, -3, 2}, 1);
        test(new int[] {}, 1);
        test(new int[] {1}, 0);
        test(new int[] {-1, 1}, 1);
        test(new int[] {1, 1}, 0);
        test(new int[] {-5, 2, -2}, 0);
        test(new int[] {-5, -2, 2, 5}, 1);
        test(new int[] {5, -5, -5}, 1);
    }

    static int isBalanced(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int hasPair = 0;
            for (int j = 0; j < a.length; j++) {
                if (j == i) continue;

                if (a[i] + a[j] == 0) hasPair = 1;
            }

            if (0 == hasPair) return 0;
        }

        return 1;
    }

    static void test(int[] a, int e) {
        if (isBalanced(a) == e) {
            System.out.println("PASSED");
        } else {
            System.out.println(">>> FAILED");
        }
    }
}
