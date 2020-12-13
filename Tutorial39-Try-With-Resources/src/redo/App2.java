package redo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//Very simple way to read a file! Much better than how we read it without Try with resources. Went from about 108 lines to just 42 lines of code!

public class App2 {

	public static void main(String[] args) {

		// Making a file object. You cant instanstiate the file object in the try with
		// resources below because if not, you can't change the catch clause for the try
		// catch
		File file = new File("test.txt");

		// With try with resources, you can instanstiate filereader in bufferedreader.
		// This is way more efficient when used with Try With Resources
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {

			// This is just a reference, doesn't need to be created. It will just point each
			// line in the file in turn
			String line;

			// Making while loop! Not intuitive but it works. This way is quite different.
			while ((line = br.readLine()) != null) {
				// Printing out the lines of the file, one at a time
				System.out.println(line);
			}

		} catch (FileNotFoundException e) {
			System.out.println("Cant find file: " + file.toString());
		} catch (IOException e) {
			System.out.println("Couldn't read file: " + file.toString());
		}
	}

}
