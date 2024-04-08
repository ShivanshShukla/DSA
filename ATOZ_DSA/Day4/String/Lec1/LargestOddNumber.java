package Day4.String.Lec1;

public class LargestOddNumber {
    public static void main(String[] args) {
        String s = "10";
        StringBuffer sb = new StringBuffer(s);
        int index = sb.length() - 1;
        while (index >= 0) {
            int num = Character.getNumericValue(sb.charAt(index));
            if (num % 2 == 0) {
                sb.deleteCharAt(index);
            } else {
                break;
            }
            index--;
        }
        System.out.println(sb);
    }
}
