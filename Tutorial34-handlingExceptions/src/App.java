import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

//To find out why there is an error, go to left of the screen and hover mouse over the error symbol

//Putting a try catch will try the code and see if it works and has no errors. But if there is an error, it will go to the catch part and 
//deal with the problem in the catch section. You write what happens if the code goes to the catch part, if not it automatically prints a StackTrace 

//A throws declaration tells the code that a risky declaration is being called, and allows it to happen. It "handles" the exception. The throw
//declaration encounters an error and reacts to it by throwing an exception.

//The red code that shows up when an error has been made tells you where the problem is and how to solve it. 

//I prefer using try catch because instead of printing out a stackTrace and confusing the user, you can print out whatever you want the user to see
public class App {
	public static void main(String[] args) throws FileNotFoundException  {
		
		// Making a new file object. Make sure you add import
		File file = new File("test.txt");

		// FileReader object. Pass in the file object you made above. To fix the error
		// this time, hover mouse over the line with an error, and either put a throw
		// declaration or surround with try catch.

		// When I get the error from this, it says that the specified file, test.txt
		// couldn't be found. MAKE SURE you read the stack trace(red error in console)
		// from top to bottom. I put a throws declaration so the error got thrown out of
		// the main method. The throws declaration helps you find out what is the
		// problem in your line of code. 
		FileReader fr = new FileReader(file);

	}
}
