package Day2.Arrays.Easy;

public class RemoveDuplicates {
    public static void main(String[] args) {
        // You are given a sorted integer array 'arr' of size 'n'.
        int arr[] = { 1, 2, 2, 3, 4 };
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        System.out.println(i + 1);// number of distinct elements in an array

    }
}
