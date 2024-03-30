package Day1.Recurssion;

class Res {
    public static int[] Arr(int arr[], int n) {
        int i = 0;
        int j = n - 1;
        reverse(i, j, arr);
        return arr;
    }

    public static int[] reverse(int i, int j, int arr[]) {
        if (i >= j) {
            return arr;
        } else {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            return reverse(i + 1, j - 1, arr);
        }
    }
}

public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        arr = Res.Arr(arr, 5);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
