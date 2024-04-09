package LeetCode;

public class E_234 {
    public static void main(String[] args) {
        String s1 = "", s2 = "";
        StringBuilder sb = new StringBuilder("121");
        s1 = sb.toString();
        s2 = sb.reverse().toString();
        System.out.println(s1.equals(s2));
    }
}
