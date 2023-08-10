import java.util.ArrayList;

public class SubsequenceOfStringWithDuplicates {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2 };
        System.out.println(duplicates(arr));
    }

    static ArrayList<ArrayList<Integer>> duplicates(int[] arr) {
        ArrayList<ArrayList<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());

        for (int num : arr) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                ArrayList<Integer> internal = new ArrayList<>(outer.get(i));
                if (!outer.contains(internal)) {
                    internal.add(num);
                    outer.add(internal);
                }
            }
        }
        return outer;
    }
}
