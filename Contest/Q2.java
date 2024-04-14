package Contest;

import java.util.ArrayList;

public class Q2 {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[] = { 4,8,2,8};
            ArrayList<Integer> al = new ArrayList<>();
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (isPrime(arr[i])) {
                    al.add(i);
                    count++;
                }
            }
            if(count==1){
                System.out.println(0);
            }
            else{
                System.out.println(Math.abs(al.get(0)-al.getLast()));
            }
    }
}
