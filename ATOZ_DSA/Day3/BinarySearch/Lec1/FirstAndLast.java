package Day3.BinarySearch.Lec1;

public interface FirstAndLast {
    public static void main(String[] args) {
        int arr[] = { 0, 1, 1, 5 };
        int k = 1;
        int i = 0, j = arr.length - 1;
        int first = Integer.MAX_VALUE, last = Integer.MAX_VALUE;
        while (i < arr.length && j >= 0) {
            if (arr[i] == k && first == Integer.MAX_VALUE) {
                first = i;
            }
            if (arr[j] == k && last == Integer.MAX_VALUE) {
                last = j;
            }
            i++;
            j--;
        }
        System.out.println(first + " " + last);
    }
}
