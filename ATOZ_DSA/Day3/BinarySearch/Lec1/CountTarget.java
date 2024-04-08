package Day3.BinarySearch.Lec1;

public class CountTarget {
    public static int countTarget(int arr[], int mid) {
        int count = 0;
        int target = arr[mid];
        while (mid < arr.length) {
            if (target == arr[mid]) {
                count++;
            }
            mid++;
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = { 1 ,2 ,4 ,4, 5 };
        int target = 5;
        int left = 0, right = arr.length - 1;
        int count = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                count = countTarget(arr, mid);
            }
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println(count);
    }

}
