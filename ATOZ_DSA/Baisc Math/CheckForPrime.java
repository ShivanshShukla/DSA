public class CheckForPrime {

    public static String isPrime(int num) {
        // Your code goes here
        boolean flag = true;
        int i = 2;
        if (num == 0 || num == 1) {
            return "NO";
        }
        while (i < num) {
            if (num % i == 0) {
                flag = false;
                break;
            }
            i++;
        }
        if (flag) {
            return "YES";
        } else {
            return "NO";
        }
    }
}
