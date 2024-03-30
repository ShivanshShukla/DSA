package Day2.Arrays.Easy;

public class CheckIfArrayIsSorted {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 9, 6 };
        boolean flag = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                flag = false;
                break;
            }
        }
        if (flag)
            System.out.println(true);
        else
            System.out.println(false);
    }
}
