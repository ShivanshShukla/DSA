package Day4.String.Lec1;

public class ReverseString {
    public static void main(String[] args) {
        String str = "example   good a";
        StringBuffer sb = new StringBuffer();
        char arr[] = str.toCharArray();
        char prev = '$';
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ' ' && prev != ' ') {
                sb.append(arr[i]);
                prev = ' ';
            } else {
                sb.append(arr[i]);
                prev = '$';
            }
        }
        System.out.println(sb.toString());
    }
}
