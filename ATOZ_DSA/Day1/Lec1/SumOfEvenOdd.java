package Day1.Lec1;

import java.util.Scanner;

public class SumOfEvenOdd {

    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sumOfEven = 0;
        int sumOfOdd = 0;
        while (num > 0) {
            int rem = num % 10;
            if (rem % 2 == 0) {
                sumOfEven += rem;
            } else {
                sumOfOdd += rem;
            }
            num = num / 10;
        }
        System.out.println(sumOfEven + " " + sumOfOdd);
        sc.close();
    }
}
