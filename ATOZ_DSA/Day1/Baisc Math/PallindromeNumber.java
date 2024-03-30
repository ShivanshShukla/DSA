public class PallindromeNumber {

    public static boolean palindromeNumber(int n) {
        // Write your code here.
        int num = n;
        int rev = 0;
        while (num > 0) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        return n == rev ? true : false;
    }
}
