import java.util.Arrays;

public class BSSortedMatrix {
    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target){
        while(cStart <= cEnd){
            int mid = cStart + (cEnd - cStart)/2;
            if(matrix[row][mid] == target){
                return new int[]{row,mid};
            }
            if(matrix[row][mid] < target){
                cEnd = mid;
            } else{
                cStart = mid;
            }
        }
        return new int[]{-1,-1};
    }

    static int[] search(int[][] matrix, int target){
        int rows = matrix.length;
        int cols = matrix[0].length;
        if(rows == 1){
            return binarySearch(matrix, 0, 0, cols - 1, target);
        }
        int rowStart = 0;
        int rowEnd = rows - 1;
        int colMid = cols/2;
        while (rowStart < (rowEnd - 1)) {
            int rowMid = rowStart + (rowEnd - rowStart)/2;
            if (matrix[rowMid][colMid] == target) {
                return new int[]{rowMid,colMid};
            }
            if (matrix[rowMid][colMid] < target) {
                rowStart = rowMid;
            } else{
                rowEnd = rowMid;
            }
            // Now we'll have 2 rows remaining
            // Check for the target in cols of 2 rows
            if (matrix[rowStart][colMid] == target) {
                return new int[]{rowStart,colMid};
            }
            if (matrix[rowStart + 1][colMid] == target) {
                return new int[]{rowStart + 1,colMid};
            }

            // now if not found search in the four remaining parts of the matrix
            // search in 1st half
            if (target <= matrix[rowStart][colMid - 1]) {
                return binarySearch(matrix, rowStart, 0, colMid - 1, target);
            }
            // search in 2nd half
            if (target >= matrix[rowStart][colMid + 1] && target <= matrix[rowStart][cols - 1]) {
                return binarySearch(matrix, rowStart, colMid + 1, cols - 1, target);
            }
            // search in 3rd half
            if (target <=matrix[rowStart + 1][colMid - 1]) {
                return binarySearch(matrix, rowStart + 1, 0, colMid - 1, target);
            } else{
                return binarySearch(matrix, rowStart + 1, colMid + 1, cols - 1, target);
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12}
        };
        int[] ans = search(matrix, 8);
        System.out.println(Arrays.toString(ans));
    }
}
