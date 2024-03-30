public class ReverseANumber {
    public static long reverseBits(long n) {
        // Write your code here
        long result = 0;

        for (int i = 0; i < 32; i++)

        {

            result <<= 1;

            result |= (n & 1);

            n >>= 1;

        }

        return result;
    }
}
