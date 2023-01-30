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
            int correctInd = arr[i] - 1;
            if(i == correctInd){
                i++;
            } else{
                swap(arr, i, correctInd);
            }
        }
    }

    static void kunalCyclic(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correctIndex = arr[i] - 1;
            if(arr[i] != arr[correctIndex]){
                swap(arr, i, correctIndex);
            } else{
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {4,5,2,1,3};
        kunalCyclic(nums);
        System.out.println(Arrays.toString(nums));
    }
}
