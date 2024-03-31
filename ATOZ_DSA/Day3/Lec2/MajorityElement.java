package Day3.Lec2;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int arr[] = { 2, 2, 1, 3, 1, 1, 3, 1, 1 };

        HashMap<Integer, Integer> hs = new HashMap<>();
        for (int i : arr) {
            if (hs.containsKey(i)) {
                hs.put(i, hs.getOrDefault(i, 0) + 1);
            } else {
                hs.put(i, 1);
            }
        }
        for (Map.Entry<Integer, Integer> element : hs.entrySet()) {
            if (element.getValue() > arr.length / 2) {
                System.out.println(element.getKey());
            }
        }
    }
}
