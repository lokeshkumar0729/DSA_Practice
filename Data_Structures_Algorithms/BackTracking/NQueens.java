package MazeAndBackTracking;

public class NQueens {
    public static void main(String[] args) {
        int n =4;
boolean[][] board = new boolean[n][n];
System.out.println(queens(board, 0));
    }

    static int queens(boolean[][] board , int row){
    if(row == board.length){  // base condition
    display(board);
    return 1 ;
    }
    int count  = 0;
    // run the for loop , untill the array of boolean gets completed
    for(int col = 0; col < board.length;col++){
    if(isSafe(board,row,col)) {
    board[row][col] = true;
    count += queens(board, row+1);
    board[row][col] = false;
    }

    }
     return count;
}
    static boolean isSafe(boolean[][] board, int row, int col) {
        // check vertically
        for (int i = 0; i < row; i++) {
            if (board[i][col])
                return false;
        }
        // check diagonally left
        int maxLeft = Math.min(row, col);
        for (int i = 1; i <= maxLeft; i++) {
            if (board[row - i][col - i])
                return false;
        }
        // check diagonally right
        int MaxRight = Math.min(row, board.length - col - 1);
        for (int i = 1; i <= MaxRight; i++) {
            if (board[row - i][col + i]) {
                return false;
            }

        }
        return true;
    }

    static void display(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean element : row) {
                if (element)
                    System.out.print("Q ");
                else
                    System.out.print("X ");
            }
            System.out.println();
        }
System.out.println();
    }
}
