import java.util.Arrays;

public class BS2DArrays {
    static int[] search(int[][] matrix, int target){
        int row = 0;//Lower Bound
        int col = matrix.length - 1;//Upper Bound
        while(row < matrix.length && col >= 0){
            if (matrix[row][col] == target) {
                return new int[]{row,col};
            } else if(matrix[row][col] < target){
                row++;
            } else{
                col--;
            }
        }
        return new int[]{-1,-1};
    } 
    public static void main(String[] args) {
        int[][] matrix = {
            {10,20,30,40},
            {15,25,35,45},
            {28,29,37,49},
        };
        int[] ans = search(matrix, 35);
        System.out.println(Arrays.toString(ans));
    }   
}
