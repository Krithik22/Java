import java.util.*;

public class RemoveConsecutiveCharacters {
    public static void main(String[] args) {
        // String ans = solution("aabbaa", 0, " ");
        int[] arr = { 1, 2, 3, 4, 5 };
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
        // System.out.println(ans);
    }

    static void sort(int[] nums, int low, int high) {
        if (low >= high) {
            return;
        }
        int s = low;
        int e = high;
        int m = s + (e - s) / 2;
        int pivot = nums[m];
        while (s <= e) {
            if (nums[s] < pivot) {
                s++;
            }
            if (nums[e] > pivot) {
                e--;
            }
            if (s <= e) {
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }
        sort(nums, low, e);
        sort(nums, s, high);
    }

    static String solution(String str, int ind, String ans) {
        if (ind >= str.length()) {
            return ans;
        }
        char ch = str.charAt(ind);
        if (ch != ans.charAt(ans.length() - 1)) {
            ans += ch;
        }
        return solution(str, ind + 1, ans);
    }
}