package fpp;

public class DaphneArray {
    public static void main(String[] args) {
        test(new int[] {2, 4, 2}, 1);
        test(new int[] {1, 3}, 1);
        test(new int[] {1, 2, 3}, 0);
        test(new int[] {}, 0);
        test(new int[] {2}, 1);
        test(new int[] {1}, 1);
    }

    static int isDaphne(int[] a) {
        if (a.length < 1) return 0;

        if (a.length == 1) return 1;

        for (int x : a) {
            if (x % 2 != a[0] % 2) return 0;
        }

        return 1;
    }

    static void test(int[] a, int e) {
        if (isDaphne(a) == e) {
            System.out.println("PASSED");
        } else {
            System.out.println(">>> FAILED");
        }
    }
}
