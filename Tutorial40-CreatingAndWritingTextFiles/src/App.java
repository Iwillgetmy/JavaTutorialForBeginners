import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class App {

	// CreatingAnd writing tect files. First, copy paste the code from try with
	// resources, but take out file not found exception, and replace file and
	// buffered reader with writer. Also, take out all of the code inside.
	// Once you created lines, with the write method, refresh the folder and the
	// file will appear.

	public static void main(String[] args) {

		File file = new File("test.txt");

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
			bw.write("This is line 1");
			bw.newLine();
			bw.write("This is line 2");
			bw.newLine();
			bw.write("This is line 3");
			bw.newLine();
			bw.write("Last line.");

		} catch (IOException e) {
			System.out.println("Can't read file: " + file.toString());
		}

	}

}