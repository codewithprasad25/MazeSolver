import java.util.*;

public class DepthFirst {
    public static boolean searchpath(int[][] maze, int x, int y, List<Integer> path) {

        if (maze[y][x] == 3) {
            path.add(x);
            path.add(y);
            return true;
        }
        if (maze[y][x] == 0) {
            maze[y][x] = 2;  // mark visited

            // left
            if (searchpath(maze, x - 1, y, path)) {
                path.add(x);
                path.add(y);
                return true;
            }
            // right
            if (searchpath(maze, x + 1, y, path)) {
                path.add(x);
                path.add(y);
                return true;
            }
            // up
            if (searchpath(maze, x, y - 1, path)) {
                path.add(x);
                path.add(y);
                return true;
            }
            // down
            if (searchpath(maze, x, y + 1, path)) {
                path.add(x);
                path.add(y);
                return true;
            }
        }
        return false;
    }
}
