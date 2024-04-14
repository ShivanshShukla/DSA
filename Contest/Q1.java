package Contest;

public class Q1 {
    public static void main(String[] args) {
        String s = "1?:?4";
        char arr[] = s.toCharArray();
        if (arr[0] == '?') {
            arr[0] = (arr[1] == '?' || arr[1] <= '1') ? '1' : '0';
        }
        if (arr[1] == '?') {
            arr[1] = (arr[0] == '1') ? '9' : '3';
        }
        if (arr[3] == '?') {
            arr[3] = '5';
        }
        if (arr[4] == '?') {
            arr[4] = '9';
        }
    }
}
