package fpp;

//    A Madhav array has the following property.
//        a[0] = a[1] + a[2] = a[3] + a[4] + a[5] = a[6] + a[7] + a[8] + a[9] = ...
//    The length of a Madhav array must be n*(n+1)/2 for some n.
//
//    Write a method named isMadhavArray that returns 1 if its array argument is a Madhav array,
//    otherwise it returns 0. If you are programming in Java or C# the function signature is
//        int isMadhavArray(int[ ] a)


public class MadhavArray {
    public static void main(String[] args) {
        test(new int[] {2, 1, 1}, 1);
        test(new int[] {2, 1, 1, 4, -1, -1}, 1);
        test(new int[] {6, 2, 4, 2, 2, 2, 1, 5, 0, 0}, 1);
        test(new int[] {18, 9, 10, 6, 6, 6}, 0);
        test(new int[] {-6, -3, -3, 8, -5, -4}, 0);
        test(new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, -2, -1}, 1);
        test(new int[] {3, 1, 2, 3, 0}, 0);
    }

    static int isMadhavArray(int[] a) {
        if (a.length < 3) return 0;

        int k = 1, count = 2;
        int sum = 0;

        while (k < a.length) {
            sum = 0;
            for (int i = 0; i < count; k++, i++) {
                if (k >= a.length) return 0;
                sum += a[k];
            }
            count++;
            if (sum != a[0]) return 0;
        }

        return 1;
    }

    static void test(int[] a, int e) {
        if (isMadhavArray(a) == e) {
            System.out.println("PASSED");
        } else {
            System.out.println(">>> FAILED");
        }
    }
}
