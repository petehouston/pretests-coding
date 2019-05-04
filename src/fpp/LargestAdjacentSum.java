package fpp;

//    Write a function named largestAdjacentSum that iterates through an array computing the sum of adjacent elements
//    and returning the largest such sum. You may assume that the array has at least 2 elements.

public class LargestAdjacentSum {
    public static void main(String[] args) {
        test(new int[] {1, 2, 3, 4}, 7);
        test(new int[] {18, -12, 9, -10}, 6);
        test(new int[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, 2);
        test(new int[] {1, 1, 2, 1, 2, 1, 1, 2, 1, 1}, 3);
    }

    static int largestAdjacentSum(int[] a) {
        if (a.length < 2) return 0;

        int sum = 0;

        for (int i = 1; i < a.length; i++) {
            if (sum < a[i - 1] + a[i]) {
                sum = a[i] + a[i - 1];
            }
        }

        return sum;
    }

    static void test(int[] a, int e) {
        if (largestAdjacentSum(a) == e) {
            System.out.println("PASSED");
        } else {
            System.err.println(">>> FAILED");
        }
    }
}
