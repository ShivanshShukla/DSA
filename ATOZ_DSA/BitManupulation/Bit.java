package BitManupulation;

public class Bit {
    public static int toDecimal(StringBuffer sb) {
        int num = 0;
        int j = 0;
        for (int a = sb.length() - 1; a >= 0; a--) {
            if (sb.charAt(a) == '1') {
                num += Math.pow(2, j);
            }
            j++;
        }
        return num;
    }

    public static void main(String[] args) {
        int num = 528;
        int i = 14;
        int temp = num;
        StringBuffer sb = new StringBuffer("");
        while (num != 0) {
            sb.append(num % 2);
            num = num / 2;
        }
        System.out.println(sb.length());
        sb = sb.reverse();
        int pos = sb.length() - i;
        int original = 0;
        int val = Integer.parseInt(Character.toString(sb.charAt(pos)));
        if (sb.charAt(pos) == '0') {
            sb.deleteCharAt(pos);
            sb.insert(pos, '1');
            temp = toDecimal(sb);
        }
        if (sb.charAt(pos) == '1') {
            sb.deleteCharAt(pos);
            sb.insert(pos, '0');
            original = toDecimal(sb);
        }
        System.out.println(val + " " + temp + " " + original);
    }
}
