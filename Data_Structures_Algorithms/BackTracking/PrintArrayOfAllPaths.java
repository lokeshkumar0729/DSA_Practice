package MazeAndBackTracking;
import java.util.*;
public class PrintArrayOfAllPaths {
    public static void main(String[] args) {
          boolean[][] arr = {
                { true, true, true },
                { true, true, true },
                { true, true, true },
        };
        int[][] path = new int[arr.length][arr[0].length];
      allDirections(0, 0, arr, "", path, 1);
    }
      static void allDirections(int r, int c, boolean[][] maze, String p ,int[][] path , int step) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            path[r][c] = step;
            for(int[] num : path){
            System.out.println(Arrays.toString(num));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if (!maze[r][c]) {
            return;
        }
        maze[r][c] = false;
        path[r][c] = step;
        if (r < maze.length - 1) {
            allDirections(r + 1, c, maze, p + "D",path , step + 1);

        }
        if (c < maze[0].length - 1) {
            allDirections(r, c + 1, maze, p + "R",path , step + 1);
        }
        if (r > 0) {
            allDirections(r - 1, c, maze, p + "U",path , step + 1);
        }
        if (c > 0) {
            allDirections(r, c - 1, maze, p + "L",path , step + 1);
        }
      
        maze[r][c] = true;
        path[r][c] = 0;
    }
}
