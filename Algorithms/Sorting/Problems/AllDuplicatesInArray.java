package Problems;

import java.util.*;

public class AllDuplicatesInArray {
    public void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int i = 0;
        int n = nums.length;
        while(i < n){
            int correctIndex = nums[i] - 1;
            if(nums[i] != nums[correctIndex]){
                swap(nums, i, correctIndex);
            } else{
                i++;
            }
        }

        for(int ind = 0; ind < n; ind++){
            if(nums[ind] != ind + 1){
                int DuplicateVal = nums[ind];
                ans.add(DuplicateVal);
            }
        }
        return ans;
    }
}
