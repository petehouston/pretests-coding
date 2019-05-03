package fpp;

public class Fill {
    public static void main(String[] args) {
        test(new int[] {1, 2, 3, 5, 9, 12, -2, -1}, 3, 10, new int[] {1, 2, 3, 1, 2, 3, 1, 2, 3, 1});
        test(new int[] {4, 2, -3, 12}, 1, 5, new int[] {4, 4, 4, 4, 4});
        test(new int[] {2, 6, 9, 0, -3}, 0, 4, null);
        test(new int[] {1, 2, 9, 3}, 2, 10, new int[] {1, 2, 1, 2, 1, 2, 1, 2, 1, 2});
    }

    static int[] fill(int[] a, int k, int n) {
        if (k <= 0 || n <= 0) return  null;

        int[] res = new int[n];

        for (int i = 1; i <= n / k; i++) {
            for (int j = 0; j < k; j++) {
                res[(i-1) * k + j] = a[j];
            }
        }

        if (n % k != 0) {
            int remainder = n - (n / k) * k;
            for (int i = 0; i < remainder; i++) {
                res[(n / k) * k + i] = a[i];
            }
        }

        return res;
    }

    static void test(int[] a, int k, int n, int[] e) {
        int[] res = fill(a, k, n);

        if (res == null) {
            if (e == null) {
                System.out.println("PASSED"); return;
            } else {
                System.out.println(">>> FAILED"); return;
            }
        }

        if (res.length != e.length) {
            System.out.println(">>> FAILED");
            return;
        }

        for (int i = 0; i < res.length; i++) {
            if (res[i] != e[i]) {
                System.out.println(">>> FAILED");
                return;
            }
        }

        System.out.println("PASSED");
    }
}
