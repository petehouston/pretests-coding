package fpp;

//    Let us define two arrays as “set equal” if every element in one is also in the other and vice-versa.
//    For example, any two of the following are equal to one another:
//        {1, 9, 12}, {12, 1, 9}, {9, 1, 12, 1}, {1, 9, 12, 9, 12, 1, 9}.
//    Note that {1, 7, 8} is not set equal to {1, 7, 1} or {1, 7, 6}.

public class SetEqual {
    public static void main(String[] args) {
        test(new int[] {1, 9, 12}, new int[] {12, 1, 9}, 1);
        test(new int[] {1, 9, 12}, new int[] {9, 1, 12, 1}, 1);
        test(new int[] {1, 7, 8}, new int[] {1, 7, 1}, 0);
        test(new int[] {1, 7, 8}, new int[] {1, 7, 6}, 0);
        test(new int[] {1, 1}, new int[] {1, 2}, 0);

    }

    static int isSetEqual(int[] a, int[] b) {
        if (a.length == 0 && b.length == 0) return 1;
        else if (a.length == 0 && b.length > 0) return 0;
        else if (a.length > 0 && b.length == 0) return 0;

        for (int x: a) {
            boolean found = false;
            for (int y: b) {
                if (y == x) {
                    found = true; break;
                }
            }
            if (!found) return 0;
        }

        for (int x: b) {
            boolean found = false;
            for (int y: a) {
                if (y == x) {
                    found = true; break;
                }
            }
            if (!found) return 0;
        }

        return 1;
    }

    static void test(int[] a, int[] b, int e) {
        if (isSetEqual(a, b) == e) {
            System.out.println("PASSED");
        } else {
            System.err.println(">>> FAILED");
        }
    }
}
