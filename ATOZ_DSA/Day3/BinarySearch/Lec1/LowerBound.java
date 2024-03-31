package Day3.BinarySearch.Lec1;

public class LowerBound {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 3, 4 };
        int n = arr.length, x = 5, max = arr[n - 1], min = arr[0];
        if (x > max) {
            System.out.println(n);
        } else if (x < min) {
            System.out.println(0);
        } else {
            int i;
            for (i = 0; i < n; i++) {
                if (arr[i] > x) {
                    System.out.println(i--);
                    break;
                } else if (arr[i] == x) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
