package Day3.BinarySearch.Lec1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SingleElement {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        HashMap<Integer, Integer> hs = new HashMap<>();
        al.add(1);
        al.add(1);
        al.add(2);
        al.add(2);
        al.add(2);
        al.add(4);
        al.add(5);
        al.add(5);
        al.add(5);
        for (Integer integer : al) {
            if (hs.containsKey(integer)) {
                hs.put(integer, hs.getOrDefault(integer, 0) + 1);
            } else {
                hs.put(integer, 1);
            }
        }
        for (Map.Entry<Integer, Integer> element : hs.entrySet()) {
            if (element.getValue() == 1) {
                System.out.println(element.getKey());
            }
        }
    }
}
