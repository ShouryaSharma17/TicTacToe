import java.util.*;
import java.awt.*;


public class TicTacToe
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char[] board = new char[10];

		System.out.println("WELCOME TO TIC-TAC-TOE");
		assignBlankSpace(board);
		showBoard(board);
		System.out.println("Player:Enter the choice(X | O)");
		char player = Character.toUpperCase(input.next().charAt(0));
		char computer = (player == 'X' ? 'O' : 'X');
		System.out.println("Player choice: " + player + "\nComputer choice: " + computer);
		toss(player, computer, board, input);
	}

	public static void assignBlankSpace(char[] board) {

		for (int i = 1; i < 10; i++)
			board[i] = ' ';

	}

	public static void showBoard(char[] board) {
		System.out.println("\tBOARD FORMAT");
		System.out.println("\t  " + board[1] + "| " + board[2] + " | " + board[3] + "\n\t-----------");
		System.out.println("\t  " + board[4] + "| " + board[5] + " | " + board[6] + "\n\t-----------");
		System.out.println("\t  " + board[7] + "| " + board[8] + " | " + board[9]);
	}

	public static boolean playerMove(char player, char[] board, Scanner input) {
		System.out.println("Enter the position player want to move(1-9)");
		int pos = input.nextInt();
		if (board[pos] == ' ') {
			board[pos] = player;
			showBoard(board);
			return (checkWinner(board, player));
		} else
			System.out.println("Place is occupied");
		return playerMove(player, board, input);
	}
	
	public static boolean computerMove(char computer, char player, char[] board) {
		int check = nextMove(computer, player, board);
		if (check == 0)
			return false;
		board[check] = computer;
		showBoard(board);
		return checkWinner(board, computer);

	}
	
	public static void toss(char player, char computer, char[] board, Scanner input) {
		int HEAD = 1;
		double toss = Math.floor(Math.random() * 10) % 2;
		if (toss == HEAD) {
			System.out.println("Player will make the first move");
		
		} else {
			System.out.println("Computer will make the first move");
	
		}

	}
	
	public static boolean checkWinner(char[] board, char ch) {
		return ((board[1] == ch && board[2] == ch && board[3] == ch)
				|| (board[4] == ch && board[5] == ch && board[6] == ch)
				|| (board[7] == ch && board[8] == ch && board[9] == ch)
				|| (board[1] == ch && board[4] == ch && board[7] == ch)
				|| (board[2] == ch && board[5] == ch && board[8] == ch)
				|| (board[3] == ch && board[6] == ch && board[9] == ch)
				|| (board[1] == ch && board[5] == ch && board[9] == ch)
				|| (board[3] == ch && board[5] == ch && board[7] == ch));
	}

	public static int couldBeWinner(char ch, char[] board) {
		if (board[1] == ch && board[2] == ch && board[3] == ' ')
			return 3;
		else if (board[1] == ch && board[3] == ch && board[2] == ' ')
			return 2;
		else if (board[2] == ch && board[3] == ch && board[1] == ' ')
			return 1;
		else if (board[4] == ch && board[5] == ch && board[6] == ' ')
			return 6;
		else if (board[4] == ch && board[6] == ch && board[5] == ' ')
			return 5;
		else if (board[6] == ch && board[5] == ch && board[4] == ' ')
			return 4;
		else if (board[7] == ch && board[8] == ch && board[9] == ' ')
			return 9;
		else if (board[7] == ch && board[9] == ch && board[8] == ' ')
			return 8;
		else if (board[8] == ch && board[9] == ch && board[7] == ' ')
			return 7;

		else if (board[1] == ch && board[4] == ch && board[7] == ' ')
			return 7;
		else if (board[1] == ch && board[7] == ch && board[4] == ' ')
			return 4;
		else if (board[7] == ch && board[4] == ch && board[1] == ' ')
			return 1;
		else if (board[5] == ch && board[8] == ch && board[2] == ' ')
			return 2;
		else if (board[5] == ch && board[2] == ch && board[8] == ' ')
			return 8;
		else if (board[8] == ch && board[2] == ch && board[5] == ' ')
			return 5;
		else if (board[3] == ch && board[6] == ch && board[9] == ' ')
			return 9;
		else if (board[3] == ch && board[9] == ch && board[6] == ' ')
			return 6;
		else if (board[6] == ch && board[9] == ch && board[3] == ' ')
			return 3;

		else if (board[1] == ch && board[5] == ch && board[9] == ' ')
			return 9;
		else if (board[1] == ch && board[9] == ch && board[5] == ' ')
			return 5;
		else if (board[5] == ch && board[9] == ch && board[1] == ' ')
			return 1;

		else if (board[3] == ch && board[5] == ch && board[7] == ' ')
			return 7;
		else if (board[7] == ch && board[5] == ch && board[3] == ' ')
			return 3;
		else if (board[7] == ch && board[3] == ch && board[5] == ' ')
			return 5;
		return 0;

	}
	
	private static int nextMove(char computer, char player, char[] board) {
		int check = couldBeWinner(computer, board);
		if (check == 0)
			check = couldBeWinner(player, board);
		if (check == 0) {
			if (board[1] == ' ')
				return 1;
			else if (board[3] == ' ')
				return 3;
			else if (board[7] == ' ')
				return 7;
			else if (board[9] == ' ')
				return 9;
			else if (board[5] == ' ')
				return 5;
		}
	
		return check;
	}



}
