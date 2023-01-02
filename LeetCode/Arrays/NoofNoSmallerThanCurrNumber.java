import java.util.Arrays;

public class NoofNoSmallerThanCurrNumber {
    static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            int cnt = 0;
            for(int j = 0; j < nums.length; j++){
                if((i != j) && (nums[j] < nums[i])){
                    cnt++;
                }
            }
            result[i] = cnt;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        int[] ans = smallerNumbersThanCurrent(nums);
        System.out.println(Arrays.toString(ans));
    }
}
