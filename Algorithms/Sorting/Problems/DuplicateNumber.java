package Problems;

public class DuplicateNumber {
    public void swap(int[] arr, int f, int s){
        int temp = arr[f];
        arr[f] = arr[s];
        arr[s] = temp;
    }

    // My solution
    public void cyclicSort(int[] arr){
        int i = 0;
        int n = arr.length;
        while(i < n){
            int correctIndex = arr[i] - 1;
            if(arr[i] != arr[correctIndex]){
                swap(arr,i,correctIndex);
            } else{
                i++;
            }
        }
    }
    public int findDuplicate(int[] nums) {
        cyclicSort(nums);
        int n = nums.length;
        return nums[n - 1];
    }

    // Kunal's Answer
    public int findDuplicate2(int[] nums) {
        int i = 0;
        int n = nums.length;
        while(i < n){
            if(nums[i] != i + 1){
                int correctIndex = nums[i] - 1;
                if(nums[i] != nums[correctIndex]){
                    swap(nums,i,correctIndex);
                } else{
                    return nums[i];
                }
            } else{
                i++;
            }
        }
        return -1;
    }
}
