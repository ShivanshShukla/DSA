

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class E_451 {
    public static void main(String[] args) {
        String s = "Aabb";
        char ch[] = s.toCharArray();
        Arrays.sort(ch);
        System.out.println();
        LinkedHashMap<Character, Integer> mapFrequency = new LinkedHashMap<>();
        for (int i = 0; i < ch.length; i++) {
            if (mapFrequency.containsKey(ch[i])) {
                mapFrequency.put(ch[i], mapFrequency.getOrDefault(ch[i], 0) + 1);
            } else {
                mapFrequency.put(ch[i], 1);
            }
        }
        List<Map.Entry<Character, Integer>> entryList = new ArrayList<>(mapFrequency.entrySet());
        Collections.sort(entryList, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                // Sort by frequency in descending order
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        LinkedHashMap<Character, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<Character, Integer> entry : entryList) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : entryList) {
            while (entry.getValue() > 0) {
                sb.append(entry.getKey());
                entry.setValue(entry.getValue() - 1);
            }
        }
        System.out.println(sb.toString());
    }
}
