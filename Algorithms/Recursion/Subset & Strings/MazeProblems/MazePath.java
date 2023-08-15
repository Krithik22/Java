public class MazePath {
    public static void main(String[] args) {
        boolean[][] maze = {
                { true, true, true },
                { true, true, true },
                { true, true, true }
        };
        path("", maze, 0, 0);

    }

    static void path(String path, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(path);
            return;
        }
        if (r < maze.length - 1) {
            path(path + 'D', maze, r + 1, c);
        }
        if (c < maze[0].length - 1) {
            path(path + 'R', maze, r, c + 1);
        }
    }
}
