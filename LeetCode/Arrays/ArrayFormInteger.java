import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayFormInteger{
    // this solution takes lomger time because when adding the elements it adds in the 0th index and it has to right shift the other elements
    public List<Integer> addToArrayFormSoln1(int[] num, int k) {
        int n = num.length;
        int i = n - 1;
        List<Integer> ans = new ArrayList<Integer>();
        while(k > 0 || i >= 0){
            if(i >= 0){
                int sum = num[i] + k;
                k = sum / 10;
                sum = sum % 10;
                ans.add(0,sum);
            } else{
                int sum = k % 10;
                ans.add(0,sum);
                k = k / 10;
            }
            i--;
        }
        return ans;
    }
    // this solution is faster when compared to the previous one, it adds the element and reverses the array
    public List<Integer> addToArrayFormSoln2(int[] num, int k) {
        int n = num.length;
        int i = n - 1;
        List<Integer> ans = new ArrayList<Integer>();
        while(k > 0 || i >= 0){
            int sum = 0;
            if(i >= 0){
                sum = num[i] + k;
                k = sum / 10;
                sum = sum % 10;
                ans.add(sum);
            } else{
                sum = k % 10;
                ans.add(sum);
                k = k / 10;
            }
            i--;
        }
        Collections.reverse(ans);
        return ans;
    }
        public static List<Integer> addToArrayForm(int[] num, int k) {
            int n = num.length - 1;
            int carry = 0;
            List<Integer> ans = new ArrayList<Integer>();
            while(k > 0 || n >= 0){
                if(n >= 0){
                    int sum = num[n] + k;
                    k = sum / 10;
                    sum = sum % 10;
                    ans.add(0,sum);
                } else{
                    int sum = k % 10;
                    ans.add(0,sum);
                    k = k / 10;
                }
            }
            // own approaches
            // while(k > 0 || n >= 0){
            //     int sum = 0;
            //     // if(k<=0){
            //     //     ans.add(0,num[i]);
            //     //     continue;
            //     // }
            //     int digit = k % 10;
            //     sum = num[n] + digit;
            //     if(carry >= 1){
            //         sum += carry;
            //         carry = 0;
            //     }
            //     if(sum > 9){
            //         sum = sum % 10;
            //         carry = 1;
            //     }
            //     ans.add(0,sum);
            //     k=k/10;
            //     n--;
            // }
            // for(int i = n; i >= 0; i--){
            //     int sum = 0;
                // if(k<=0){
                //     ans.add(0,num[i]);
                //     continue;
                // }
            //     int digit = k % 10;
            //     sum = num[i] + digit;
            //     if(carry >= 1){
            //         sum += carry;
            //         carry = 0;
            //     }
            //     if(sum > 9){
            //         sum = sum % 10;
            //         carry = 1;
            //     }
            //     ans.add(0,sum);
            //     k=k/10;
            // }
            // while(k > 0){
            //     int digit = k % 10;
            //     k = k/10;
            //     ans.add(0,digit);
            // }
            // if(carry >= 1){
            //     ans.add(0,carry);
            // }
            return ans;
        }
    public static void main(String[] args) {
        // int[] num = {1,2,0,0};
        int[] num = {9,9,9,9,9,9,9,9,9,9};
        List<Integer> ans = addToArrayForm(num, 1);
        System.out.println(ans);
    }
}