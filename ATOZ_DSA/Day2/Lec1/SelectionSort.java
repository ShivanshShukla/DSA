package Day2.Lec1;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = { 8, 6, 2, 5, 1 };
        for (int i = 0; i <= arr.length - 2; i++) {
            int min = i;
            for (int j = i; j <= arr.length - 1; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] =    temp;

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        /*
         * for(int i=0;i<arr.length-1;i++){
         * for
         * }
         */

    }

}
