
public class OnetoN {
    public static int[] printNos(int x) {
        // Write Your Code Here
        int arr[] = new int[x];
        num(x, arr);
        return arr;
    }

    public static void num(int x, int[] arr) {
        if (x == 0) {
            return;
        } else {
            arr[x - 1] = x;
            num(x - 1, arr);
        }
    }
}
