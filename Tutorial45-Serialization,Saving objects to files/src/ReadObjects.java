import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

//STEPS TO READ OBJECTS IN BINARY FORM TO NORMAL OBJECT
//STEP1: DO TRY WITH RESOURCES. IN BRACKETS FOR TRY PUT AN OBJECTINPUTSTREAM AND IN ITS BRACKETS, MAKE A NEW FILEINPUTSTREAM
//STEP2: IN BRACKETS OF FILEINPUTSTREAM ADD THE NAME OF THE FILE WHERE YOU STORED THE OBJECT NAMES
//STEP3: ADD ALL NECESSARY CATCH CLAUSES, FILENOTFOUND,IOEXCEPTION AND CLASSNOTFOUNDEXCEPTION
//STEP4: MAKE TWO RANDOM OBJECTS OF THE TYPE CLASS YOU STORED IN THE FILE YOU WANT TO READ. IN THE AFTER PART, WRITE THE OBJECTINPUTSTREAM OBJECT NAME
//.READOBJECT. MAKE SURE YOU CAST IT TO THE TYPE OBJECT YOU ARE READING. IF WANTED YOU CAN WRITE AS OBJECT AND YOU WON'T NEED CAST
//STEP5: SYSTEM.OUT.PRINTLN THE OBJECTS YOU CREATED IN STEP5, IF YOU FOLLOWED ALL THE STEPS CORRECTLY, THE OBJECTS YOU CREATED WILL SHOW UP.

//My program to read objects in binary form
public class ReadObjects {

	public static void main(String[] args) {

		// Saying that it is reading objects
		System.out.println("Reading objects...");

		// Nested try with resources
		try (ObjectInputStream ot = new ObjectInputStream(new FileInputStream("people.bin"))) {

			// Because this returns superclass object, you need to add a cast. If you don't
			// know what type class the object is, you can write superclass object at the
			// start. If you do that you don't need cast
			Object person1 = ot.readObject();
			Person person2 = (Person) ot.readObject();

			// This displays both objects in the file
			System.out.println(person1);
			System.out.println(person2);

		}
		// Exception for if the File wasn't found
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			// Exception if the file was unreadable
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			// Exception is if it might read a object of a class that doesn't even exist in
			// the program
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
	}
}