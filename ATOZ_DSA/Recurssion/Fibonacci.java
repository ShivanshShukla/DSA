public class Fibonacci {
    public static int[] generateFibonacciNumbers(int n) {
        // Write your code here.
        int arr[] = new int[n];
        fibo(arr, n);
        return arr;
    }

    public static void fibo(int arr[], int n) {
        if (n == 1) {
            arr[0] = 0;

            return;
        } else if (n == 2) {
            arr[0] = 0;
            arr[1] = 1;
            return;
        }
        fibo(arr, n - 1);
        arr[n - 1] = arr[n - 2] + arr[n - 3];
    }
}