import java.util.Scanner;

public class switchBlock {

	public static void main(String[] args) {

		// Initializing scanner
		Scanner keyboard = new Scanner(System.in);

		// Switch block mainly check only int and String. However, other types of
		// variables can be used. They are just less common.

		// Getting user input
		System.out.println("Please enter a command");
		String command = keyboard.nextLine();

		// Switch block
		switch (command) {

		case "Start":
			System.out.println("Machine started");
			break;

		case "start":
			System.out.println("Machine started");
			break;

		case "Stop":
			System.out.println("Machine stopped");
			break;

		case "stop":
			System.out.println("Machine stopped");
			break;

		default:
			System.out.println("Command not recognized. Exiting program...");
			System.exit(0);

		}

	}

}
