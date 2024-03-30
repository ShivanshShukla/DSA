package Day2.Arrays.Easy;

import java.util.ArrayList;

public class RotateArraybyN {
    public static void main(String[] args) {
        // rotate left by n steps;
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            al.add(i);
        }
        int k = 3;
        int arr[] = al.stream().mapToInt(Integer::intValue).toArray();
        while (k > 0) {
            int temp = arr[0];
            for (int i = 0; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[arr.length - 1] = temp;
            k--;
        }
        ArrayList<Integer> al2 = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            al2.add(arr[i]);
        }
    }
}
