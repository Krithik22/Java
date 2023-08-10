import java.util.*;

public class UniqueCnt {
    public static void main(String[] args) {
        int[] nums = { 1, 1, 2, 3, 4, 4, 5, 6, 6, 6, 7, 8 };
        // int[] ans = uniqueArray(nums);
        // System.out.println(Arrays.toString(ans));
        String str = "aabcdedf";
        System.out.println(uniqueString(str));
    }

    static int[] uniqueArray(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (!ans.contains(nums[i])) {
                ans.add(nums[i]);
            }
        }
        int[] answer = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            answer[i] = ans.get(i);
        }
        return answer;
    }

    static String uniqueString(String str) {
        ArrayList<Character> ref = new ArrayList<>();
        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            if (!ref.contains(str.charAt(i))) {
                for (int j = i + 1; j < str.length(); j++) {
                    if (str.charAt(i) == str.charAt(j)) {
                        ref.add(str.charAt(i));
                        break;
                    }
                }
            }
        }
        for (int i = 0; i < str.length(); i++) {
            if (!ref.contains(str.charAt(i))) {
                ans += str.charAt(i);
            }
        }
        return ans;
    }
}