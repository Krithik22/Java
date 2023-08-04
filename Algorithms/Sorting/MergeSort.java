import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = { 5, 3, 6, 4, 8, 1, 9, 2, 0 };
        mergeSortInPlace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static int[] mergeSort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        int m = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, m));
        int[] right = mergeSort(Arrays.copyOfRange(arr, m, arr.length));
        return merge(left, right);
    }

    static int[] merge(int[] left, int[] right) {
        int[] merged = new int[left.length + right.length];

        int i = 0;
        int j = 0;
        int k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                merged[k++] = left[i++];
            } else {
                merged[k++] = right[j++];
            }
        }

        while (i < left.length) {
            merged[k++] = left[i++];
        }

        while (j < right.length) {
            merged[k++] = right[j++];
        }

        return merged;
    }

    static void mergeSortInPlace(int[] arr, int s, int e) {
        if (e - s == 1) {
            return;
        }

        int m = (s + e) / 2;
        mergeSortInPlace(arr, s, m);
        mergeSortInPlace(arr, m, e);

        mergeInPlace(arr, s, m, e);

    }

    static void mergeInPlace(int[] arr, int s, int m, int e) {
        int[] merged = new int[e - s];

        int i = s;
        int j = m;
        int k = 0;
        while (i < m && j < e) {
            if (arr[i] < arr[j]) {
                merged[k++] = arr[i++];
            } else {
                merged[k++] = arr[j++];
            }
        }

        while (i < m) {
            merged[k++] = arr[i++];
        }
        while (j < e) {
            merged[k++] = arr[j++];
        }

        for (int k2 = 0; k2 < merged.length; k2++) {
            arr[s + k2] = merged[k2];
        }
    }
}
