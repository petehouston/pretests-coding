package fpp;

public class BalancedArray2 {
    public static void main(String[] args) {
        test(new int[] {2, 3, 6, 7}, 1);
        test(new int[] {6, 7, 2, 3, 12}, 1);
        test(new int[] {7, 15, 2, 3}, 0);
        test(new int[] {16, 6, 2, 3}, 0);
    }

    static int isBalanced(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0 && a[i] % 2 == 0) continue;
            else if (i % 2 == 1 && a[i] % 2 == 1) continue;
            else return 0;
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
