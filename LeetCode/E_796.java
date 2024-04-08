package LeetCode;

public class E_796 {
    public static void main(String[] args) {
        String original = "abcde";
        String rotated = "cdeab";
        char ch2[] = rotated.toCharArray();
        int len = ch2.length - 1;
        boolean flag = false;
        while (len >= 0) {
            char first = ch2[0];
            flag = false;
            for (int i = 0; i < ch2.length - 1; i++) {
                ch2[i] = ch2[i + 1];
            }
            ch2[ch2.length - 1] = first;
            String str = new String(ch2);
            if (str.equals(original)) {
                flag = true;
                break;
            }
            len--;
        }
        if (flag) {
            System.out.println(flag);
        } else {
            System.out.println(flag);
        }
    }

}
