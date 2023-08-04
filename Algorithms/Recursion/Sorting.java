import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] arr = { 6, 3, 8, 5, 2, 9, 1, 0 };
        // int[] arr = { 4, 3, 2, 1 };
        // selectionRecursion(arr, arr.length - 1, 0);
        selection(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static int getMax(int[] arr, int e) {
        int max = 0;
        int ind = 0;
        for (int i = 0; i <= e; i++) {
            if (arr[i] > max) {
                max = arr[i];
                ind = i;
            }
        }
        return ind;
    }

    static void selectionRecursion(int[] arr, int r, int c) {
        if (r == 0) {
            return;
        }
        int max = getMax(arr, r);
        swap(arr, r, max);
        selectionRecursion(arr, r - 1, 0);
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

    static void selection(int[] arr, int r, int c, int max) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            if (arr[c] > arr[max]) {
                selection(arr, r, c + 1, c);
            } else {
                selection(arr, r, c + 1, max);
            }
        } else {
            // swap(arr, r, max);
            int temp = arr[max];
            arr[max] = arr[r - 1];
            arr[r - 1] = temp;
            selection(arr, r - 1, 0, 0);
        }
    }
}
