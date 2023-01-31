package Problems;

public class SetMismatch {
    public int[] findErrorNums(int[] nums) {
        int ind = 0;
        int n = nums.length;
        while(ind < n){
            int correctInd = nums[ind] - 1;
            if(nums[ind] != nums[correctInd]){
                int temp = nums[ind];
                nums[ind] = nums[correctInd];
                nums[correctInd] = temp;
            } else{
                ind++;
            }
        }
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != i + 1){
                return new int[]{nums[i],i + 1};
            }
        }
        return new int[]{-1,-1};
    }
}
