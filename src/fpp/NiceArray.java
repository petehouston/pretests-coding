package fpp;

//    A Nice array is defined to be an array where for every value n in the array, there is also an element n-1 or n+1 in the array.
//
//        For example, {2, 10, 9, 3} is a Nice array because
//        2 = 3-1
//        10 = 9+1
//        3 = 2 + 1
//        9 = 10 -1
//
//        Other Nice arrays include {2, 2, 3, 3, 3}, {1, 1, 1, 2, 1, 1} and {0, -1, 1}.
//
//    The array {3, 4, 5, 7} is not a Nice array because of the value 7 which requires that the array contains either
//    the value 6 (7-1) or 8 (7+1) but neither of these values are in the array.
public class NiceArray {
    public static void main(String[] args) {
        test(new int[] {2, 10, 9, 3}, 1);
        test(new int[] {2, 2, 3, 3, 3}, 1);
        test(new int[] {1, 1, 1, 2,1, 1}, 1);
        test(new int[] {0, -1, 1}, 1);
        test(new int[] {3, 4, 5, 7}, 0);
    }

    static int isNice(int[] a) {
        if (a.length < 2) return 0;

        for (int i = 0; i < a.length; i++) {
            boolean exist = false;
            for (int j = 0; j < a.length; j++) {
                if (a[i] + 1 == a[j] || a[i] - 1 == a[j]) {
                    exist = true; break;
                }
            }

            if (!exist) return 0;
        }

        return 1;
    }

    static void test(int[] a, int e) {
        if (isNice(a) == e) {
            System.out.println("PASSED");
        } else
            System.out.println(">>> FAILED");
    }
}
