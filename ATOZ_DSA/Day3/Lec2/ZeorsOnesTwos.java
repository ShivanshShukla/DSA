package Day3.Lec2;

public class ZeorsOnesTwos {
    public static int[] quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pIndex = pivot(arr, low, high);
            quickSort(arr, low, pIndex - 1);
            quickSort(arr, pIndex + 1, high);
        }
        return arr;
    }

    public static int pivot(int arr[], int low, int high) {
        int element = arr[low];
        int i = low;
        int j = high;
        while (i < j) {
            while (arr[i] <= element && i <= high - 1) {
                i++;
            }
            while (arr[j] > element && j >= low + 1) {
                j--;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        return j;
    }

    public void sortColors(int[] nums) {
        nums = quickSort(nums, 0, nums.length - 1);
    }
}
