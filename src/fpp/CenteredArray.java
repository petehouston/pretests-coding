package fpp;

public class CenteredArray {
    public static void main(String[] args) {
        test(new int[] {5, 3, 3, 4, 5}, 0);
        test(new int[] {3, 2, 1, 4, 5}, 1);
        test(new int[] {3, 2, 1, 1, 4, 6}, 0);
    }

    static int isCentered(int[] a) {
        if (a.length < 1) return 0;

        if (a.length % 2 != 1) return 0;

        for (int i = 0; i < a.length / 2; i++) {
            if (i == a.length / 2) continue;

            if (a[i] <= a[a.length / 2]) return 0;
        }

        return 1;
    }

    static void test(int[] a, int e) {
        if (isCentered(a) == e) {
            System.out.println("PASSED");
        } else
            System.out.println(">> FAILED");
    }
}
