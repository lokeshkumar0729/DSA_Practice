package MazeAndBackTracking;

public class SudukoSolver {
    public static void main(String[] args) {
        int[][] board = {
                { 5, 3, 0, 0, 7, 0, 0, 0, 0 },
                { 6, 0, 0, 1, 9, 5, 0, 0, 0 },
                { 0, 9, 8, 0, 0, 0, 0, 6, 0 },
                { 8, 0, 0, 0, 6, 0, 0, 0, 3 },
                { 4, 0, 0, 8, 0, 3, 0, 0, 1 },
                { 7, 0, 0, 0, 2, 0, 0, 0, 6 },
                { 0, 6, 0, 0, 0, 0, 2, 8, 0 },
                { 0, 0, 0, 4, 1, 9, 0, 0, 5 },
                { 0, 0, 0, 0, 8, 0, 0, 7, 9 }
        };
        if (solve(board))
            display(board);
        else {
            System.out.println("cannot slove");

        }

    }

    static boolean solve(int[][] board) {
        int n = board.length;
        int row = -1;
        int col = -1;
        boolean emptyleft = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 0) {
                    row = i;
                    col = j;
                    emptyleft = false;
                    break;
                }

            }
            if (emptyleft == false)
                break;
        }
        if (emptyleft == true)
            return true;
        for (int number = 1; number <= 9; number++) {
            if (isSafe(board, row, col, number)) {
                board[row][col] = number;
                if (solve(board)) {

                    return true;
                }
                board[row][col] = 0;
            }

        }
        return false;
    }

    static boolean isSafe(int[][] board, int row, int col, int num) {
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == num) {
                return false;
            }

        }
        for (int[] nums : board) {
            if (nums[col] == num)
                return false;

        }
        int sqrt = (int) Math.sqrt(board.length);
        int rowstart = row - row % sqrt;
        int colstart = col - col % sqrt;
        for (int i = rowstart; i < rowstart + sqrt; i++) {
            for (int j = colstart; j < colstart + sqrt; j++) {
                if (board[i][j] == num) {
                    return false;
                }
            }
        }
        return true;
    }

    static void display(int[][] board) {
        for (int[] row : board) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
