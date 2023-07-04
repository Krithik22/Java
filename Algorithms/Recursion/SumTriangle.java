import java.lang.reflect.Array;
import java.util.Arrays;

public class SumTriangle {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        triSum(arr, arr.length);
        // System.out.println(Arrays.toString(triSum(arr, arr.length)));
    }

    // my own method
    static void triSum(int[] arr, int e) {
        int[] newArr = new int[e - 1];
        if (e > 1) {
            for (int i = 0; i < arr.length - 1; i++) {
                newArr[i] = arr[i] + arr[i + 1];
            }
            triSum(newArr, e - 1);
            System.out.println(Arrays.toString(newArr));
        } else {
            return;
        }
    }

    static void triSum(int[] arr) {
        if (arr.length < 1) {
            return;
        }
        int[] newArr = new int[arr.length - 1];
        for (int i = 0; i < arr.length - 1; i++) {
            newArr[i] = arr[i] + arr[i + 1];
        }
        triSum(newArr);
        System.out.println(Arrays.toString(arr));
    }
}
