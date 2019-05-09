package mpp.others;

//    Write a method that recursively find an integer in an array

import java.util.NoSuchElementException;

public class RecursiveArrayValueLookup {
    public static void main(String[] args) {
        int[] input = new int[] {1, 2, 3, 4};

        System.out.println(lookup(input, 4, 0));
    }

    static int lookup(int[] a, int needle, int index) {
        if (0 > index || index >= a.length) {
            throw new NoSuchElementException();
        }

        if (a[index] == needle) return index;

        return lookup(a, needle, index + 1);
    }
}
