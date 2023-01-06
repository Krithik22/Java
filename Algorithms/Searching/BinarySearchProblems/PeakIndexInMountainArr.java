public class PeakIndexInMountainArr {
    static int peakMountainArray(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start)/2;
            if (arr[mid] > arr[mid+1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        // At last both start and end points to a single element which is the peak element
        return start;
    }
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,3,1,0};
        int ans = peakMountainArray(arr);
        System.out.println(ans);
    }
}
