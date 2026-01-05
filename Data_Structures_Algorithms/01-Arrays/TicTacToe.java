package Arrays;

import java.util.*;

public class TicTacToe {
    public static void main(String[] args) {
        char[][] board = new char[3][3];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
               board[i][j] = 0;
            }
        }
        char player = 'X';
        try (Scanner sc = new Scanner(System.in)) {
            boolean gameover = false;
             display(board);
            while (!gameover) {
                 if(draw(board)){
                System.out.println("With draw");
                break;
                }
               
                System.out.print("Player " + player + " Enter place:");
                int row = sc.nextInt();
                int col = sc.nextInt();
                if(board[row][col] != 0){
                System.out.println("Invalid please try again!");
                }else
                board[row][col] = player;
                 display(board);
                gameover = haveWon(board, player);
                
                if (gameover) {
                    System.out.println("player " + player + " has Won");
                    break;
                } else {
                    player = (player == 'X') ? 'O' : 'X';
                }

               
            }
        }
    }

    private static boolean draw(char[][] board) {
          for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
               if(board[i][j] == 0){
            return false;
            }
            }
        }
            return true;
    }

    private static boolean haveWon(char[][] board, char player) {
        // check rows
        for (int row = 0; row < board.length; row++) {
            if (board[row][0] == player && board[row][1] == player && board[row][2] == player) {
                return true;
            }
        }
        for (int col = 0; col < board.length; col++) {
            if (board[0][col] == player && board[1][col] == player && board[2][col] == player) {
                return true;
            }
        }
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player)
            return true;
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player)
            return true;

        return false;
    }

    public static void display(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] + " |");
            }
            System.out.println();
        }
    }
}
