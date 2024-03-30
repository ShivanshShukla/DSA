package Day1.Lec1;

import java.util.Scanner;

public class NthFiboNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int pos = sc.nextInt();
        int fibo = 1;
        int prev = 1;
        if (pos == 1) {
            System.out.println(1);
        } else if (pos == 2) {
            System.out.println(1);
        } else {
            int count = 2;
            int next = 0;
            while (count < pos) {
                next = fibo + prev;
                prev = fibo;
                fibo = next;
                count++;
            }
            System.out.println(next);
        }
        sc.close();
    }
}
