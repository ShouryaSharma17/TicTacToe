import java.util.*;
	public class TicTacToe {

    //choosing options
	public static void chooseOption() {
        Scanner input = new Scanner(System.in);
        System.out.print("Select X or O:");
        String userChoice=input.next();
        System.out.println("User choice is:"+userChoice);
        
        if (userChoice.equalsIgnoreCase("x"))
            System.out.println("Computer's choice:O");
        else if (userChoice.equalsIgnoreCase("o"))
            System.out.println("Computer's choice:X");
        else
            System.out.println("Enter the correct option!");
    }

        public static void main(String args[]) {
            chooseOption();
        }

    }

