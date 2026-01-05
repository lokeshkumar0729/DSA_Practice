

import java.util.*;

public class NQueens {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
       List<List<String>> list = queens(board, 0);
       System.out.println(list);
    }

    static  List<List<String>> queens(boolean[][] board, int row) {
        if (row == board.length) {
             List<List<String>> Outer  = new ArrayList<>();
             Outer.add(construct(board));
             return Outer;
        }
        List<List<String>> outer  = new ArrayList<>();
        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = true;
                outer.addAll(queens(board, row+1));
                board[row][col] = false;
            }
        }
return outer;
    }

    static boolean isSafe(boolean[][] board, int row, int col) {
        for (int i = 0; i < row; i++) {
            if (board[i][col]) {
                return false;
            }
        }
        int min = Math.min(row, col);
        for (int j = 1; j <= min; j++) {
            if (board[row - j][col - j])
                return false;
        }
        int maxright = Math.min(row, board.length - col - 1);
        for (int i = 1; i <= maxright; i++) {
            if (board[row - i][col + i])
                return false;
        }
        return true;
    }

    static void display(boolean[][] board) {
        for (boolean[] num : board) {
            for (boolean element : num) {
                if (element)
                    System.out.print("Q ");

                else
                    System.out.print(". ");
            }
            System.out.println();
        }
    }
    static List<String> construct(boolean[][] board){
        List<String> res = new ArrayList<>();
                for(boolean[] row : board){
                
                    StringBuilder sb = new StringBuilder();
                    for(boolean ele : row){
                    if(ele){ sb.append("Q");}
                    else {
                    sb.append(".");
                    }
                    }
                    res.add(sb.toString());
                    }
                return res;
                }
    
    }

