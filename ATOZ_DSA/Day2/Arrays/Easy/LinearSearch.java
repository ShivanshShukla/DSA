package Day2.Arrays.Easy;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int num = 3;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                System.out.println(true + " " + i);
            }
        }
        System.out.println(false);
    }
}
