import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//This is the old way of reading files. However, you still can use the scanner instead, the more modern way. Using scanner class is easier
//However this type of reading files is very flexible and is useful to know.

//Steps for reading the file...
//STEP1: Create a file that you want to read
//STEP2: Create a file object, in brackets, but the name of the file you created in step 1, e.g test.txt. Add the import
//STEP3: Create a file reader object, in brackets putting name of file object you created in step 2, e.g file. Add the import. Surround try catch
//STEP4: Create BufferedReader object. In brackets put in name of FileReader object, e.g fr. Add import.
//STEP5: Create a String called anything, in this case line. Make it point to each line in the file in turn. 
//STEP6: Make line equal br.readLine();. Add another catch clause fo IOException e, if unable to read the file
//STEP7: Create the special while loop that I obviously know how to create. In brackets put...
// ((String Object = (BufferReader Object).readLine()) != null)
//STEP8: Inside the curly braces of while loop, simply put System.out.println(line);
//STEP9: Close the buffered reader OUTSIDE of the try catch 
//STEP10: Put the try catch where you close the buffered reader into a finally block below the two catch blocks

//THIS IS VERY IMPORTANT TO UNDERSTAND. WHEN YOU CREATE A VARIABLE IN JAVA, IT IS LIMITED TO ONLY BEING USED IN THE CURLY BRACKETS WHERE IT WAS 
//CREATED

//In future tutorial we will learn how to simplify the code below by a lot

public class App {

	public static void main(String[] args) {

		// Whenever reading files, you need to call on a file object. Unlike scanner,
		// you don't need a String at the start.
		File file = new File("test.txt");

		// Creating buffered reader outside try catch so I can close it outside the try
		// catch. Make sure you make it equal to null at the start so you won't get an
		// error. You need this because if there was a problem with file reader, then br
		// would have never been initialized and you can't close something that hasn't
		// been initialized yet. This will give a nullPointerException however
		BufferedReader br = null;

		// Creating file reader. This is a CheckedException, so you need to either throw
		// or surrond with try catch, which is better. Reading files also needs try
		// catch
		try {

			// File reader only lets you read a specific amount of characters each time, so
			// you need to add methods to make it read FULL lines. To save them in useful
			// bytes, you need to use buffered reader
			FileReader fr = new FileReader(file);

			// Initializing the buffered reader inside the try catch so I can use it inside
			// the try catch
			br = new BufferedReader(fr);

			// This is just a reference, doesn't need to be created. It will just point each
			// line in the file in turn
			String line;

			// Making while loop! Not intuitive but it works. This way is quite different.
			while ((line = br.readLine()) != null) {
				// Printing out the lines of the file, one at a time
				System.out.println(line);
			}
			  
			br.close();
			
		} catch (FileNotFoundException e) {

			// Saying the file wasn't found. file.toString presents it in a better way. It
			// is better to not put stack trace because stack traces can be quite
			// traumatizing
			System.out.println("File not found: " + file.toString());

		} catch (IOException e) {

			// Saying it couldn't read the file. It was able to open the file but for some
			// reason, unable to read the file.
			System.out.println("Unable to read file: " + file.toString());

		}
		// This finally block will always be executed, whether there is an exception or
		// not. It only won't be executed if the program stops working for some reason, 
		// like if there is bad code,or things that don't make sense, like writing 
		// sdfesdf in an empty line for no reason. It will run even if exceptoins are thrown.
		finally {

			// Closing the buffered reader OUTSIDE the try catch because it is better form.
			// Make sure you either add throws or even better, try catch. There will be a
			// nullPointerException, which is a runtime exception so it will be handled on
			// its own. However we are going to handle it cuz why not. If you want you
			// can just put a multicatch or just catch the main exception, Exception e.
			// Make sure you put this in the finally block. University courses tell you 
			// to put try catch for closed buffered reader in finally block
			try {
				br.close();
			} catch (IOException e) {
				System.out.println("Couldn't close file: " + file.toString());
			} catch (NullPointerException e) {
				// File was never opened
			}
			
		}

	}
}
