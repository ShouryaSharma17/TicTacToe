import java.util.*;
	public class TicTacToe {

    //creating board
    public static char[] createBoard() {
        char[] board = new char[10];
        for (int i = 1; i < board.length; i++) {
            System.out.println(board[i]);
        }
        return board;
	}
        public static void main(String args[]) {
            createBoard();
        }

    }

