//You can create a new package by declaring it when creating a new class

package demo2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class App {

	public static void main(String[] args) {
		File file = new File("test.txt");

		// Another way to deal with this is using a try catch block. Pretty much what a
		// try catch block does is try the statement that is in the try part. However if
		// that code throws an exception or is an error, it will go to the catch part
		// and put code in there(like shown below) orlet the console put out a
		// stacktrace by writing e.printStackTrace. Note that code outside of the try
		// catch will still run like normal. You try the statement, you catch the error,
		// then you are done and go on with the rest of your code. If you do however
		// create the text file, it won't print out the catch part as there wouldn't be
		// a FileNotFOundException. A handy thing to do with a try catch is see what the
		// error message says, and re write that in a less confusing manner so the user
		// will not be confused
		try {
			FileReader fr = new FileReader(file);

			// This will not be executed if an exception is thrown
			System.out.println("Continuing");

		} catch (FileNotFoundException e) {
			// This code will say the file put if the FileReader wasn't found. The
			// .toString() at the end puts the file in a String representation
			System.out.println("File not found: " + file.toString());
		}

		// Code outside the try catch will still run because this is a checked
		// exception. If this were a runtime exception however, this code would have
		// not been written, unless you handled the runtime Exception with a try catch
		System.out.println("Finished");

	}
}