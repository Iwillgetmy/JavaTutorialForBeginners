package demo3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class App {
	public static void main(String[] args) {

		try {
			openFile();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Could not find file");
		}

	}

	// Because there is no app object or an instance in the class, the method should
	// be static
	public static void openFile() throws FileNotFoundException {

		File file = new File("test.txt");

		// This method can put a try catch and be done with or put a throws declaration.
		// However you will need to do that step again in the main method where you call
		// openFile
		FileReader fr = new FileReader(file);

	}
}