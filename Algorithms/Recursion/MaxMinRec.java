import java.util.Arrays;

public class MaxMinRec {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 3, -5, -4, 8, 6 };
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int[] ans = maxMin(arr, max, min, 0);
        System.out.println(Arrays.toString(ans));
    }

    static int[] maxMin(int[] nums, int max, int min, int ind) {
        if (ind > nums.length - 1) {
            return new int[] { max, min };
        }
        if (nums[ind] > max) {
            max = nums[ind];
        }
        if (nums[ind] < min) {
            min = nums[ind];
        }
        ind++;
        return maxMin(nums, max, min, ind);
    }
}
