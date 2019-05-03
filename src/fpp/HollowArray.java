package fpp;

public class HollowArray {
    public static void main(String[] args) {
        test(new int[] {1,2,4,0,0,0,3,4,5}, 1);
        test(new int[] {1,2,0,0,0,3,4,5}, 0);
        test(new int[] {1,2,4,9, 0,0,0,3,4, 5}, 0);
        test(new int[] {1,2, 0,0, 3,4}, 0);
        test(new int[] {}, 0);
        test(new int[] {0, 0}, 0);
        test(new int[] {0, 0, 0}, 1);
    }

    static int isHollow(int[] a) {
        if (a.length < 3) return 0;

        int pre = 0, post = 0, zero = 0;

        int i = 0;
        for (i = 0; i <= a.length / 2; i++) {
            if (a[i] != 0) pre++;
            if (a[a.length - 1 - i] != 0) post++;
            if (a[i] == 0) break;

        }

        if (pre != post) return 0;

        for (; i < a.length - i; i++) {
            if (a[i] == 0 && i == a.length / 2) zero++;
            else if (a[i] == 0 && a[a.length - i - 1] == 0) zero += 2;
            else break;
        }

        if (pre == post && zero >= 3) return 1;
        return 0;
    }

    static void test(int[] a, int e) {
        if (isHollow(a) == e) {
            System.out.println("PASSED");
        } else
            System.out.println(">>> FAILED");
    }
}
