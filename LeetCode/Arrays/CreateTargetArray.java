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

    static int[] soln2(int[] nums, int[] index){
        int[] result = new int[nums.length];
        int c = 0;
        for (int i = 0; i < nums.length; i++) {
            if(result[index[i]] == 0 && c == 0){
                result[index[i]] = nums[i];
                if(nums[i] == 0){
                    c++;
                }
            } else{
                for(int j = index.length-1; j > index[i]; j--){
                    result[j] = result[j-1];
                }
                result[index[i]] = nums[i];
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {0,1,2,0,0};
        int[] index = {0,1,2,0,1};
        int[] ans = soln2(nums, index);
        System.out.println(Arrays.toString(ans));
    }
}