

public class E_2259 {
    public static void main(String[] args) {
        char digit = '3';
        String s = "133235";
        int count = 0;
        for (Character ch : s.toCharArray()) {
            if (ch == digit)
                count++;
        }
        int prev = Integer.MAX_VALUE;
        StringBuffer sb = new StringBuffer(s);
        if (count == 1) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == digit) {
                    sb = sb.deleteCharAt(i);
                }
            }
        } else {
            for (int i = s.length() - 1; i >= 0; i--) {
                if (s.charAt(i) == digit) {
                    int num = Integer.parseInt(Character.toString(s.charAt(i)));
                    if (num >= prev || s.charAt(i) == digit) {
                        sb = sb.deleteCharAt(i);
                        break;
                    }
                    prev = Integer.parseInt(Character.toString(s.charAt(i)));
                }
            }
        }
        System.out.println(sb.toString());

    }
}
