package Day2.Arrays.Easy;

public class MovesZerosToend {
    public static void main(String[] args) {
        int arr[] = { 4, 0, 3, 2, 5 };
        int[] nums = new int[arr.length];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                nums[index] = arr[i];
                index++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
