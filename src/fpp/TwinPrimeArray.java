package fpp;

//    Consider the prime number 11. Note that 13 is also a prime and 13 – 11 = 2. So, 11 and 13 are known as twin primes.
//    Similarly, 29 and 31 are twin primes. So is 71 and 73. However, there are many primes for which there is no twin.
//    Examples are 23, 67. A twin array is defined to an array which every prime that has a twin appear with a twin.
//    Some examples are
//        {3, 5, 8, 10, 27}, 	     // 3 and 5 are twins and both are present
//        {11, 9, 12, 13, 23},       // 11 and 13 are twins and both are present, 23 has no twin
//        {5, 3, 14, 7, 18, 67}.      // 3 and 5 are twins, 5 and 7 are twins, 67 has no twin
//
//    The following are NOT twin arrays:
//
//        {13, 14, 15, 3, 5} 	 // 13 has a twin prime and it is missing in the array
//        {1, 17, 8, 25, 67}     // 17 has a twin prime and it is missing in the array

public class TwinPrimeArray {
    public static void main(String[] args) {
        test(new int[] {3, 5, 8, 10, 27}, 1);
        test(new int[] {11, 9, 12, 13, 23}, 1);
        test(new int[] {5, 3, 14, 7, 18, 67}, 1);
        test(new int[] {13, 14, 15, 3, 5}, 0);
        test(new int[] {1, 17, 8, 25, 67}, 0);
    }

    static int isTwin(int[] a) {
        int left = 0, right = 0;

        for (int x : a) {
            if (1 == isPrime(x)) {
                left = x - 2;
                right = x + 2;

                if (1 == isPrime(left) || 1 == isPrime(right)) {
                    boolean found = false;
                    for (int y : a) {
                        if ((y == left || y == right) && 1 == isPrime(y)) {
                            found = true; break;
                        }
                    }

                    if (!found) return 0;
                }
            }
        }

        return 1;
    }

    static void test(int[] a, int e) {
        if (isTwin(a) == e) {
            System.out.println("PASSED");
        } else {
            System.err.println(">>> FAILED");
        }
    }

    static int isPrime(int n) {
        if (n <= 1) return 0;

        if (n == 2 || n == 3 || n == 5) return 1;

        for (int i = 2; i <= Math.sqrt(n); ++i) {
            if (n % i == 0) return 0;
        }

        return 1;
    }
}
