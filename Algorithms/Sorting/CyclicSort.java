import java.util.Arrays;

public class CyclicSort {

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static void cyclic(int[] arr){
        int i = 0;
        int n = arr.length;
        while(i < n){
            if(i == arr[i] - 1){
                i++;
            } else{
                int ind = arr[i] - 1;
                swap(arr, i, ind);
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {4,5,2,1,3};
        cyclic(nums);
        System.out.println(Arrays.toString(nums));
    }
}
