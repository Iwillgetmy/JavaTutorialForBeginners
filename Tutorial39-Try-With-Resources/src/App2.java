
//Instead of importing them all seperately why not just import the whole java.io import!
import java.io.*;

//STEP1: Create a BufferedReader object. Inside brackets make a new Filereader. Also create file object and put object in FileReader object.

public class App2 {

	public static void main(String[] args) {

		// Look how much smaller this code is compared to the code in the last
		// tutorial!, which had a nested try catch and whatnot
		File file = new File("test.txt");

		// Try with resources, making fileReader object in buffered reader object
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {

		} catch (FileNotFoundException e) {
			System.out.println("Can't find file: " + file);
		} catch (IOException e) {
			System.out.println("Unable to read file: " + file);
		}

	}
}
