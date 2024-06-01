

import java.util.*;

public class E_20 {
    public static void main(String[] args) {
        String s = "()";
        int i = 0;
        Stack<Character> s1 = new Stack<>();
        while (i < s.length()) {
            if (s.charAt(i) == '(') {
                s1.push(')');
            } else if (s.charAt(i) == '[') {
                s1.push(']');
            } else if (s.charAt(i) == '{') {
                s1.push('}');
            }
            if (s1.isEmpty() || s1.pop() != s.charAt(i)) {
                System.out.println(false);
            }
        }
    }
}
