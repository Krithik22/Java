import java.util.Arrays;

public class ShuffleTheArray {
    public static int[] soln(int[] nums, int n){
        int[] ans = new int[(n*2)];
        int index = 0;
        for (int i = 0; i < ans.length; i++) {
            if(i%2 == 0){
                ans[i] = nums[index];
                index++;
            } else{
                ans[i] = nums[(index-1)+n];
            }
        }
        return ans;
    }
    public static int[] anotherSoln(int[] nums, int n){
        int[] ans = new int[nums.length];
        int flag1 = 0, flag2 = n;
        for (int i = 0; i < ans.length; i++) {
                if(i%2 == 0){
                    ans[i] = nums[flag1];
                    flag1++;
                } else{
                    ans[i] = nums[flag2];
                    flag2++;
                }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int[] ans = anotherSoln(nums,3);
        System.out.println(Arrays.toString(ans));
        // soln({2,5,1,3,4,7}, 3);
    }
}
