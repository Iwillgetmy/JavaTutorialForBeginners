package Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Write {

	public static void main(String[] args) {

		try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("people.bin"))) {

			Person[] people = { new Person(1, "Sue"), new Person(2, "Bob"), new Person(3, "Sally") };
			ArrayList<Person> person = new ArrayList<Person>();
			person.add(new Person(5, "Harry"));
			person.add(new Person(6,  "Larry"));
			person.add(new Person(7, "Barry"));
			
			os.writeObject(people);
			os.writeObject(person);
			os.writeInt(person.size()-1);
			
			for (Person person1: person) {
				os.writeObject(person1);
			} 
			 
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
