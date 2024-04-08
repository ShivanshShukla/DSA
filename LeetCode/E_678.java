package LeetCode;

import java.util.Collections;

public class E_678 {
    public static void main(String[] args) {
        // valid brackets;
        String s = "(((((*(()((((*((**(((()()*)()()()*((((**)())*)*)))))))(())(()))())((*()()(((()((()*(())*(()**)()(())";
        int starCount = 0;
        int bracs = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                bracs++;
            } else if (s.charAt(i) == ')') {
                bracs--;
            } else if (s.charAt(i) == '*') {
                starCount++;
            }

        }
        if (bracs == 0) {
            System.out.println(true);
        } else if (bracs + starCount >= 0) {
            if (starCount > 0) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        }
        System.out.println(bracs);
        System.out.println(starCount);
    }
}
