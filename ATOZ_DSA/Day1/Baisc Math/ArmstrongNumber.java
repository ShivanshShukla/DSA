import java.util.*;

public class ArmstrongNumber {

    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String s = Integer.toString(num);
        int len = s.length();
        int val = num;
        int sum = 0;
        while (num > 0) {
            int rem = num % 10;
            sum += Math.pow(rem, len);
            num = num / 10;
        }
        if (sum == val)
            System.out.println(true);
        else
            System.out.println(false);
        sc.close();
    }
}
