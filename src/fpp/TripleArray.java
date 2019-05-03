package fpp;

//    Define a Triple array to be an array where every value occurs exactly three times.
//
//    For example, {3, 1, 2, 1, 3, 1, 3, 2, 2} is a Triple array.
//
//    The following arrays are not Triple arrays
//    {2, 5, 2, 5, 5, 2, 5} (5 occurs four times instead of three times)
//    {3, 1, 1, 1} (3 occurs once instead of three times)

public class TripleArray {
    public static void main(String[] args) {
        test(new int[] {3, 1, 2, 1, 3, 1, 3, 2, 2}, 1);
        test(new int[] {2, 5, 2, 5, 5, 2, 5}, 0);
        test(new int[] {3, 1, 1, 1} , 0);
    }

    static int isTriple(int[] a) {
        if (a.length < 3) return 0;
        for (int i = 0; i < a.length; i++) {
            int count = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[j] == a[i]) count++;
            }

            if (count != 3) return 0;
        }

        return 1;
    }

    static void test(int[] a, int e) {
        if (isTriple(a) == e) {
            System.out.println("PASSED");
        } else {
            System.err.println(">>> FAILED");
        }
    }
}
