package Sema;

public class Task2CharArray {
    //    PRINT BELOW GRID
//           X--
//           0--
//           ---
    public static void main(String[] args) {
        char[][] board=new char[3][3];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j]='-';
            }
        }
        board[0][0]='X';
        board[1][0]='0';
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
}
