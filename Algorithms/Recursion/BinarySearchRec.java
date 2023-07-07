public class BinarySearchRec {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int ans = search(arr, 8, 0, arr.length);
        System.out.println(ans);
    }

    static int search(int[] nums, int target, int s, int e) {
        if (s > e) {
            return -1;
        }
        int m = s + (e - s) / 2;
        int n = nums[m];
        if (n == target) {
            return m;
        }
        if (n < target) {
            return search(nums, target, m + 1, e);
        }
        return search(nums, target, s, m - 1);
    }
}
