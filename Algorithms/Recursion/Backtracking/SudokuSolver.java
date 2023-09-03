public class SudokuSolver {
    public static void main(String[] args) {

    }

    static boolean solve(int[][] board) {
        int n = board.length;
        int r = -1;
        int c = -1;
        boolean emptyLeft = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 0) {
                    r = i;
                    c = j;
                    emptyLeft = false;
                    break;
                }
            }
            // if found some empty element in row, then break
            if (emptyLeft == false) {
                break;
            }
        }
        // sudoku is solved
        if (emptyLeft == true) {
            return true;
        }

        for (int num = 1; num <= 9; num++) {
            if (isSafe(board, r, c, num)) {
                board[r][c] = num;
                if (solve(board)) {
                    // i have found the answer
                    return true;
                } else {
                    // backtrack
                    board[r][c] = 0;
                }
            }
        }
        return false;
    }

    static boolean isSafe(int[][] sudoku, int r, int c, int n) {
        // Check for row
        for (int i = 0; i < sudoku.length; i++) {
            if (sudoku[i][c] == n) {
                return false;
            }
        }
        // chaeck for column
        for (int i = 0; i < sudoku.length; i++) {
            if (sudoku[r][i] == n) {
                return false;
            }
        }

        int sqrt = (int) Math.sqrt(sudoku.length);
        int rStart = r - r % sqrt;
        int cStart = c - c % sqrt;
        // Check for the number within the box
        for (int row = rStart; row < rStart + sqrt; row++) {
            for (int col = cStart; col < cStart + sqrt; col++) {
                if (sudoku[row][col] == n) {
                    return false;
                }
            }
        }

        return true;
    }
}
