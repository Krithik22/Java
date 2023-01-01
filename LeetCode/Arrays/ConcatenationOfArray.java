import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

// Concatenation of Array
public class ConcatenationOfArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(new InputStreamReader(System.in));
        int len = in.nextInt();
        int[] nums = new int[len];
        int[] ans = new int[(nums.length * 2)];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[i+len] = nums[i];
        }
        System.out.println(Arrays.toString(ans));
    }
}
