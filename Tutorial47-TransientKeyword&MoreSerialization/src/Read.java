import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class Read {

	public static void main(String[] args) {

		try (ObjectInputStream os = new ObjectInputStream(new FileInputStream("test.ser"))) {

			Person person = (Person) os.readObject();
			// Now prints out id=0 because the id variable was declared transient. Because
			// count is a class level field(static), it will have a default value of zero.
			// Even if we set the static value to 88 in write value, it will print out zero
			// because static fields cannot be serialized because it doesn't make sense to
			// save a value to the specific class if it will have the same value for every
			// object of the class type that was created

			// Even if we cerated the person class with two constructors that have a sysout,
			// it won't run any of the contstructors because when you deserialize an object,
			// you don't want to run any of the constructors. All you want is an object that
			// has the field set to whatever they were when you serialized the object.
			System.out.println(person);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
