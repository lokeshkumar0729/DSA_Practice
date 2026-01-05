package MazeAndBackTracking;

public class AllDirections {
    public static void main(String[] args) {
        boolean[][] arr = {
                { true, true, true },
                { true, true, true },
                { true, true, true },
        };
        allDirections(0, 0, arr, "");
    }

    static void allDirections(int r, int c, boolean[][] maze, String p) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }
        if (!maze[r][c]) {
            return;
        }
        maze[r][c] = false;
        if (r < maze.length - 1) {
            allDirections(r + 1, c, maze, p + "D");

        }
        if (c < maze[0].length - 1) {
            allDirections(r, c + 1, maze, p + "R");
        }
        if (r > 0) {
            allDirections(r - 1, c, maze, p + "U");
        }
        if (c > 0) {
            allDirections(r, c - 1, maze, p + "L");
        }

        maze[r][c] = true;
    }
}
