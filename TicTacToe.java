import java.util.*;
import java.awt.*; 


public class TicTacToe
{
	public char board[] = new char[10] ;
	public String user_value;
	


	public void createBoard()
	{
		for(int i=1; i<10 ;i++)
		{
			board[i]= ' ';
			System.out.println("board:["+i+"]="+board[i]);
		}


	}

	public void chooseOption()
	{
		
		System.out.println("Enter X or O ");
		Scanner sc_object = new Scanner(System.in);
		user_value = sc_object.next();
		
		if(user_value.equals("x") || user_value.equals("X"))
		{
			System.out.println(" computer chooses  'O' ");
			
		}
		else if(user_value.equals("o") || user_value.equals("O"))
		{
			System.out.println(" computer chooses 'X' ");
		}
		else
		{
			System.out.println("invalid input");
			chooseOption();
		}
			
		
	}
	
	public void showBoard()
	{
		
		
        System.out.println("|---|---|---|");
        System.out.println("| " + board[1] + " | "
                           + board[2] + " | " + board[3]
                           + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[4] + " | "
                           + board[5] + " | " + board[6]
                           + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[7] + " | "
                           + board[8] + " | " + board[9]
                           + " |");
        System.out.println("|---|---|---|");
    
	}
	
	public void selectLocation()
	{
		System.out.println("Choose location between 1 to 9 ");
		
		Scanner select = new Scanner(System.in);
		int choose = select.nextInt();
		if(board[choose] == ' ')
		{
			System.out.println("Location is empty, enter position");
			
		}
		else
		{
			System.out.println("Location "+choose+ " is not empty. Choose another location");
		}
		}

	public static void main(String[] args)
	{
		TicTacToe Game_object = new TicTacToe();
		Game_object.createBoard();
		Game_object.chooseOption();
		Game_object.showBoard();
		Game_object.selectLocation();
		
	}
}

