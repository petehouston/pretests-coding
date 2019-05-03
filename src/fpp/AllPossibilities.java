package fpp;

public class AllPossibilities {
    public static void main(String[] args) {
        test(new int[] {1, 2, 0, 3}, 1);
        test(new int[] {3, 2, 1, 0}, 1);
        test(new int[] {1, 2, 4, 3}, 0);
        test(new int[] {0, 2, 3}, 0);
        test(new int[] {0}, 1);
        test(new int[] {}, 0);
    }

    static int isAllPossibilities(int[] a) {
        if (a.length < 1) return 0;
        int[] found = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            if (a[i] >= a.length) return 0;

            found[a[i]] = 1;
        }

        for (int i = 0; i < a.length; i++) {
            if (found[i] != 1) return 0;
        }

        return 1;
    }

    static void test(int[] a, int e) {
        if (isAllPossibilities(a) == e) {
            System.out.println("PASSED");
        } else {
            System.out.println(">>> FAILED");
        }
    }
}
