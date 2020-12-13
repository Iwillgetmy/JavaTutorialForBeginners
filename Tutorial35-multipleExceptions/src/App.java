import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class App {

	// Throwing the exceptions because they are in the run method
	public static void main(String[] args) { // throws IOException, ParseException {
		Test test = new Test();

		// Now you are forced to handle the exceptions because those are in the method
		// You can either put a double throws declaration or do try catch that is double

		/*
		 * // //Either this if you want both exceptions to print out same thing. This
		 * can handle multiple exceptions, meaning that in the brackets, you can put 1,2
		 * or more exceptions // try { // test.run(); // } catch (IOException |
		 * ParseException e) { // // TODO Auto-generated catch block //
		 * e.printStackTrace(); // }
		 */

		/*
		 * //Or this if you want both exceptions to print out different things try {
		 * test.run(); } catch (IOException e) {
		 * System.out.println("Error in inputting/outputting"); } catch (ParseException
		 * e) { System.out.println("Couldn't find parse command file"); }
		 */

		// This try catch is like the multi try catch, but more special. It is better
		// because Exception is the parent class of all the exceptions. This means that
		// you only need that statement to cover all exceptions the program might have
		// this works due to polymorphism, where you can put a parent class in the place
		// of a child class. You can catch any exception by using a parent class in the
		// place of the child class. However this isn't as helpfull to see what the
		// problem is
		try {
			test.run();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// In here you would need to catch FileNotFoundException first because it is a
		// child class and if IOException is first, it would catch FileNotFoundException
		// because it is a child class

		try {
			test.input();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

//		 If I were to do the oposite way like this, it wouldn't even compile. It tells
//		 me that the bottom catch is useless because the code will never reach it
//		 because the parent class handles child classes due to polymorphism
//		try {
//			test.input();
//		} catch (IOException e) {
//			
//		} catch (FileNotFoundException e) {
//			
//		}

		// Test with try multicatch won't even put IOException |(or)
		// FileNotFoundException because the FileNotFoudnException isn't needed.
		// IOException handles FileNotFoundException anyways
		try {
			test.input();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}