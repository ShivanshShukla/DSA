package Day2.Lec2;

public class QuickSort {
    public static int[] qS(int arr[], int low, int high) {
        if (low < high) {
            int pIndex = pivot(arr, low, high);
            qS(arr, low, pIndex - 1);
            qS(arr, pIndex + 1, high);
        }
        return arr;
    }

    public static int pivot(int arr[], int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;
        while (i < j) {
            while (arr[i] <= pivot && i <=high - 1) {
                i++;
            }
            while (arr[j] > pivot && j >= low + 1) {
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

    public static void main(String[] args) {
        int arr[] = { 2, 13, 4, 1, 3, 6, 2 };
        arr = qS(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
