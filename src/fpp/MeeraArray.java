package fpp;

public class MeeraArray {
    public static void main(String[] args) {
        test(new int[] {3, 5, -2}, 1);
        test(new int[] {8, 3, 4}, 0);
    }

    static int isMeera(int[] a) {
        if (a.length < 2) return 1;

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (2 * a[i] == a[j] || 2 * a[j] == a[i]) return 0;
            }
        }

        return 1;
    }

    static void test(int[] a, int e) {
        if (isMeera(a) == e) {
            System.out.println("PASSED");
        } else
            System.out.println(">>> FAILED");
    }
}
