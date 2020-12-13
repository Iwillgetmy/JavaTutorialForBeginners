import java.util.Scanner;

public class doWhile {

	public static void main(String[] args) {
		
		//Initializing scanner
		Scanner keyboard = new Scanner(System.in);
	
		/*Pretty much in the while part in a do while loop you put what you want for when the condition is met. In this case, saying GOT IT when the user inputed the number 5.
		 * In the do part of the do while loop, you repeat something until the condition is met. Once the condition is met, something is done, in this case a sign 
		 * saying that the user found the integer and the loop stops.  
		 *  */
		
		int value;
		
		do {
			
			//Asking user to input a number
			System.out.println("Please enter an integer from 1-10");
			
			//Getting answer
			value = keyboard.nextInt();
		
		} 
		while (value != 5); {
		
			System.out.println("GOT IT!");
	
	}
		
	}
}