package Day1.Hashing;

import java.util.HashMap;

class Count {
    public static int[] Frequency(int arr[], int n) {
        int a[] = new int[n];
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i : arr) {
            if (hm.containsKey(i)) {
                hm.put(i, hm.getOrDefault(i, 0) + 1);
            } else {
                hm.put(i, 1);
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (hm.get(i + 1) != null) {
                a[i] = hm.get(i + 1);
            }
        }
        return a;
    }
}

public class CountFrequnce {
    public static void main(String[] args) {
        int n = 6;
        int arr[] = { 1, 3, 1, 9, 2, 7 };
        int a[] = Count.Frequency(arr, n);
        for (int i : a) {
            System.out.println(i + " ");
        }
    }
}