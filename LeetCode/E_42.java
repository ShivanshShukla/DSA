package LeetCode;

public class E_42 {
    public static void main(String[] args) {
        int arr[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        int len = arr.length;
        int left[] = new int[len];
        int right[] = new int[len];
        int index = 0;
        left[index] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            left[i] = Math.max(left[i - 1], arr[i]);
        }
        right[len - 1] = arr[len - 1];
        for (int i = len - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], arr[i]);
        }
        int sum = 0;
        for (int i = 0; i < len; i++) {
            sum += Math.min(left[i], right[i]) - arr[i];
        }
        System.out.println(sum);
    }
}
