package demo1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//Step 1: Open your file, go to properties, and copy the location
//Step 2: Make a String, name the String, and set it equal to the location of the file(make sure you replace backslashes with "frontslashes")
//Step 3: Make a file class, in brackets add the String that you created in step two. Cntrl-shift-o. 
//Step 4: Add scanner class. In brackets add the name of file object you created. Either throw declaration or add try catch. If you add try catch then
// make sure that in the catch section, do sysout file not found, or whatever suits your needs
//Step5: Create the for loop or while loop what suits your needs	

// **, when a line of code, or an integer, a String, etc... is read	

public class App {
	public static void main(String[] args) throws FileNotFoundException {

		// Finding file in file explorer
//		String fileName = "C:\\Users\\pkane\\Pictures\\Java Practice\\example.txt";

		// An easier way to do this is to drag the file from file explorer and drop it
		// in the folder. Click copy files then click enter. If you do that, you only
		// need to write this. Make sure the file is in route directory
		String fileName = "example.txt";

		// Making file object
		File textFile = new File(fileName);

		// Making scanner object. The item in brackets is what the scanner will scan
		Scanner in = new Scanner(textFile);
		Scanner in2 = new Scanner(textFile);

		// I put number at start, so this while loop will only read number at start
		// amount of lines.
		// in.nextInt reads the next Int in the file
		int value = in.nextInt();
		System.out.println("Read value: " + value);

//		int count = 1;
//
//		// While loop to read contents of the file	
//		// in.hasNextLine checks if there are more lines in the file. If it is false,
//		while (in.hasNextLine()) {
//
//			String gr = in2.nextLine();
//			
//			// Printing out line
//			System.out.println("Line " + count + ": " + gr);
//
//			count++;
//
//		}

		// Forloop to read exactly five lines of the file
		for (int i = 0; i < 5; i++) {

			// Printing out lines one at a time
			System.out.println(in2.nextLine());

		}

		// Closing scanner. Write scanner object name.close
		in.close();

		// Closing second scanner
		in2.close();
	}
}
