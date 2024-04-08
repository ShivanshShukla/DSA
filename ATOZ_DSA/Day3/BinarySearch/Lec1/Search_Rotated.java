package Day3.BinarySearch.Lec1;

public class Search_Rotated {

    public static void main(String[] args) {
        int arr[] = { 3,1 };
        int k = 1;
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == k) {
                System.out.println(mid);
                break;
            }
            if (arr[low] <= arr[mid]) {
                if (arr[low] <= k && k <= arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }

            } else {
                if (arr[mid] <= k && k <= arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
    }
}
