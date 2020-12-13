import java.util.Scanner;

public class gettingUserInput {
	

	public static void main(String[] args) {
		
		//Initializing the keyboard
		Scanner keyboard = new Scanner(System.in);
		
		//Asking user to enter an integer
		System.out.println("Enter an integer");
		
		//Getting user input
		int value = keyboard.nextInt();
		
		//Outputting what they entered
		System.out.println("\nYou entered:" + value);
		
	}

}
