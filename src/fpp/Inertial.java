package fpp;

//    An array is defined to be inertial if the following conditions hold:
//        a. it contains at least one odd value
//        b. the maximum value in the array is even
//        c. every odd value is greater than every even value that is not the maximum value.
//
//    So {11, 4, 20, 9, 2, 8} is inertial because
//        a. it contains at least one odd value
//        b. the maximum value in the array is 20 which is even
//        c. the two odd values (11 and 9) are greater than all the
//    even values that are not equal to 20 (the maximum), i.e., (4, 2, 8}.
//
//    However, {12, 11, 4, 9, 2, 3, 10} is not inertial because it fails condition (c),
//        i.e., 10 (which is even) is greater 9 (which is odd) but 10 is not the maximum value in the array.


public class Inertial {
    public static void main(String[] args) {
        test(new int[] {11, 4, 20, 9, 2, 8} , 1);
        test(new int[] {12, 11, 4, 9, 2, 3, 10} , 0);
        test(new int[] {1}, 0);
        test(new int[] {2}, 0);
        test(new int[] {1, 2, 3, 4}, 0);
        test(new int[] {1, 1, 1, 1, 1, 1, 2}, 1);
        test(new int[] {2, 12, 4, 6, 8, 11}, 1);
        test(new int[] {2, 12, 12, 4, 6, 8, 11}, 1);
        test(new int[] {-2, -4, -6, -8, -11}, 0);
        test(new int[] {2, 3, 5, 7}, 0);
        test(new int[] {2, 4, 6, 8, 10}, 0);
    }

    static int isInertial(int[] a) {
        if (a.length < 1) return 0;

        boolean hasOdd = false;
        int max = a[0], maxEven = a[0], secondMaxEven = a[0];
        int countEven = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 1) hasOdd = true;
            else {
                countEven++;
                if (a[i] > maxEven) {
                    secondMaxEven = maxEven;
                    maxEven = a[i];
                }
            }

            if (a[i] > max) {
                max = a[i];
            }
        }

        if (!hasOdd) {
            return 0;
        }

        if (max % 2 != 0) {
            return 0;
        }

        if (countEven < 2 || secondMaxEven % 2 != 0) return 1;

        for (int x : a) {
            if (x % 2 == 1 && x <= secondMaxEven) {
                return 0;
            }
        }
        return 1;
    }

    static void test(int[] a, int e) {
        if (isInertial(a) == e) {
            System.out.println("PASSED");
        } else {
            System.out.println(">>> FAILED");
        }
    }
}
