package LeetCode;

public class E_85 {
    public static void main(String[] args) {
        String arr[][] = { { "1", "0", "1", "0", "0" }, { "1", "0", "1", "1", "1" }, { "1", "1", "1", "1", "1" },
                { "1", "0", "0", "1", "0" } };
        for (int i = 0; i < arr.length; i++) {
            String size[] = new String[arr[0].length];
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == "1") {
                    
                    if (i > 0) {

                    }
                    size[j]= "1";
                }
                
            }
        }

    }
}
