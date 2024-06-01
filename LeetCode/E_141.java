
import java.util.HashMap;
import java.util.Map;

public class E_141 {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 1, 2, 3 };
        int i = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        while (i < arr.length) {
            if (hm.containsKey(arr[i])) {
                break;
            }
            hm.put(i, arr[i]);
            i++;
        }
        
    }
}
