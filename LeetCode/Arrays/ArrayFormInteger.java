import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayFormInteger{
    static List<Integer> addToArrayForm(int[] num, int k) {
        int n = num.length - 1;
        int sum = 0;
        for(int i = 0; i< num.length; i++){
            sum += num[i] * (Math.pow(10, n));
            System.out.println(sum);
            n -= 1;
        }
        sum += k;
        List<Integer> ans = new ArrayList<Integer>();
        while(sum > 0){
            int rem = sum % 10;
            sum /= 10;
            System.out.println("index: " + n + ", rem: " + rem);
            ans.add(0,rem);
            n++;
        }
        return ans;
    }
    public static void main(String[] args) {
        // int[] num = {1,2,0,0};
        int[] num = {9,9,9,9,9,9,9,9,9,9};
        List<Integer> ans = addToArrayForm(num, 1);
        System.out.println(ans);
    }
}