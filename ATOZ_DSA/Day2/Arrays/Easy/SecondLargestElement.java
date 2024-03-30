package Day2.Arrays.Easy;

public class SecondLargestElement {
    public static void main(String[] args) {
        int arr[] = { 2,5,1,6,3,9,12,14,19 };
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (min < arr[i])
                continue;
            else
                min = arr[i];
        }
        int secondLargest = Integer.MIN_VALUE;
        int secondMinimum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > secondLargest && arr[i] != max) {
                secondLargest = arr[i];
            }

        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != min && arr[i] > secondMinimum) {
                secondMinimum = arr[i];
                break;
            }
        }
        System.out.println(max);
        System.out.println(min);
        System.out.println(secondLargest);
        System.out.println(secondMinimum);
    }
}
