package Day1.Recurssion;
public class Nto1 {

    public static int[] printNos(int x) {
        // Write Your Code Here
        int arr[] = new int[x];
        int i = 0;
        num(i, x, arr);
        return arr;
    }

    public static void num(int i, int x, int[] arr) {
        if (x > 0) {
            arr[i] = x;
            num(i + 1, x - 1, arr);
        }
    }
}
