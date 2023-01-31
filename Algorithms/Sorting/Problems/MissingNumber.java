package Problems;

public class MissingNumber {
        public static void swap(int[] arr, int first, int second){
            int temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;
        }
        public static int missingNumber(int[] nums) {
            int i = 0;
            int ans = 0;
            while(i < nums.length){
                int correctIndex = nums[i] - 1;
                if(nums[i] == 0){
                    i++;
                    continue;
                }
                if(nums[i] != nums[correctIndex]){
                    swap(nums, i, correctIndex);
                } else{
                    i++;
                }
            }
            for(int j = 0; j < nums.length; j++){
                if(nums[j] == 0){
                    ans = j + 1;
                }
            }
            return ans;
        }

        public static int missingNumber2(int[] nums){
            int i = 0;
        int n = nums.length;
        while(i < n){
            if(nums[i] < n && nums[i] != i){
                swap(nums, i, nums[i]);
            } else{
                i++;
            }
        }
        for(int ind = 0; ind < n; ind++){
            if(ind != nums[ind]){
                return ind;
            }
        }
        return n;
        }
}
