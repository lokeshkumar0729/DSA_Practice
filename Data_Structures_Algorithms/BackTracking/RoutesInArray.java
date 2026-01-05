
package MazeAndBackTracking;

public class RoutesInArray {
    public static void main(String[] args) {
        // System.out.println(Routes(3, 3));
        // path("", 3, 3);
        // Diagonal("",3, 3);
        boolean[][] arr = {
                { true, true, true },
                { true, false, true },
                { true, true, true },
        };
        AddObstical(0, 0, arr, "");
    }

    static int Routes(int r, int c) {
        if (r == 1 || c == 1)
            return 1;
        int left = Routes(r - 1, c);
        int right = Routes(r, c - 1);
        return left + right;
    }

    static void path(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }
        if (r > 1)
            path(p + 'D', r - 1, c);
        if (c > 1)
            path(p + "R", r, c - 1);
    }

    static void Diagonal(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }
        if (r > 1 && c > 1)
            Diagonal(p + "D", r - 1, c - 1);
        if (r > 1)
            Diagonal(p + 'V', r - 1, c);
        if (c > 1)
            Diagonal(p + "H", r, c - 1);

    }

    static void AddObstical(int r, int c, boolean[][] maze, String p) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }
        if (!maze[r][c])
            return;
        if (r < maze.length - 1) {
            AddObstical(r + 1, c, maze, p + "D");
        }
        if (c < maze[0].length - 1)
            AddObstical(r, c + 1, maze, p + "R");

    }
}
