public class FirstBadVersion {
    public boolean isBadVersion(int n){
        int bad = 4;
        if(n == 4){
            return true;
        }
        return false;
    }
    public int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        while(start < end){
            int mid = start + (end - start)/2;
            if(isBadVersion(mid)){
                end = mid;
            } else{
                start = mid + 1;
            }
        }
        return start;
    }
}
