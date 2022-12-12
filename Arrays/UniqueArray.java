import java.util.Arrays;
import java.util.Scanner;

public class UniqueArray {
    public static void main(String[] args) {
        int length = 5;
        int[] arr = new int[length];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    }
}
