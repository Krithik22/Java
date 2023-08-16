import java.util.Arrays;

public class MazeAllPaths {
    public static void main(String[] args) {
        boolean[][] maze = {
                { true, true, true },
                { true, true, true },
                { true, true, true }
        };
        int[][] path = new int[maze.length][maze[0].length];
        // allPath("", maze, 0, 0);
        mazeWithAllPath("", maze, 0, 0, path, 1);
    }

    static void allPath(String path, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(path);
            return;
        }
        if (!maze[r][c]) {
            return;
        }

        // I'm considering this block in my path, so change it to true
        maze[r][c] = false;

        if (r < maze.length - 1) {
            allPath(path + 'D', maze, r + 1, c);
        }
        if (c < maze[0].length - 1) {
            allPath(path + 'R', maze, r, c + 1);
        }
        if (r > 0) {
            allPath(path + 'U', maze, r - 1, c);
        }
        if (c > 0) {
            allPath(path + 'L', maze, r, c - 1);
        }

        // Here the function comes out, so the changes that were made must be restored
        // this line is where the function will be over
        // so before the function gets removed, also remove the changes that were made
        // by that function
        maze[r][c] = true;
    }

    static void mazeWithAllPath(String path, boolean[][] maze, int r, int c, int[][] mazePath, int step) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            mazePath[r][c] = step;
            for (int[] arr : mazePath) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(path);
            return;
        }

        if (!maze[r][c]) {
            return;
        }

        maze[r][c] = false;
        mazePath[r][c] = step;
        if (r < maze.length - 1) {
            mazeWithAllPath(path + 'D', maze, r + 1, c, mazePath, step + 1);
        }

        if (c < maze[0].length - 1) {
            mazeWithAllPath(path + 'R', maze, r, c + 1, mazePath, step + 1);
        }

        if (r > 0) {
            mazeWithAllPath(path + 'U', maze, r - 1, c, mazePath, step + 1);
        }

        if (c > 0) {
            mazeWithAllPath(path + 'L', maze, r, c - 1, mazePath, step + 1);
        }

        maze[r][c] = true;
        mazePath[r][c] = 0;
    }
}
