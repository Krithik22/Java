public class LinearSearch{
    static int linearSearch(int[] arr, int target){
        // traverse through the array and return the index if the element is found
        // return -1 if element not found
        for (int i = 0; i < arr.length; i++) {
            if(target == arr[i]){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {2,5,6,3,9,1};
        int ans = linearSearch(nums, 5);
        System.out.println("Element found at " + ans);
    }
}
// Time Complexity: Best case - O(1); Worst Case - O(n)