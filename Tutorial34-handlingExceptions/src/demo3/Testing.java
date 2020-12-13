package demo3;

public class Testing {

	public static void main(String[] args) {

		int i = 1;

		// This is a runtime exception because a number can't be divided by zero.
		// Runtime exceptions are automatically handled, but if wanted you can handle
		// them yourself in a try catch like shown below
		try {
			i = i / 0;

			// Always make sure you specify the exception you want to catch, if you don't
			// know which exception it is, just catch the ultimate exception, Exception e
		} catch (ArithmeticException e) {
			System.out.println("You CANNOT divide a number by zero.");
		}

		// If you didn't handle the runtime exception that was printed right above the
		// sysout below, this code would not have been ran. However, because you handled
		// it in a try catch, it will be ran like normal. The same does NOT apply for a
		// throws block
		System.out.println("Hi");
	}
}
