

public class E_402 {
    public static String removeZeros(String s) {
        StringBuilder r = new StringBuilder(s);
        while (r.charAt(0) == '0') {
            r.deleteCharAt(0);
            if (r.isEmpty())
                return "";
        }
        return r.toString();
    }

    public static void main(String[] args) {
        String s = "10001";
        int k = 4;
        boolean flag = true;
        StringBuilder sb = new StringBuilder(s);
        if (k == sb.length())
            System.out.println("0");
        else {
            while (k > 0 && flag != false) {
                flag = false;
                for (int i = 0; i < sb.length() - 1; i++) {
                    if (sb.charAt(i) > sb.charAt(i + 1)) {
                        sb.deleteCharAt(i);
                        flag = true;
                        k--;
                        break;
                    }
                }
            }
            String newS = removeZeros(sb.toString());
            StringBuilder sb1 = new StringBuilder(newS);
            if (newS.length() < k)
                System.out.println("0");
            else {
                int i = sb1.length() - 1;
                while (k > 0) {
                    sb1.deleteCharAt(i);
                    if (sb1.isEmpty()) {
                        break;
                    }
                    i--;
                    k--;
                }
            }
            // return (sb1.isEmpty() ? "0" : sb1.toString());
        }
    }
}
