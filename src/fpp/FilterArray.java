package fpp;

public class FilterArray {
    public static void main(String[] args) {
        test(new int[] {1, 2, 3, 9, 6, 11}, 1);
        test(new int[] {3, 4, 6, 7, 14, 16}, 1);
        test(new int[] {1, 2, 3, 4, 11, 13, 10}, 1);
        test(new int[] {3, 6, 5, 5, 13, 6, 13}, 1);
        test(new int[] {9, 6, 18}, 0);
        test(new int[] {4, 7, 13}, 0);
    }

    static int isFilter(int[] a) {
        if (a.length < 1) return 1;

        int has7 = 0, has9 = 0, has11 = 0, has13 = 0;

        for (int x : a) {
            if (x == 7) has7 = 1;
            else if (x == 9) has9 = 1;
            else if (x == 11) has11 = 1;
            else if (x == 13) has13 = 1;
        }

        if (1 == has9 && 1 == has11) {
            if (0 == has7 || (1 == has7 && 0 == has13)) return 1;
        } else if (0 == has9) {
            if (0 == has7 || (1 == has7 && 0 == has13)) return 1;
        }

        return 0;
    }

    static void test(int[] a, int e) {
        if (isFilter(a) == e) {
            System.out.println("PASSED");
        } else {
            System.out.println(">>> FAILED");
        }
    }
}
