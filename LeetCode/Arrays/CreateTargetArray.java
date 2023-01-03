// import java.util.ArrayList;
import java.util.Arrays;

public class CreateTargetArray{
    static int[] soln(int[] nums, int[] index){
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int ind = index[i];//Storing the value at index array
                int temp = result[ind];//defining a temp variable to store the current value at that index 
                result[ind++] = nums[i];//changing the value at that index and incrementing it
                while(ind < result.length){
                    int temp2 = result[ind];
                    result[ind] = temp;
                    temp = temp2;
                    ind++;
                }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        // int[] nums = {0,1,0};
        // int[] index = {0,1,0};
        int[] ans = soln(nums, index);
        System.out.println(Arrays.toString(ans));
    }
}