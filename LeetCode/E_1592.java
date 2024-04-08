package LeetCode;

public class E_1592 {
    public static void main(String[] args) {
        int k = 2;
        int arr[] = { 1, 2, 3, 4 };
        int start = 0;
        int len = arr.length;
        int end = len - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int element = arr[mid] - (mid + 1);
            if (element >= k) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        System.out.print(start + k);
    }
}
