package fpp;

public class WaveArray {
    public static void main(String[] args) {
        test(new int[] {7, 2, 9, 10, 5}, 1);
        test(new int[] {4, 11, 12, 1, 6}, 1);
        test(new int[] {1, 0, 5}, 1);
        test(new int[] {2, 6, 3, 4}, 0);
        test(new int[] {} ,1);
        test(new int[] {1}, 1);
        test(new int[] {2}, 1);
        test(new int[] {2, 8}, 0);
        test(new int[] {2, 3}, 1);
    }

    static int isWave(int[] a) {
        if (a.length <= 1) return 1;

        for (int i = 0; i < a.length - 1; i++) {
            if ((a[i] + a[i + 1]) % 2 != 1) return 0;
        }

        return 1;
    }

    static void test(int[] a, int e) {
        if (isWave(a) == e) {
            System.out.println("PASSED");
        } else
            System.out.println(">>> FAILED");
    }
}
