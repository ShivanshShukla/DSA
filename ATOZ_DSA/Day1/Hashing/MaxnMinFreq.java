package Day1.Hashing;

import java.util.HashMap;
import java.util.Map;

class Frequency {
    public static int[] count(int arr[]) {
        int n = arr.length;
        HashMap<Integer, Integer> maparr = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (maparr.containsKey(arr[i])) {
                maparr.put(arr[i], maparr.get(arr[i]) + 1);
            } else {
                maparr.put(arr[i], 1);
            }
        }
        int maxfreq = 0, minfreq = n;
        int maxele = 0, minele = 0;
        for (Map.Entry<Integer, Integer> it : maparr.entrySet()) {

            int count = it.getValue();
            int element = it.getKey();

            if (count > maxfreq || (count == maxfreq && element < maxele)) {

                maxele = element;
                maxfreq = count;
            }
            if (count < minfreq || (count == minfreq && element < minele)) {
                minele = element;
                minfreq = count;
            }
        }
        return new int[] { maxele, minele };
    }
}

public class MaxnMinFreq {
    public static void main(String[] args) {
        int arr[] = { 10, 10, 10, 3, 3, 3 };
        int ar[] = Frequency.count(arr);
        System.out.println(ar[0] + " " + arr[1]);
    }
}
