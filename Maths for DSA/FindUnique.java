public class FindUnique {
    // Every number occurs twice, find the number which is unique
    public static void main(String[] args) {
        int[] nums = { 2, 3, 2, 4, 6, 3, 4 };
        System.out.println(unique(nums));
    }

    static int unique(int[] arr) {
        int uniq = 0;
        for (int n : arr) {
            uniq = uniq ^ n;
        }
        return uniq;
    }
}
