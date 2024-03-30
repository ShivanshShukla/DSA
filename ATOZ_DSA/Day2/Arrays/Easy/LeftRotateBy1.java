package Day2.Arrays.Easy;



public class LeftRotateBy1 {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int temp = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = temp;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
