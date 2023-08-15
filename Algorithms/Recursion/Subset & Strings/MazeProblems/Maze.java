public class Maze {
    public static void main(String[] args) {
        boolean[][] maze = {
                { true, true, true },
                { true, true, true },
                { true, true, true }
        };
        System.out.println(pathCnt(maze, 0, 0));
    }

    static int pathCnt(boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 || c == maze[0].length - 1) {
            return 1;
        }
        // int cnt = 0;
        // if (r < maze.length - 1) {
        // cnt += pathCnt(maze, r + 1, c);
        // }
        // if (c < maze[0].length - 1) {
        // cnt += pathCnt(maze, r, c + 1);
        // }
        // return cnt;
        int left = pathCnt(maze, r + 1, c);
        int right = pathCnt(maze, r, c + 1);
        return left + right;
    }
}
