package Day3.BinarySearch.Lec1;

public class FindX {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int target = 3;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println(i);
                break;
            }
        }
    }
}
