package fpp;

public class CompleteArray {
    public static void main(String[] args) {
        test(new int[] {-5, 6, 2, 3, 2, 4, 5, 11, 8, 7}, 1);
        test(new int[] {5, 7, 9, 13}, 0);
        test(new int[] {2, 2}, 0);
        test(new int[] {2, 6, 3, 4}, 0);
    }

    static int isComplete(int[] a) {
        int hasEven = 0;
        int min = 0, max = 0, init = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                hasEven = 1;
                if (init == 0) {
                    min = a[i]; max = a[i];
                    init = 1;
                } else {
                    if (min > a[i]) min = a[i];
                    if (max < a[i]) max = a[i];
                }
            }
        }

        if (hasEven == 0 || min == max ) return 0;

        for (int i = min + 1; i < max; i++) {
            int exist = 0;
            for (int x : a) {
                if (i == x) {
                    exist = 1;
                    break;
                }
            }

            if (exist == 0) return 0;
        }

        return 1;
    }

    static void test(int[] a, int e) {
        if (isComplete(a) == e) {
            System.out.println("PASSED");
        } else {
            System.out.println(">>> FAILED");
        }
    }
}
