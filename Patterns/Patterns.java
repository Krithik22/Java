public class Patterns{
    public static void main(String[] args) {
        pattern3(5);
    }
    static void pattern3(int n){
        int c = 1;
        for (int row = 0; row < 2 * n; row++) {
            if(row > n){
                for(int col = row - n; col > 0; col--){
                    System.out.print("* ");
                }
            } else{
                for (int col = 0; col <= row; col++) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}