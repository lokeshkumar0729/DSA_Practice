package MazeAndBackTracking;

public class NKnights {
    public static void main(String[] args) {
        int n = 3;
        boolean[][] board = new boolean[n][n];
        System.out.println(knights(board, 0, 0, 3));
    }

    static int knights(boolean[][] board, int row, int col, int Knights) {
        int count = 0;
        if (Knights == 0) {
            display(board);
            return 1;
        }
        if (row == board.length - 1 && col == board.length) {
            return 0;
        }
        if (col == board.length) {
            return knights(board, row + 1, 0, Knights);

        }
        if (isSafe(board, row, col)) {
            board[row][col] = true;
            count += knights(board, row, col + 1, Knights - 1);
            board[row][col] = false;
        }

        count += knights(board, row, col + 1, Knights);
        return count;
    }

    static boolean isSafe(boolean[][] board, int row, int col) {
        if (isValid(board, row - 2, col + 1)) {
            if (board[row - 2][col + 1])
                return false;

        }
        if (isValid(board, row - 2, col - 1)) {
            if (board[row - 2][col - 1])
                return false;

        }
        if (isValid(board, row - 1, col + 2)) {
            if (board[row - 1][col + 2])
                return false;

        }
        if (isValid(board, row - 1, col - 2)) {
            if (board[row - 1][col - 2])
                return false;

        }
        return true;
    }

    static boolean isValid(boolean[][] board, int row, int col) {
        if (row >= 0 && row < board.length && col >= 0 && col < board.length) {
            return true;

        }
        return false;
    }

    static void display(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean element : row) {
                if (element)
                    System.out.print("K ");
                else
                    System.out.print(". ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
