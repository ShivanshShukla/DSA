class Re {
    public static boolean isPallindrome(String str) {
        String newStr = "";
        newStr = reverse(str, newStr, str.length() - 1);
        return str.equals(newStr) ? true : false;
    }

    public static String reverse(String str, String newStr, int len) {
        if (len < 0) {
            return newStr;
        } else {
            return reverse(str, newStr + str.charAt(len), len - 1);
        }
    }
}

public class PallindromeString {
    public static void main(String[] args) {
        System.out.println(Re.isPallindrome("aabba"));
    }
}