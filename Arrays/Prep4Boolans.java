import java.util.Scanner;

public class Prep4Boolans {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cases = in.nextInt();
        for (int i = 0; i < cases; i++) {
            int row=in.nextInt();
            int col=in.nextInt();
            int[][] arr = new int[row][col];
            for (int r = 0; r < row; r++) {
                for(int c = 0; c < col; c++){
                    arr[r][c] = in.nextInt();
                }
            }
            int max = 0;
            int outputRow = -1;
            for (int r = 0; r < row; r++) {
                int cnt = 0;
                for(int c = 0; c < col; c++){
                    if(arr[r][c]==1){
                        cnt++;
                    }
                }
                if(cnt>max){
                    max=cnt;
                    outputRow=r;
                }
            }
            System.out.println(outputRow);
        }
    }
}
