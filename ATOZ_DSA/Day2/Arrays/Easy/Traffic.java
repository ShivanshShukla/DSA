package Day2.Arrays.Easy;

public class Traffic {
    public static void main(String[] args) {
        int arr[] = { 0, 1, 1 };
        int n = arr.length;
        int m = 1;
        int i = 0;
        int count = 0;
        while (i < n) {
            if (arr[i] == 1) {
                count++;
            } else if (arr[i] == 0 && m > 0) {
                count++;
                m--;
            }
            i++;
        }
        System.out.println(count);
    }
}
