// Solved in (5:56 mins)
public class NoOfGoodPairs {
    static int numIdenticalPairs(int[] nums) {
        int cnt = 0;
        for(int i =0 ;i<nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    cnt++;
                }
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,2};
        int ans = numIdenticalPairs(nums);
        System.out.println(ans);
    }
}
