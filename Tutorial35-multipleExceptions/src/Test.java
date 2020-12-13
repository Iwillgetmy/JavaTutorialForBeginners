import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

//When you write inside a method that it throws an exception, you need to write a throws clause above and import the java.io.IOException
public class Test {

	// You need these throws exception because you wrote them down below. The
	// statement doesn't necessarily means that you will throw one of those
	// exceptions, but that you might if there is a problem in the code
	public void run() throws IOException, ParseException {

		// Throwing an exception throw new IOException(); An IO exception is if there
		// was an error in inputting or outputting something. E.G if you try to read a
		// file that doesn't exist, that is an IOException. It happens when there is a
		// problem inputting or outputting something

		// Throwing another exception. Parse exception checks if there was a failed
		// attempt to parse a String
		throw new ParseException("Error in command list...", 2);
	}

	// Throwing both an IOException and one of the subclasses of the IOException
	// exception
	public void input() throws IOException, FileNotFoundException {

	}
}
