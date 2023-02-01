package Problems;

public class MissingPositiveNumber {
    public void swap(int[] arr, int f, int s){
        int temp = arr[f];
        arr[f] = arr[s];
        arr[s] = temp;
    }
    public int firstMissingPositive(int[] nums) {
        int i = 0;
        int n = nums.length;
        while(i < n){
            int correctIndex = nums[i] - 1;
            if(nums[i] > 0 && nums[i] < n && nums[i] != nums[correctIndex]){
                swap(nums, i, correctIndex);
            } else{
                i++;
            }
        }
        for(int j = 0; j < n; j++){
            if(nums[j] != j + 1){
                return j + 1;
            }
        }
        return n + 1;
    }
}