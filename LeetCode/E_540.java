

public class E_540 {
    public static void main(String[] args) {
        int arr[] = { 3, 3, 7, 7, 10, 11, 11 };
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (low == mid) {
                System.out.println(arr[low]);
                break;
            } 
            if (mid % 2 == 0) {
                high = mid - 1;

            } else {
                low = mid + 1;
            }
        }

    }
}
