

import java.util.HashMap;
import java.util.Map;

public class E_206 {
    public static void main(String[] args) {
        int nums[]={1,2,3,4,4,5};
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int num : nums) {
            if (hm.containsKey(num)) {
                hm.put(num, hm.get(num) + 1);
            } else {
                hm.put(num, 1);
            }
        }
        int arr[]=new int[2];
        int index=0;
        for(Map.Entry<Integer,Integer> entry:hm.entrySet()){
            if(entry.getValue()==1){
                arr[index]=entry.getKey();
                index++;
            }
        }
        // return arr;
    }
}