public class SqRt{
    public static int mySqrt(int x) {
       int start = 0;
       int end = x;
       int ans = 0;
       while(start <= end){
           int mid = start + (end - start)/2;
           if(mid * mid <= x){
               ans = mid;
               start = mid + 1;
           } else{
               end = mid - 1;
           }
       } 
       return ans;
    }
    public static int mySqrt2(int x) {
        int start = 1;
        int end = x;
        int ans = 0;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(mid <= x/mid){
                ans = mid;
                start = mid + 1;
            } else{
                end = mid - 1;
            }
        } 
        return ans;
     }
    public static void main(String[] args) {
        int ans = mySqrt2(2147395599);
        System.out.println(ans);
    }
}