import java.util.Arrays;
public class InsertionSort{
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    static void insertion(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if(arr[j] < arr[j - 1]){
                    swap(arr, j, j - 1);
                } else{
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {5,4,3,2,1};
        insertion(nums);
        System.out.println(Arrays.toString(nums));
    }
}