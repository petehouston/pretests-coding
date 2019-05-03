package fpp;

public class OddValent {
    public static void main(String[] args) {
        test(new int[] {9, 3, 4, 9, 1}, 1);
        test(new int[] {3, 3, 3, 3}, 1);
        test(new int[] {8, 8, 8, 4, 7, 2}, 1);
        test(new int[] {1, 2, 3, 4, 5}, 0);
        test(new int[] {2, 2, 2, 4, 4}, 0);
        test(new int[] {1}, 0);
        test(new int[] {}, 0);
        test(new int[] {1, 1}, 1);
        test(new int[] {1, 3}, 0);
    }

    static int isOddValent(int[] a) {
        if (a.length < 2) return 0;

        int hasOdd = 0, hasDup = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 1) hasOdd = 1;
            for (int j = 0; j < a.length; j++) {
                if (j == i) continue;

                if (a[i] == a[j]) hasDup = 1;

                if (hasDup == 1 && hasOdd == 1) return 1;
            }
        }

        return 0;
    }

    static void test(int[] a, int e) {
        if (isOddValent(a) == e) {
            System.out.println("PASSED");
        } else {
            System.out.println(">>> FAILED");
        }
    }
}
