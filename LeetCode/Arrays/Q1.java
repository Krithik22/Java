import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Q1{
    public static void main(String[] args) {
        Scanner in = new Scanner(new InputStreamReader(System.in));
        int len = in.nextInt();
        int[] nums = new int[len];
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        for (int i = 0; i < nums.length; i++) {
            int val = nums[nums[i]];
            ans[i] = val;
        }
        // System.out.println(Arrays.toString(ans));
        // In leetcode the input will be given by leetcode
    }
}