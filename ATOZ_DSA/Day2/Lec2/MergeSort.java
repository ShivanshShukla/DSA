package Day2.Lec2;

import java.util.ArrayList;

class MS {
    public static int[] mergeSort(int arr[], int low, int high) {
        if (low >= high) {
            return arr;
        }
        int mid = (low + high) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        return merger(arr, low, mid, high);
    }

    public static int[] merger(int arr[], int low, int mid, int high) {
        ArrayList<Integer> al = new ArrayList<>();
        int left = low;
        int right = mid + 1;
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                al.add(arr[left]);
                left++;
            } else {
                al.add(arr[right]);
                right++;
            }
        }
        while (left <= mid) {
            al.add(arr[left]);
            left++;
        }
        while (right <= high) {
            al.add(arr[right]);
            right++;
        }
        for (int i = 0; i < al.size(); i++) {
            arr[i+low] = al.get(i);
        }
        return arr;
    }
}

public class MergeSort {
    public static void main(String[] args) {
        int arr[] = { 2, 13, 4, 1, 3, 6, 2 };
        arr = MS.mergeSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
