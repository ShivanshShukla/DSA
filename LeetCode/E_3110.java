

public class E_3110 {
    public static void main(String[] args) {
        String s = "hello";
        char a[] = s.toCharArray();
        int sum = 0;
        for (int i = 0; i < a.length - 1; i++) {
            sum += Math.abs(a[i] - a[i + 1]);
        }
        System.out.println(sum);
    }
}