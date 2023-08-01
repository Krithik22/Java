import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 1 };
        bubbleRecursion(arr, arr.length - 1, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static int max(int[] arr, int e) {
        int max = 0;
        for (int i = 0; i <= e; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static void bubbleRecursion(int[] arr, int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            if (arr[c] > arr[c + 1]) {
                swap(arr, c, c + 1);
                // int temp = arr[c];
                // arr[c] = arr[c + 1];
                // arr[c + 1] = temp;
            }
            bubbleRecursion(arr, r, c + 1);
        } else {
            bubbleRecursion(arr, r - 1, 0);
        }
    }
}
