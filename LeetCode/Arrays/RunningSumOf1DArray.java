import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

// Running sum of 1D array
public class RunningSumOf1DArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(new InputStreamReader(System.in));
        int len = in.nextInt();
        int[] nums = new int[len];
        int[] runningSum = new int[len];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            runningSum[i] = sum;
        }
        System.out.println(Arrays.toString(runningSum));
    }
}
