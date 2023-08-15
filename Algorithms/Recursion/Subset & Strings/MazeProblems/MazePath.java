import java.util.*;

public class MazePath {
    public static void main(String[] args) {
        boolean[][] maze = {
                { true, true, true },
                { true, true, true },
                { true, true, true }
        };
        pathWithDiagonal("", maze, 0, 0);
        // System.out.println(pathList("", maze, 0, 0));

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

    static List<String> pathList(String path, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            List<String> list = new ArrayList<>();
            list.add(path);
            return list;
        }
        List<String> paths = new ArrayList<>();
        if (r < maze.length - 1) {
            paths.addAll(pathList(path + 'D', maze, r + 1, c));
        }
        if (c < maze[0].length - 1) {
            paths.addAll(pathList(path + 'R', maze, r, c + 1));
        }
        return paths;
    }

    static void pathWithDiagonal(String path, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(path);
            return;
        }
        if (r < maze.length - 1) {
            pathWithDiagonal(path + "DOWN - ", maze, r + 1, c);
        }
        if (r < maze.length - 1 && c < maze[0].length - 1) {
            pathWithDiagonal(path + "DIAGONAL - ", maze, r + 1, c + 1);
        }
        if (c < maze[0].length - 1) {
            pathWithDiagonal(path + "RIGHT - ", maze, r, c + 1);
        }
    }
}
