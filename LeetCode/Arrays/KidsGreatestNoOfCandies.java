import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsGreatestNoOfCandies{
    static boolean[] soln(int[] arr, int extraCandies){
        boolean[] result = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int ithKidCandy = arr[i] + extraCandies;
            int flag = 0;
            for (int j = 0; j < result.length; j++) {
                if(i == j){
                    continue;
                }
                if(ithKidCandy < arr[j]){
                    flag = 1;
                    break;
                }
            }
            if (flag == 1) {
                result[i] = false;
            } else {
                result[i] = true;
            }
        }
        return result;
    }
    
    // Leetcode typed different function
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList(candies.length);
        for (int i = 0; i < candies.length; i++) {
            int ithKidCandy = candies[i] + extraCandies;
            int flag = 0;
            for (int j = 0; j < candies.length; j++) {
                if(i == j){
                    continue;
                }
                if(ithKidCandy < candies[j]){
                    flag = 1;
                    break;
                }
            }
            if (flag == 1) {
                result.add(false);
            } else {
                result.add(true);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        boolean[] ans = soln(candies, extraCandies);
        System.out.println(Arrays.toString(ans));
    }
}