package fpp;

//    The number 198 has the property that 198 = 11 + 99 + 88, i.e., if each of its digits is concatenated twice
//        and then summed, the result will be the original number.
//    It turns out that 198 is the only number with this property.
//    However, the property can be generalized so that each digit is concatenated n times and then summed.
//    For example, 2997 = 222+999+999+777 and here each digit is concatenated three times.
//    Write a function named checkContenatedSum that tests if a number has this generalized property.
//    The signature of the function is
//        int checkConcatenatedSum(int n, int catlen)
//    where n is the number and catlen is the number of times to concatenate each digit before summing.
//    The function returns 1 if n is equal to the sum of each of its digits contenated catlen times.
//    Otherwise, it returns 0. You may assume that n and catlen are greater than zero

public class CheckConcatenatedSum {
    public static void main(String[] args) {
        test(198, 2, 1);
        test(198, 3, 0);
        test(2997, 3, 1);
        test(2997, 2, 0);
        test(13332, 4, 1);
        test(9, 1, 1);

    }

    static int checkConcatenatedSum(int n, int catlen) {
        int sum = 0;
        int x = n;
        while (x > 0) {
            int r = x % 10;
            int a = r;
            for (int i = 1; i < catlen; i++) {
                a = a * 10 + r;
            }
            sum += a;
            x /= 10;
        }

        return sum == n ? 1 : 0;
    }

    static void test(int n, int catlen, int e) {
        if (checkConcatenatedSum(n, catlen) == e) {
            System.out.println("PASSED");
        } else {
            System.err.println(">>> FAILED");
        }
    }
}
