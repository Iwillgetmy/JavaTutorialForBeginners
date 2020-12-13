import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

//Steps for reading files
//STEP1: Make the objects of any type of class
//STEP2: Do try with resources for a FileOutputStream object, but a text file name in the brackets
//STEP3: Create the ObjectOutputStream, in brackets put the FileOutputStream object. 
//STEP4: Surround with try catch. Catch both FileNotFound and IOException
//STEP5: Do os.writeObject, in brackets add in however many objects you want!
//STEP6: Make sure that the class of the objects you are creating implements Serializable

//My program to write objects in file
public class WriteObjects {

	public static void main(String[] args) {

		// Saying writing objects
		System.out.println("Writing objects...");

		// Creating objects of type person
		Person mike = new Person(543, "Mike");
		Person sue = new Person(123, "Sue");

		// Displaying instance data
		System.out.println(mike);
		System.out.println(sue);

		// Creating a FileOutputStream Object. FileOutputStream lets you stream data to
		// a file. Streaming mean sending data sequentially to a file. We are going to
		// use try with resources because FileOutputStream implements AutoCloseable
		try (FileOutputStream fs = new FileOutputStream("people.bin")) {

			// You need to pass the fileoutputstream to the objectoutputstream to stream
			// data to the file we are going to create
			ObjectOutputStream os = new ObjectOutputStream(fs);

			// Make sure that before this step, you make the class type of the object you
			// want to read implements Serializable!
			os.writeObject(mike);
			os.writeObject(sue);

			// Closing objectoutputstream
			os.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

	}

}
