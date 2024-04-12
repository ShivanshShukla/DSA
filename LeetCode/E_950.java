package LeetCode;

import java.util.*;;

public class E_950 {

    public static void main(String[] args) {
        int arr[] = { 17, 13, 11, 2, 3, 5, 7,18 };
        Arrays.sort(arr);
        Queue<Integer> q = new LinkedList<>();
        for (int i : arr) {
            q.add(i);
        }
        int element = q.remove();
        int index = 1;
        arr[0] = element;
        int prev = element;
        while (!q.isEmpty() && index < arr.length) {
            if (index % 2 == 1) {
                arr[index] = -999;
                prev = -999;
                index++;
            } else {
                element = q.remove();
                arr[index] = element;
                prev = element;
                index++;
            }
        }
        while (!q.isEmpty()) {
            if (index >= arr.length) {
                index = 0;
            }
            if (prev == -999 && arr[index] == -999) {
                element = q.remove();
                arr[index] = element;
                prev = element;
                index++;
                continue;
            } else if (arr[index] == -999) {
                prev = -999;
                index++;
            } else {
                index++;
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}