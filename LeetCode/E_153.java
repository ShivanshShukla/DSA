package LeetCode;

public class E_153 {
    public static void main(String[] args) {
        int arr[] = { 3, 4, 5, 1, 2 };
        int low = 0;
        int high = arr.length - 1;
        while (low < high) {
            int mid = (low+high) / 2;
            if (arr[mid] > arr[high]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        System.out.println(arr[low]);
    }
}
